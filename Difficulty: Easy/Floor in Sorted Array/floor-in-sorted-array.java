class Solution {
    static int findFloor(int[] arr, int x) {
        // code here
        int left = 0,right = arr.length-1,idx = -1;
        while(left<=right){
            int mid = left +(right - left)/2;
             if(arr[mid]>x){
                 right = mid-1; // go to the left 
             }
             else if(arr[mid]<=x){
                 idx = mid;
                 left = mid+1; // go to the right 
             }
        }
        return idx;
    }
}
