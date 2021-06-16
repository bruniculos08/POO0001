public class App {
    public static void main(String[] args) {
        int A[][] = {{11, 12, 13, 14, 15}, {21, 22, 23, 24, 25}, {31, 32, 33, 34, 35}, {41, 42, 43, 44, 45}, {51, 52, 53, 54, 55}};
        int B[][] = {{110, 120, 130, 140, 150}, {210, 220, 230, 240, 250}, {310, 320, 330, 340, 350}, {410, 420, 430, 440, 450}, {510, 520, 530, 540, 550}};
        int C[][] = new int[5][5];

        Matrices matrix = new Matrices();
        C = matrix.createMatrix(A, B);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("");
            for (int j = 0; j < 5; j++) {
                System.out.printf("%d ", C[i][j]);
            }
        }

    }
}
