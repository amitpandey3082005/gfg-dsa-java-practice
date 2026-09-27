class Solution {
    static boolean equalPartition(int arr[]) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        // if sum is odd then it can not be partioned into equal subset 
        if (totalSum % 2 != 0) {
            return false;
        }

        int target = totalSum / 2;

      
        boolean[] dp = new boolean[target + 1];

   
        dp[0] = true;

     
        for (int num : arr) {

            for (int j = target; j >= num; j--) {
                if (dp[j - num]) {
                    dp[j] = true;
                }
            }
        }

    
        return dp[target];
    }
}
