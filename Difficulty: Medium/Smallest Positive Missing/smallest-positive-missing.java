class Solution {
    private static void swap(int[] arr , int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int i=0;
        while(i<arr.length){
            // condition to ignore 
            if(arr[i]<=0 || arr[i]>n || arr[i]==i+1 || arr[i]== arr[arr[i]-1]){
                i++;
            }else{
                swap(arr,i,arr[i]-1);
            }
        }
        
        // loop to find the missing 
        for(i=0;i<n;i++){
            if(arr[i] != i+1) return i+1;
        }
        return n+1;
    }
}
