class Solution {
    public static void merge(int[] arr, int l, int mid, int r) {
        // 1. Calculate the sizes of the two subarrays to be merged
        int n1 = mid - l + 1;
        int n2 = r - mid;

        // 2. Create temporary arrays using extra space
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        // 3. Copy data from the main array into the temporary arrays
        for (int i = 0; i < n1; i++) {
            arr1[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            arr2[j] = arr[mid + 1 + j];
        }

        // 4. Merge the temporary arrays back into the original array arr[l..r]
        int i = 0, j = 0;
        int k = l; // k starts at the left boundary of the current subarray

        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                arr[k++] = arr1[i++];
            } else {
                arr[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1, if any
        while (i < n1) {
            arr[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2, if any
        while (j < n2) {
            arr[k++] = arr2[j++];
        }
    }

    public void mergeSort(int arr[], int l, int r) {
        // Base case
        if (l >= r) return;

        // Find the middle point
        int mid = l + (r - l) / 2;

        // Sort first and second halves
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r); 

        // Merge the sorted halves
        merge(arr, l, mid, r); 
    }
}
