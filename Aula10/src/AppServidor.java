import java.io.IOException;
public class AppServidor {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        Servidor s = null;
        try {
            s = new Servidor();
            s.run();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
