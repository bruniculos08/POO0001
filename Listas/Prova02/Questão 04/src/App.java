import javax.swing.*; //* asterisco importa tudo de uma biblioteca
import java.awt.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Teste inciando");
        ArmazenaListener.getInstance();
        new Janela();
        new Contador();
        ArmazenaListener.chamaContadores();
        System.out.println("Teste terminando");
    }
}