package model;

import java.io.IOException;

/**
 * Requisitar os dados do filme.
 *
 *   type: 'GET',
 *                 dataType: 'text',
 *                 url: '/?' + c + '&token=' + t,
 */


public class OMDBhelper {
    public void requisitarDadosDoFilme(String nomeDoFilme) {
        String requisicao = "GET / HTTP/1.1\n" +
                "url: /?t=" + nomeDoFilme + "&apikey=aqui vai a sua key." ; // requisição escrita em formato JSON

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