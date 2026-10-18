class Solution {
    public static int[] rowSum(int mat[][]) {
        // Code here
        int[] arr = new int[mat.length];
        int k=0;// for 0th index of this new Array 
        for(int i=0;i<mat.length;i++){
            int sum =0;
            for(int j=0;j<mat[0].length;j++){
                sum+=mat[i][j];
            }
            arr[k++] = sum;
        }
        
        return arr;
    }
}