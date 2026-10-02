class Solution {
    public static int subarraySum(int[] arr) {
        long totalSum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            
            long frequency = (long) (i + 1) * (n - i);
            totalSum += arr[i] * frequency;
        }

        return (int)totalSum;
    }
}
