class Solution {
    // Helper function jo direct boolean return karega
    private static boolean checkSubset(int[] arr, int targetSum, int currentSum, int idx) {
       // Base case 
       if(currentSum==targetSum) return true;
       if(idx==arr.length || currentSum>targetSum) return false;
       
       // pick recursion 
       if(checkSubset(arr,targetSum,currentSum+arr[idx],idx+1)) return true;
       else return checkSubset(arr,targetSum,currentSum,idx+1);
    }

    static boolean isSubsetSum(int arr[], int sum) {
        // Base function ko call kiya: starting sum = 0, starting index = 0
        return checkSubset(arr, sum, 0, 0);
    }
}
