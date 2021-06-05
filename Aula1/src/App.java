import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String nome;
        int x = 10;
        System.out.println("Print Your Name: "); // vs code ou intellij
        Scanner scan = new Scanner(System.in);
        nome = scan.nextInt();
        System.out.println("Hello, World " + nome); //não há funções em linguagem orientada a objeto
                                             //apenas objetos executam ações; 
                                             //nesse caso o objeto System realiza a ação println
                                             //essa ação é realizada através da saída padrão out (tela)
    }
}