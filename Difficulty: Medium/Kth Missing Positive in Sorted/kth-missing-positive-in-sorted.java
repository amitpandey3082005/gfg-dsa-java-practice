class Solution {
    public int kthMissing(int[] arr, int k) {
       int left = 0, right = arr.length;

       while (left < right) {
           int mid = left + (right - left) / 2; 

           // calculate the missing number till mid index 
           int missing = arr[mid] - (mid + 1);

           if (missing < k) {
              left = mid + 1; // traverse right half 
           } else {
               right = mid;   
           }
       }

       return left + k;
    }
}
