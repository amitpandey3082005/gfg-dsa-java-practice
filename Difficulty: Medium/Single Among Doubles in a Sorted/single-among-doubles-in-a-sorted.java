class Solution {
    int single(int[] arr) {
        // handle edges cases 
        // 1. when array has only one element 
        if(arr.length == 1) return arr[0];
        if(arr[arr.length-1] != arr[arr.length-2]) return arr[arr.length-1];
        if(arr[0] != arr[1]) return arr[0];
        
        // applying logic 
        int left = 0 , right = arr.length-1;
        while(left<=right){
            // calculating mid 
            int mid = left +(right-left)/2;
            
            // if arr[mid] is the isngle elment 
            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]) return arr[mid];
            
            // checking first or second occurence 
            int first = mid,second = mid;
            if(arr[mid] == arr[mid-1]){ // second occurence 
                first = mid-1; // first elment will be at mid-1
            }else{ // if arr[mid] == arr[mid+1] i.e. first occurence 
                second = mid+1;
            }
            
            int leftCount = first-left;
            
            if(leftCount%2==0){ // move right because it ensure element in left are in pair 
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return 999;
    }
}