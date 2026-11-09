class Solution {
    public static void merge(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;

        for (int i = 0; i < n; i++) {
            // if a[i] > b[0] 
            if (a[i] > b[0]) {

                // 1. Swap a[i] and b[0]
                int temp = a[i];
                a[i] = b[0];
                b[0] = temp;

                // 2. b[0] position must be fixed in array b 
                int first = b[0];
                int k;
                // if first is greter than adjacent then fix it at correct position 
                for (k = 1; k < m && b[k] < first; k++) {
                    b[k - 1] = b[k]; 
                }
                b[k - 1] = first; // Sahi jagah par naye element ko rakh diya
            }
        }
    }

    public void mergeArrays(int a[], int b[]) {
        merge(a, b);
    }
}

