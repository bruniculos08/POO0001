package model;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import presenter.RecebedorDeNome;

// * 1. Fazer Conexao.
// * 2. Escrever a requisicao.
// * 3. Ler a resposta.
// * 4. Fechar a Conexao.

public class OMDBReceiver {
    private Socket socket;  // Socket (objeto para fazer conexões de rede)

    public void fazerConexao() throws IOException, UnknownHostException {
        socket = new Socket("www.omdbapi.com", 80); //associa o objeto socket à um socket ligado ao site OMDB na porta 80
    }                                                       

    public void fecharConexao() throws IOException {        
        socket.close();    // Desliga o socket
    }

    public void escreverARequisicao(ArrayList<String> requisicao) throws IOException { 
        PrintStream ps = new PrintStream(socket.getOutputStream()); // A classe printstream é para objetos (nesse caso o "ps") que
                                                                    // ... enviarão um print à uma saída (nesse caso à saída do socket)        
        for(String item : requisicao){                  
            ps.println(item);                                       // Objeto da classe printstream "ps" envia a string "requisicao" à sua saída
        }
        ps.println();
    }

    public String lerAResposta() {
        String response = null;                            // Objeto string nulo
        try { 
           response = lendoDoSocketUsandoBufferedReader(); // Ler à ultima resposta do servidor e coloca-lá dentro da
                                                           // ...string response
        } catch (IOException e) {      
            // Se não ler à resposta (Excessão) do servidor printa a seguinte mensagem
            System.out.println("Erro na leitura da resposta: " + e.getMessage());
        }
        
        return response;    
    }

    private String lendoDoSocketUsandoBufferedReader() throws IOException {
        InputStreamReader ir = new InputStreamReader(socket.getInputStream()); //objeto recebe o que o servidor envia (entrada)
        BufferedReader br = new BufferedReader(ir); // buffer le e armazena em linhas, inputstreamreader le e recebe
        return lerLinhas(br);
        
    }

    private String lerLinhas(BufferedReader br) throws IOException{
        String response = "";
        String line = br.readLine(); // le as linhas armazenadas no BufferedReader e passa pra String response
        while (line != null) {
            response += line;
            response += "\n";
            line = br.readLine();
        }
        response = ajustarResponse(response);
        return response; 
    }

    private String ajustarResponse(String response) throws IOException {
        int startResponse = response.indexOf('{');
        response = response.substring(startResponse);
        return response;
    }

}