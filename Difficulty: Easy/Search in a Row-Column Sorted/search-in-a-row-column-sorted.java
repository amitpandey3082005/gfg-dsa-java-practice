class Solution {
    public static boolean matSearch(int mat[][], int x) {
        
        // counting the rows an columns 
        int row = mat.length,col = mat[0].length;
        int i=0,j=col-1; // start with top right corner element 
        
        while(j>=0 && i<row){
            if(mat[i][j]>x){
                 // go to left 
                 j--;
            }else if(mat[i][j]<x){
                // go to right 
                i++;
            }else{
                return true;
            }
        }
        
        return false;
    }
}