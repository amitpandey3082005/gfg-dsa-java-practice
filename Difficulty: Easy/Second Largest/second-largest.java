class Solution {
    public int getSecondLargest(int[] arr) {
      // creating variable for max and second max
      int max = Integer.MIN_VALUE;
      int smax = Integer.MIN_VALUE;
      
      for(int i=0;i<arr.length;i++){
          if(arr[i]>max){
              smax = max; // store value of max in second max 
              max = arr[i]; // now store value of array in max 
          }else if(arr[i]>smax && arr[i] != max){
              smax = arr[i];
          }
      }
      
      // checking second max exit or not 
       if(smax == Integer.MIN_VALUE) return -1;
       else return smax;
    }
}
