class Solution {
    int single(int[] arr) {
        
        // writing edge cases 
        if(arr.length == 1)return arr[0];
        if(arr[0] != arr[1]) return arr[0];
        if(arr[arr.length-1] != arr[arr.length-2]) return arr[arr.length-1];
        
        int left = 0,right = arr.length-1;
        
        while(left<=right){
            int mid = left + (right-left)/2;
            
            if(arr[mid] != arr[mid+1] && arr[mid]!=arr[mid-1]) return arr[mid];
            
            // identifying first and second occuence of the mid element  to check left and right distance 
            int first=mid,second=mid;
            if(arr[mid] == arr[mid-1]){
                first = mid-1;
            }else{ // arr[mid] == arr[mid+1]
                second= mid+1;
            }
            
            // calculating left and right distance 
            int leftCount= first-left;
            int rightCount = right-second;
            
            if(leftCount%2==0) left = mid+1;
            else right = mid -1;
        }
        
        return 766; // to return any random values 
        
    }
}