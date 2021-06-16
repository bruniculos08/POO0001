import java.util.Scanner;
public class App {
    public static void main(String[] args){
        int V[] = new int[10]; //* cria um vetor de inteiro de nome V de tamanho 10
        int U[] = new int[10]; //* cria um vetor de inteiro de nome V de tamanho 10
        int T[] = new int[10]; //* cria um vetor de inteiro de nome T de tamanho 10

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2*(V.length); i++) {
            if (i<10) {
                System.out.printf("Type the number of V[%d]: ", i);
                V[i] = scanner.nextInt();
            }
            else {
                System.out.printf("Type the number of U[%d]: ", i);
                U[i-10] = scanner.nextInt();
            }
        }
        Criarvetor criar = new Criarvetor(); //* cria um objeto da classe Criarvetor chamado "criar"
        T = criar.createVector(V, U); //* atribui ao vetor T um vetor criado pelo método createVector() do objeto "criar"
    
        Ordenarvetor ordenar = new Ordenarvetor();
        T = ordenar.ordVector(T); 


        for (int i = 0; i < T.length; i++){
            System.out.printf(" T[%d] = %d", i, T[i]);
        }
    }
}
