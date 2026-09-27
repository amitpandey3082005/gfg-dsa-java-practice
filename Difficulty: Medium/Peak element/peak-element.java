class Solution {
    public int peakElement(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

          
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } 
         
            else {
                right = mid;
            }
        }

        return left; // return index of the peak element 
    }
}
