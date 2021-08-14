/* o try tenta executar um código e se der erro ele executa o catch
*/

package model;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

/**
 * 1. Fazer Conexao.
 * 2. Escrever a requisicao.
 * 3. Ler a resposta.
 * 4. Fechar a Conexao.
 */

public class OMDBreceiver {
    private Socket socket; // cria um socket (objeto para fazer conexões de rede)

    public void fazerConexao() throws IOException, UnknownHostException {
        socket = new Socket("www.omdbapi.com", 443); //associa o objeto socket à um socket ligado ao site OMDB 
    }                                                       // na porta 80

    public void fecharConexao() throws IOException {        // desliga o socket
        socket.close();
    }

    public void escreverARequisicao(ArrayList<String> requisicao) throws IOException { 
        PrintStream ps = new PrintStream(socket.getOutputStream());
        // a classe printstream é para objetos (nesse caso o "ps") que enviarão um print à uma saída (nesse caso à saída do socket,
        // socket.getOutputStream();)       
        for(String item : requisicao){
            ps.println(item);
        }
        ps.println();
        // o objeto da classe printstream "ps" envia a string "requisicao" à sua saída                                                        
    }

    public String lerAResposta() {
        String response = null; // cria um objeto string nulo
        try { 
           response = lendoDoSocketUsandoBufferedReader(); // tenta ler à ultima resposta do servidor e coloca-lá dentro da
           // string response
        } catch (IOException e) {      
            // caso não consiga ler à resposta do servidor printa a seguinte mensagem
            System.out.println("Erro na leitura da resposta: " + e.getMessage());
        }
        return response;    
    }

    private String lendoDoSocketUsandoBufferedReader() throws IOException {
        InputStreamReader ir = new InputStreamReader(socket.getInputStream()); //objeto recebe o que o servidor envia (entrada)
        BufferedReader br = new BufferedReader(ir); // buffer le e armazena em linhas, inputstreamreader le e recebe
        String response = br.readLine(); // le as linhas armazenadas no BufferedReader e passa pra String response
        return response;   
    }
}