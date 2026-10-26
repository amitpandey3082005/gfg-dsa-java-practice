class Solution {
    public int[] reArrange(int[] arr) {
        // code here
        int n = arr.length;
        int i=0,j=i+1; // here i is for even index and j for odd index 
        
        // loop to use two pointer 
        while(i<n && j<n){
            // i fo reven j for odd 
            if(arr[i]%2 == 0){ // i.e. array is already even index move to next even index 
              i+=2;   
            }else if(arr[j]%2 != 0){ // i.e is already at odd index 
                j+=2;
            }else{ // if they are at wrong index then swap 
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        return arr;
    }
}