class Solution {
    int maxSubarraySum(int[] arr) {
      int maxSum = Integer.MIN_VALUE;
      int currSum = 0;
      int start=0,end=0,temp=0;
      
      for(int i=0;i<arr.length;i++){
          
          currSum+=arr[i];
          
          if(currSum>maxSum){
              maxSum = currSum;
              start = temp;
              end = i;
          }
          
          if(currSum<0){
              temp = i+1;
              currSum =0;
          }
      }
      
      return maxSum;
    }
}
