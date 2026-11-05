class Solution {
    static int closestNumber(int n, int m) {
        if (n % m == 0) return n;

        int i = n, j = n;
        while (true) {
            i++;
            j--;

            if (n < 0) {
                if (j % m == 0) return j;
                if (i % m == 0) return i;
            } else {
                if (i % m == 0) return i;
                if (j % m == 0) return j;
            }
        }
    }
}
