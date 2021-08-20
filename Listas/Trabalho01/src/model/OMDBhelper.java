package model;
import presenter.RecebedorDeNome;
import presenter.RecebedorDeDados;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

public class OMDBHelper {
    private ArrayList<String> requisicao;
    private OMDBReceiver receiver;                      // Objeto para receber e enviar (OMDBReceiver)

    public void requisitarDadosDoFilme(String nomeDoFilme) {
            montarRequisicao(nomeDoFilme);
            enviarRequisicao();
            lerARespostaAoEnvio();                     
    }

    public void montarRequisicao(String nomeDoFilme) {
        requisicao = new ArrayList<String>();           // Requisição escrita em formato String de JSON
        requisicao.add("GET /?t=" + nomeDoFilme + "&apikey=d5077079 HTTP/1.0");
        requisicao.add("Host: www.omdbapi.com");
    }

    public void enviarRequisicao(){
        try {                                           
            receiver = new OMDBReceiver();              // Tenta executar as seguintes operações da classe OMDBreceiver
            receiver.fazerConexao();                
            receiver.escreverARequisicao(requisicao);  
        } catch (IOException e) {                       // Em caso de ocorrência de erro na execução de algum dos métodos
            e.printStackTrace();                        // ... printa o erro
        }        
    }

    public void lerARespostaAoEnvio(){
        try {
            String response = receiver.lerAResposta();
            receiver.fecharConexao();
            System.out.println(response);
        } catch (IOException e) {
            e.printStackTrace();
        }
        RecebedorDeDados recebedorDeDados = new RecebedorDeDados();
    }
}