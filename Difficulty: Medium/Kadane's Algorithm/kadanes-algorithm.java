class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int maxsum = arr[0];
        int currentsum = 0;
        
        for(int i=0;i<arr.length;i++){
            currentsum +=arr[i];
            
            // check current sum greater than max or not
            
            if(currentsum > maxsum){
                // replac maxsum with current sum 
                maxsum = currentsum;
            }
            
            // if current sum is getting negative then reset it with zero 
            
            if(currentsum < 0){
               currentsum = 0;
            }
        }
        
        return maxsum;
    }
}
