public class Transposta {
    public double[][] matrizTransposta(double P[][], int i, int j) {
        double matriz[][] = new double[j][i];
        for(int k = 0; k < j; k++){
            for (int l = 0; l < i; l++){
                matriz[k][l] = P[l][k];
            }
        }        
        return matriz;
    }
}
