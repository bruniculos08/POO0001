import java.util.List;
public class App {                           //& Mensagem pra quem for corrigir:
    public static void main(String[] args) { //* só pra avisar, fiz o(s) exercicio(s) do jeito mais "complicado"...
        int A[] = {1, 2, 3, 4, 5, 6, 7, 8};  //* ... para treinar melhor sobre classes e etc.
        int B[] = {2, 4, 5, 7, 8, 10, 11, 14};
        int n = A.length;

        Conjuntos vectorA = new Conjuntos(A);
        Conjuntos vectorB = new Conjuntos(B);
        Operacao operacao = new Operacao();
        List<Integer> interseccao = operacao.interseccaoConjuntos(vectorA.mostrarElementos(), vectorB.mostrarElementos());
        List<Integer> union = operacao.uniaoConjuntos(vectorA.mostrarElementos(), vectorB.mostrarElementos());
        List<Integer> soma = operacao.somaVetores(vectorA.mostrarElementos(), vectorB.mostrarElementos());
        List<Integer> diferencaAB = operacao.diferencaVetores(vectorA.mostrarElementos(), vectorB.mostrarElementos());
        List<Integer> diferencaBA = operacao.diferencaVetores(vectorB.mostrarElementos(), vectorA.mostrarElementos());
        System.out.printf("A interseccao B: ");
        for (Integer i : interseccao) {
            System.out.printf("%d ", i);
        }
        System.out.printf("\nA uniao B = ");
        for (Integer i : union ){
            System.out.printf("%d ", i);
        }
        System.out.printf("\nA + B = ");
        for (Integer i : soma){
            System.out.printf("%d ", i);
        }
        System.out.printf("\nA - B = ");
        for (Integer i : diferencaAB){
            System.out.printf("%d ", i);
        }
        System.out.printf("\nB - A = ");
        for (Integer i : diferencaBA){
            System.out.printf("%d ", i);
        }
    }
}
