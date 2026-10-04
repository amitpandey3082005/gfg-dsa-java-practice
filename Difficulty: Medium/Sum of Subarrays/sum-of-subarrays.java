class Solution {
    public static int subarraySum(int[] arr) {
        // creating variable to store sum 
        long tsum = 0;
        
        for(int i=0;i<arr.length;i++){
            long freq  = (i+1)*(arr.length-i);
            tsum+=arr[i]*freq;
        }
        
        return (int)tsum;
    }
}
