import java.util.Scanner;
public class App {
    public static void main(String[] args){
        int n;
        System.out.println("Type the number of terms: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        Fibonacci fib = new Fibonacci(n);
        fib.imprimeSerie();
        System.out.println("");
        fib.imprimeSoma();

    }
}
