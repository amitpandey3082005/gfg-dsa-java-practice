class Solution {
    public void merge(int[] arr,int l,int mid,int r){
        // creating 2 array 
        int n1 = mid-l+1; // first half
        int n2 = r-mid; // second half 
        int[] a = new int[n1];
        int[] b = new int[n2];
        for(int i=0;i<a.length;i++){
            a[i] = arr[l+i];
        }
        for(int j=0;j<b.length;j++){
            b[j] = arr[mid+1+j];
        }
        // logic to merge the sorted array 
        int i=0,j=0,k=l;
        while(i<a.length && j<b.length){
            if(a[i]>b[j]){
                arr[k++] = b[j++];
            }else{
                arr[k++] = a[i++];
            }     
        }
        // when array one greater in length
        while(i<a.length){
            arr[k++] = a[i++];
        }
        // when array two is greater in length
        while(j<b.length){
            arr[k++] = b[j++];
        }
    }
    public void mergeSort(int arr[], int l, int r) {
      // Implement the base case 
      if(l>=r){
          return;
      }
     int mid = l + (r - l) / 2;

      // recursive case 
      mergeSort(arr,l,mid);
      mergeSort(arr,mid+1,r);
      // calling the merge function to merge sorted array 
      merge(arr,l,mid,r);
    }
}
