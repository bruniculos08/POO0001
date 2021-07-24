import java.io.IOException;
import java.io.BufferedReader;
import java.net.ServerSocket;
import java.io.*;
import java.net.*;
import java.util.*;

public class Servidor {
    ServerSocket serverSocket;
    
    public Servidor() throws IOException { //throws IDException para ignorar excessao
        serverSocket = new ServerSocket(2984); //um servidor precisa de uma porta (socket)
    }
    
    public void waitConnection() throws IOException {
        do {
            Socket client = serverSocket.accept();
            MyThread processaClient = new MyThread(client);
            processaClient.start();
        } while (true);
    }

}
