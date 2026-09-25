class Solution {
    public boolean checkDuplicates(int arr[]) {
       Arrays.sort(arr);
       
       int i=0,j=1;
       
       while(i<arr.length && j<arr.length){
           if(arr[i]==arr[j]){
               return true;
           }
           i++;j++;
       }
       
       return false;
    }
}