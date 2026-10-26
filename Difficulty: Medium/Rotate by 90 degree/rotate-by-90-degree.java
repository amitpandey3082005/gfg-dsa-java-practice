class Solution {
    public void rotateMatrix(int[][] mat) {
        // calculating the tranpose
        for(int i=1;i<mat.length;i++){ // row traverse 
            for(int j=0;j<=i;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
       // column swapping is used 
       for(int j=0;j<mat[0].length;j++){
           int rowStart=0,rowEnd=mat.length-1;
           while(rowStart<=rowEnd){
               int temp = mat[rowStart][j];
               mat[rowStart][j] = mat[rowEnd][j];
               mat[rowEnd][j] = temp;
               rowStart++;
               rowEnd--;
           }
       }
       
    }
}