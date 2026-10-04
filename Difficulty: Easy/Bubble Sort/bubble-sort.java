class Solution {
    public void bubbleSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            boolean swapcount = true;
            
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapcount = false;
                }
            }
            
            // check array sorted or not 
            if(swapcount) return;
        }
    }
}
