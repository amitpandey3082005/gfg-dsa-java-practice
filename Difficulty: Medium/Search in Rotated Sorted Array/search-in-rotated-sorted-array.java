class Solution {
    int search(int[] arr, int key) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) return mid;

            // Case 1: Left half is sorted
            if (arr[left] <= arr[mid]) {
                
                if (key >= arr[left] && key < arr[mid]) {
                    right = mid - 1; 
                } else {
                    left = mid + 1; 
                }
            } 
            // Case 2: Right half is sorted
            else { 
              
                if ( key <= arr[right] && key > arr[mid]) {
                    left = mid + 1;  
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}
