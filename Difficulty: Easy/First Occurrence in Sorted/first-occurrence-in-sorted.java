class Solution {
    public int firstSearch(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;
        int idx = -1;

        while (left <= right) {
            
            int mid = left + (right - left) / 2;

            if (arr[mid] == k) {
                idx = mid;          
                right = mid - 1;    
            } else if (arr[mid] > k) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return idx;
    }
}
