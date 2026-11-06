class Solution {
    // Helper function jo direct boolean return karega
    private static boolean checkSubset(int[] arr, int targetSum, int currentSum, int idx) {
       
        if (currentSum == targetSum) {
            return true;
        }

        // Base Case 2: Agar array khatam ho gaya ya currentSum target se bada ho gaya (sirf positive numbers ke liye)
        if (idx == arr.length || currentSum > targetSum) {
            return false;
        }

        // Recursive Case:
        // 1. Pick karne ka decision (Element ko sum me add kiya)
        boolean pick = checkSubset(arr, targetSum, currentSum + arr[idx], idx + 1);

        // if sum is eul to target sum then no need of skip 
        if (pick) return true;

        // 2. Skip karne ka decision (Element ko sum me add nahi kiya)
        boolean skip = checkSubset(arr, targetSum, currentSum, idx + 1);

        return skip;
    }

    static boolean isSubsetSum(int arr[], int sum) {
        // Base function ko call kiya: starting sum = 0, starting index = 0
        return checkSubset(arr, sum, 0, 0);
    }
}
