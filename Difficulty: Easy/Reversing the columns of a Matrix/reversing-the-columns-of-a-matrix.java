class Solution {
    // Function to reverse the columns of a matrix.
    static void reverseCol(int matrix[][]) {
        
        // trvaersing each row 
        for(int i=0;i<matrix.length;i++){
          int j=0,k=matrix[0].length-1;
          while(j<=k){
              int temp = matrix[i][j];
              matrix[i][j] = matrix[i][k];
              matrix[i][k] = temp;
              k--;
              j++;
          }  
          
        }
        
    }
}
