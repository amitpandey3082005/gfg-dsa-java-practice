
class Solution {

    public long minMaxProduct(int[] arr1, int[] arr2) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        // finsing max of 1
        for(int i=0;i<arr1.length;i++){
              if(arr1[i]>max){
                  max = arr1[i];
              }
        }
        
        // finding min of arr2
        
        for(int j=0;j<arr2.length;j++){
            if(arr2[j]<min){
                min = arr2[j];
            }
        }
        
        return min*max;
        
    }
}