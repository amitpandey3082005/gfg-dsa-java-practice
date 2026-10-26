class Solution {
    void interchangeRows(int[][] mat) {
     // traversal columnwise     
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