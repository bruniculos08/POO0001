import javax.swing.*; //* asterisco importa tudo de uma biblioteca
import java.awt.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Teste inciando");
        ArmazenaListener.getInstance();
        new Janela();               

        // (Resultados no terminal descritos ao lado ou em baixo)

        Contador i = new Contador(); // observador adicionado a lista
        Contador j = new Contador(); // observador adicionado a lista

        ArmazenaListener.chamaContadores(); 
        // Ocorreu alteracao no contador para: 0
        // Ocorreu alteracao no contador para: 0

        i.decrementarValor();
        // Ocorreu alteracao no contador para: -1
        j.incremetarValor();         
        // Ocorreu alteracao no contador para: 1
        
        System.out.println("Teste terminando");
    }
}