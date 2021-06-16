public class Ordenarvetor {
    public int[] ordVector (int P[]) {
        int temp;
        for (int i = P.length-1; i >= 0; i--){
            for (int j = i; j >= 0; j--){
                if (P[j] > P[i]){
                    temp = P[j];
                    P[j] = P[i];
                    P[i] = temp;
                }
            }
        }
        return P;
    }   
}