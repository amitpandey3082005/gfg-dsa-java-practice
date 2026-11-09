class Solution {
    int missingNum(int arr[]) {
        int n = 1+arr.length,i=0;
        //implemnet cycle sort in the array 
        while(i<arr.length){
             if(arr[i] == n || arr[i] == i+1) i++;
             else{
                 int idx = arr[i] -1;
                 int temp = arr[i];
                 arr[i] = arr[idx];
                 arr[idx] = temp;
             }
        }
        // now check for mising elemnet in the array 
        for(int k=0;k<arr.length;k++){
            if(arr[k] != k+1) return k+1;
        }
        return n;
    }
}