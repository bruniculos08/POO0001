import java.util.Scanner;
import java.util.List;

class Main{

public static void main(String[] args){           //* esta linha equivale ao int main(void) em C
        Scanner scanner = new Scanner(System.in); //* cria o objeto scanner para ler um input
        int a, b;
        a = scanner.nextInt(); //* faz objeto scanner receber um input de inteiro armazenando este em "a"
        b = scanner.nextInt(); //* faz objeto scanner receber um input de inteiro armazenando este em "b"

        //& Processamento
        NumeroPrimo primo = new NumeroPrimo();                    //* cria um objeto chamado primo e da classe NumeroPrimo
        List<Integer> listaDeNumeros = primo.getPrimosEntre(a,b); //* essa linha retorna os primos entre "a" e "b" para Lista "numeros"
        //^ cria objeto List (de lista, uma classe em java): List <TipoClasse> nome
        //^ a classe "Integer" representa o tipo int



        //& Impressão
        System.out.println("Os numeros primos sao: "); //* o objeto System imprime como saída(out)...
        for (Integer numero : listaDeNumeros){         //* percorre a lista chamando o elemento da posição atual na lista de "numero"
            System.out.println(numero);                //* imprime cada elemento
        }
    }
}

/* public class App {
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
} */
