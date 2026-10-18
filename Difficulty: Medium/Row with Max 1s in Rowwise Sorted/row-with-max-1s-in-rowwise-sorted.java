class Solution {
    public int rowWithMax1s(int[][] arr) {
        // code here
        int maxOneRow = -1;
        int maxOne =0;
        for(int i=0;i<arr.length;i++){
            int max = 0;
            for(int j=arr[0].length-1;j>=0;j--){
                if(arr[i][j] == 1){
                
                    max++;
                }
            }
            if(max > maxOne){
                maxOne = max;
                maxOneRow = i;
            }
        }
        
        return maxOneRow;
    }
};