import java.io.IOException;
import java.io.BufferedReader;
import java.net.ServerSocket;
import java.io.*;
import java.net.*;
import java.util.*;

public class MyThread extends Thread{ //Este é a parte do servidor que fica respondendo
    public MyThread(Socket socket) {

    }

    public void run() {
        try {
            this.speakToClient(); //
        } catch (IOException e) {
            System.out.println("Exeception in Thread");
        }
    }


    public void speakToClient() {
        Socket client = serverSocket.accept(); //listener (ouvido) do servidor, que aceitara a conexao
        InputStream lerDoClient = client.getInputStream(); //recebendo String do client 
        OutputStream escreverParaOClient = client.getOutputStream(); //respondendo algo para o client
        //Lendo o pedido do client:
        BufferedReader br = new BufferedReader(new InputStreamReader(lerDoClient)); //armazenar as linhas enviadas(println) pelo cliente
        String request = br.readLine(); //cada linha é uma String (request só nome de pedido do client)
        String response = "invalid";
        if(request.equalsIgnoreCase("getName")){
            response = "teste";
        }
        //respondendo o client:
        PrintStream printStream = new PrintStream(client.getOutputStream()); // classe PrintStream é para objeto que envia print qual vai ser enviado pela saída (o argumento)
        printStream.println(response); // objeto realiza a função de println que vai ser enviada em sua saída
    }


}
