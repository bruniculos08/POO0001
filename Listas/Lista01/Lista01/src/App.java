import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        System.out.println("number =" + n);
        Primo q = new Primo(n);
        if (q.verify(n) == 0) {
            System.out.println("eh primo.");
        }
        else {
            System.out.println("nao eh primo.");
        }
    }
}
