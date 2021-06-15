public class Criarvetor {
    public int[] createVector (int V[], int U[]) {
        int T[] = new int[10];
        for (int i = 0; i < 10; i++){
            if (V[i]%2 == 0 && U[i]%2 == 0) T[i] = V[i] + U[i];
            else if (V[i]%2 != 0 && U[i]%2 != 0) T[i] = V[i] - U[i];
            else T[i] = V[i]*U[i];
        }
        return T;
    }
}