import java.util.ArrayList;
public class Operacao {
    public ArrayList<Integer> interseccaoConjuntos(int A[], int B[]){
        ArrayList<Integer> resultados = new ArrayList<Integer>();
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < B.length; j++){
                if (B[j] == A[i]) resultados.add(B[j]);
            }
        }
        return resultados;
    }
    public ArrayList<Integer> uniaoConjuntos(int A[], int B[]){
        ArrayList<Integer> resultados = new ArrayList<Integer>();
        for (int i = 0; i < A.length; i++) { 
            resultados.add(A[i]);
        }
        for (int j = 0; j < B.length; j++) {
            if (resultados.contains(B[j]) == false) resultados.add(B[j]);
        }
        return resultados;
    }
    public ArrayList<Integer> somaVetores(int A[], int B[]){
        ArrayList<Integer> resultados = new ArrayList<Integer>();
        for (int i = 0; i < A.length; i++) {
            resultados.add(A[i]+B[i]);
        }
        return resultados;
    }
    public ArrayList<Integer> diferencaVetores(int A[], int B[]){
        ArrayList<Integer> resultados = new ArrayList<Integer>();
        for (int i = 0; i < A.length; i++) {
            resultados.add(A[i]-B[i]);
        }
        return resultados;
    }
}
