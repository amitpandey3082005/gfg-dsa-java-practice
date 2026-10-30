class Solution {
    public void rotateMatrix(int[][] mat) {
        int n = mat.length;

        // 1. Find the transpose of the matrix (Aapka logic sahi hai)
        for(int i = 0; i < n; i++) { 
            for(int j = 0; j <= i; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        int startRow = 0;
        int endRow = n - 1;

        while (startRow < endRow) {
           // swap row 
            int[] temp = mat[startRow];
            mat[startRow] = mat[endRow];
            mat[endRow] = temp;

            startRow++;
            endRow--;
        }
    }
}
