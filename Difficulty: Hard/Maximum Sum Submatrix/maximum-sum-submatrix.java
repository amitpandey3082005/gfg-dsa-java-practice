class Solution {
    public int maxRectSum(int mat[][]) {
        int rows = mat.length;
        int cols = mat[0].length;
        int maxSum = Integer.MIN_VALUE;
        
        // traverse each column leftwise 
        for (int i = 0; i < cols; i++) {
            int[] rowSums = new int[rows];
            
            // start from left and traverse to column  
            for (int j = i; j < cols; j++) {
                // adding each row 
                for (int r = 0; r < rows; r++) {
                    rowSums[r] += mat[r][j];
                }

                int currentMax = kadane1D(rowSums);

                if (currentMax > maxSum) {
                    maxSum = currentMax;
                }
            }
        }
        return maxSum;
    }
    // Adding helping function of the kadane Algorithm in 1D Array 
    private int kadane1D(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if (currSum > maxSum) {
                maxSum = currSum;
            }

            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
}
