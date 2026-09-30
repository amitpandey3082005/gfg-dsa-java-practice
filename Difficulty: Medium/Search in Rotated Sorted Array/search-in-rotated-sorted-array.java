class Solution {
    int search(int[] arr, int key) {
        // code here
        int left = 0,right = arr.length-1;
        
        while(left<=right){
             int mid = left + (right-left)/2;
             
             if(arr[mid]== key) return mid;
          
            // check left half sorted or not and if sorted check key lies in it or not 
            if (arr[left] <= arr[mid]) {
               // checking in left half
                if (key >= arr[left] && key < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }else {
                if (key > arr[mid] && key <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        
        return -1;
    }
}