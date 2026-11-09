class Solution {
    int single(int[] arr) {
        // Handle edge case 
        if(arr.length == 1) return arr[0];
        if(arr[0] != arr[1]) return arr[0];
        if(arr[arr.length-1] != arr[arr.length-2]) return arr[arr.length-1];

        // Edge cases handle ho chuke hain, toh safe search space 1 se arr.length-2 tak hai
        int left = 1, right = arr.length - 2;

        while(left <= right){
            int mid = left + (right-left)/2;

            // Unique element check
            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]) return arr[mid];

            int leftCount;
           // element at mid has second occurence 
            if(arr[mid] == arr[mid-1]){ 
                leftCount = mid - 1; 
            } 
            // first Occurence hai mid element ka 
            else { 
                
                leftCount = mid; 
            }
            if(leftCount % 2 == 0){
                left = mid + 1; // right half check
            } else {
                right = mid - 1; // left half 
            }
        }
        // Agar single element pehle ya aakhiri na ho aur beech mein ho
        return -1;
    }
}
