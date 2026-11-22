class Solution {
    public void merge(int[] arr,int l,int mid,int r){
      // creting two arrays
      int n1 = mid-l+1;
      int n2 = r-mid;
      int[] a = new int[n1];
      int[] b = new int[n2];
      
      // filling array element a and b 
      for(int i=0;i<n1;i++){
        a[i] = arr[l+i]; // l will be base for filling array in a array
      }
      for(int j=0;j<n2;j++){
        b[j] = arr[mid+1+j]; // mid+1 will be base for filling array 
      }
      int i=0,j=0,k=l;
      // merging two sorted array
      
      while(i<a.length && j<b.length){
        if(a[i]>b[j]){
            arr[k++] = b[j++];
        }else{
            arr[k++] = a[i++];
        }
      }
      
      while(i<a.length) arr[k++] = a[i++];
      while(j<b.length) arr[k++] = b[j++];
     
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
