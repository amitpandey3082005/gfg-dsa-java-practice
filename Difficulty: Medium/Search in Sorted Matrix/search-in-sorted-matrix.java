class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
       // handle edge case when matrix is null or 0 rows or 0 columns 
       if(mat == null || mat.length==0 || mat[0].length==0) return false;
       
       int row = mat.length,col=mat[0].length;
       int left = 0,right=row*col-1;
       
       while(left<=right){
           int mid = left +(right-left)/2;
           
           int midrow = mid/col;
           int midcol = mid%col;
           
           if(mat[midrow][midcol] == x){
               return true;
           }else if (mat[midrow][midcol] >x){
               right = mid-1;
           }else{
               left = mid+1;
           }
       }
       
       return false;
    }
}
