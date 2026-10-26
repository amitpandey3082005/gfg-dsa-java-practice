// Best Case of this solution is O(n)
class Solution {
    public void bubbleSort(int[] arr) {
        
        for(int i=0;i<arr.length;i++){
           boolean swapCount = true; // variable to add checkpoint for sorted or not
           for(int j=0;j<arr.length-1-i;j++){
               
               if(arr[j]>arr[j+1]){
                   // swap arr[i] and arr[j]
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                   swapCount = false; // it shows array is sorted (i.e. No swapping is required )
               }
           }
           // check array sorted or not (i.e. It may be possible array could be sorted after just 1 pass )
            if(swapCount) return;           
        }
    }
}
