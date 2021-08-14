package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayList;
/**
 * Requisitar os dados do filme.
 *
 *   type: 'GET',
 *                 dataType: 'text',
 *                 url: '/?' + c + '&token=' + t,
 */


public class OMDBhelper {
    public void requisitarDadosDoFilme(String nomeDoFilme) {
        ArrayList<String> requisicao = new ArrayList<String>(1);// requisição escrita em formato JSON
        
        requisicao.add("GET /?t=" + nomeDoFilme + "&apikey=138637f6 HTTP/1.0");
        requisicao.add("Host: www.omdbapi.com");

        for(String s : requisicao) {
            System.out.println(s);
        }
        System.out.println();

        OMDBreceiver manager = new OMDBreceiver(); // cria um objeto para receber e enviar (OMDBreceiver)
        try {                                      // tenta executar as seguintes operações da classe OMDBreceiver
            manager.fazerConexao();                
            manager.escreverARequisicao(requisicao);    
            String response = manager.lerAResposta();
            manager.fecharConexao();

            System.out.println("TESTE: " + response);

        } catch (IOException e) {                 // em caso de ocorrência de erro na execução de algum dos métodos
            e.printStackTrace();                  // printa o erro
        }
    }
}