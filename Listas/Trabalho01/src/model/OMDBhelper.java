package model;
import presenter.RecebedorDeNome;
import presenter.RecebedorDeDados;

import java.awt.*;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class OMDBHelper {
    private ArrayList<String> requisicao;
    private RecebedorDeDados recebedorDeDados;
    private  OMDBHelperListener1 omdbHelperListener1;
    private String nomeDoFilme;
    private OMDBReceiver receiver = new OMDBReceiver();
    private PosterHelperListener1 posterHelperListener1;
    private PosterHelper posterHelper;

    private Runnable runnable1 = new Runnable() {
        @Override
        public void run() {
            if(nomeDoFilme != null){
                String dadosDoFilme = requisitarDadosDoFilme(nomeDoFilme);
                recebedorDeDados = new RecebedorDeDados();
                String dadosNull = "{\"Response\":\"False\",\"Error\":\"Movie not found!\"}\n";
                if (!dadosDoFilme.equalsIgnoreCase(dadosNull)) {
                    omdbHelperListener1 = new OMDBHelperListener1(recebedorDeDados);
                    omdbHelperListener1.chegaramOsDadosDoFilme(dadosDoFilme);
                    (new Thread(runnable2)).start();
                    posterHelperListener1 = new PosterHelperListener1(recebedorDeDados);
                } else {
                    recebedorDeDados.EnviarDadosParaTelaSemPoster("Not found the movie");
                }
                Thread.currentThread().stop();
            }
        }
    };

    private Runnable runnable2 = new Runnable() {
        @Override
        public void run() {
            posterHelper = new PosterHelper(recebedorDeDados.posterUrl);
            posterHelper.requestPoster();
            while (posterHelper.poster == null){
                try {
                    System.out.println("Loading poster...");
                    if (recebedorDeDados.encerrandoSegundaThread == true){
                        Thread.currentThread().stop();
                    }
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            posterHelperListener1.chegouOPoster(posterHelper.poster);
            Thread.currentThread().stop();
        }
    };

    public void iniciarRequisitarDados(String nomeDoFilme) {
        this.nomeDoFilme = nomeDoFilme;
        (new Thread(runnable1)).start();
    }

    public String requisitarDadosDoFilme(String nomeDoFilme) {
            montarRequisicao(nomeDoFilme);
            OMDBReceiver receiver = new OMDBReceiver();
            enviarRequisicao(receiver);
            String response = lerARespostaAoEnvio(receiver);
            return response;
    }

    public void montarRequisicao(String nomeDoFilme) {
        requisicao = new ArrayList<String>();           // Requisição escrita em formato String de JSON
        requisicao.add("GET /?t=" + nomeDoFilme + "&apikey=d5077079 HTTP/1.0");
        requisicao.add("Host: www.omdbapi.com");
    }

    public void enviarRequisicao(OMDBReceiver receiver){
        try {                                           // Tenta executar as seguintes operações da classe OMDBreceiver
            receiver.fazerConexao();                
            receiver.escreverARequisicao(requisicao);  
        } catch (IOException e) {                       // Em caso de ocorrência de erro na execução de algum dos métodos
            e.printStackTrace();                        // ... printa o erro
        }        
    }

    public String lerARespostaAoEnvio(OMDBReceiver receiver){
        String response = null;
        try {
            response = receiver.lerAResposta();
            receiver.fecharConexao();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }
}