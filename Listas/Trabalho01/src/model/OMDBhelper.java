package model;
import presenter.RecebedorDeNome;
import presenter.RecebedorDeDados;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

public class OMDBHelper {
    private ArrayList<String> requisicao;
    //private OMDBReceiver receiver;                      // Objeto para receber e enviar (OMDBReceiver)
    private String nomeDoFilme;

    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            if(nomeDoFilme != null){
                OMDBReceiver receiver = new OMDBReceiver();
                String dadosDoFilme = requisitarDadosDoFilme(nomeDoFilme);
                RecebedorDeDados recebedorDeDados = new RecebedorDeDados(dadosDoFilme);
            }
        }
    };

    public void iniciarRequisitarDados(String nomeDoFilme) {
        this.nomeDoFilme = nomeDoFilme;
        (new Thread(runnable)).start();
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
            return response;
            //RecebedorDeDados recebedorDeDados = new RecebedorDeDados(response);
            //System.out.println(response);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }
}