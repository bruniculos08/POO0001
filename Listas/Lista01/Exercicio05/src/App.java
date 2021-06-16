import java.util.Random;
public class App {
    public static void main(String[] args) {
        Random generator = new Random();
        int l = 3;
        int k = 4;
        double A[][] = new double[l][k];
        double B[][] = new double[l][k];
        double C[][] = new double[l][k];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                A[i][j] = generator.nextDouble();
                B[i][j] = generator.nextDouble();
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        
        Transposta transposta = new Transposta();
        C = transposta.matrizTransposta(C, l, k);
        for (int i = 0; i < k; i++){
            System.out.printf("\n");
            for (int j = 0; j < l; j++){
                System.out.printf("%f ", C[i][j]);
            }
        }
    }
}