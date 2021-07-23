import java.io.IOException;
import java.io.BufferedReader;
import java.net.ServerSocket;
import java.io.*;
import java.net.*;
import java.util.*;

public class AppClient {
    public static void main(String[] args){
        try {
            Socket conection = new Socket("192.168.0.153",2984); //cria conexão com o servidor ("IP", Porta)
            InputStream lerDoServidor = conection.getInputStream(); //objeto recebe o que o servidor envia (entrada)
            OutputStream escreverParaOServidor = conection.getOutputStream(); //objeto envia para o servidor (saída)

            PrintStream ps = new PrintStream(escreverParaOServidor); // classe PrintStream é para objeto que envia print qual vai ser enviado pela saída (o argumento)
            ps.println("GetName"); // objeto realiza a função de println que vai ser enviada em sua saída

            BufferedReader br = new BufferedReader(new InputStreamReader(lerDoServidor)); // buffer le e armazena em linhas, inputstreamreader le e recebe e inputstream apenas recebe
            String line = br.readLine(); // objeto recebe a linha (que o servidor enviou) lida pelo buffer
            System.out.println("Servidor: " + line);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

