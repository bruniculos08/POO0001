import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

import model.OMDBhelper;
import model.OMDBreceiver;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        OMDBhelper receiver = new OMDBhelper();
        
        
        
        
        receiver.requisitarDadosDoFilme("Pulp+Fiction");
    }
}