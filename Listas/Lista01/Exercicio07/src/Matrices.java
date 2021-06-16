public class Matrices {
    public int[][] createMatrix(int A[][], int B[][]){
        int matrix[][] = new int[5][5];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++)
            if (j >= i) {
                matrix[i][j] = A[i][j];
            }
            else matrix[i][j] = B[i][j];
        }
        return matrix;
    }
}
