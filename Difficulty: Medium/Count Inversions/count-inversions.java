class Solution {
    static int count;

    public int inversionCount(int arr[]) {
        count = 0;
        // FIX 1: Function ka naam mergeSortAlgo tha, use sahi kiya
        mergeSortAlgo(arr); 
        return count;
    }

    public static void mergeSortAlgo(int[] arr) {
        int n = arr.length;
        // Base case
        if (n <= 1) // Safe boundary for n = 0 or 1
            return;

        // step 1 create two empty array of size n/2 and n-n/2
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];

        // step 2 copy element
        int idx = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = arr[idx++];
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = arr[idx++];
        }

        // step 3 apply magic using recursion
        mergeSortAlgo(a);
        mergeSortAlgo(b);

        // step 4 sort array
        merge(a, b, arr);
    }

    public static void merge(int[] arr1, int[] arr2, int[] res) {
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            // FIX 2: Agar arr1[i] bada hai arr2[j] then ciunt as inverion 
            if (arr1[i] > arr2[j]) {
                count += (arr1.length - i); //count add hen left is greater 
                res[k++] = arr2[j++];
            } else {
                res[k++] = arr1[i++];
            }
        }

        // when array 1 elements are remaining
        while (i < arr1.length) {
            res[k++] = arr1[i++];
        }
        // when array 2 elements are remaining
        while (j < arr2.length) {
            res[k++] = arr2[j++];
        }
    }
}
