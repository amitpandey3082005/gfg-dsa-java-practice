class Solution {
    public static void merge(int[] arr1, int[] arr2, int[] res) {
            int i = 0, j = 0, k = 0;
            while (i < arr1.length && j < arr2.length) {
                if (arr1[i] > arr2[j]) {
                    res[k++] = arr2[j++];
                } else {
                    res[k++] = arr1[i++];
                }
            }
            // when array 1 is gretaer
            while (i < arr1.length) {
                res[k++] = arr1[i++];
            }
            // when array 2 is greater
            while (j < arr2.length) {
                res[k++] = arr2[j++];
            }
        }

    public static void mergeSortAlgo(int[] arr){
        int n = arr.length;
        // Base case
        if(n==1) return;
        // step 1 create two empty array of size n and n-n/2
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        // step 2 copy element 
        int idx=0;
        for(int i=0;i<a.length;i++){
          a[i] = arr[idx++];
        }
        for(int i=0;i<b.length;i++){
          b[i] = arr[idx++];
        }
        // step 3 applu magic
        mergeSortAlgo(a);
        mergeSortAlgo(b);
        // step 4 sort array 
        merge(a,b,arr);
        
    }
    public void mergeSort(int arr[], int l, int r) {
       mergeSortAlgo(arr);
    }
}