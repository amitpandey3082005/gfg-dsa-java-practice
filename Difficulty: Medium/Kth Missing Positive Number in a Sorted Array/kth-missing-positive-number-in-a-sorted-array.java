class Solution {
    public int kthMissing(int[] arr, int k) {
        
       int left = 0,right = arr.length-1;
       
       while(left<=right){
           int mid = left+(right-left)/2;
           int correctNo = mid+1;
           int missingNo = arr[mid]-correctNo;
           
           if(missingNo<k){
               left = mid+1;
           }else{
               right = mid-1;
           }
       }
       
       return left+k;
    }
}