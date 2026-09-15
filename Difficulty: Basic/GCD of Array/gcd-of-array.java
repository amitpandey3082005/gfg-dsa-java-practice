class Solution {
    public int gcd(int n, int arr[]) {
       
        int result = arr[0];
      
        for (int i = 1; i < arr.length; i++) {
            result = findGCDOfTwo(result, arr[i]);
            // Optimization approach
            if (result == 1) {
                return 1; 
            }
        }

        return result;
    }

    private int findGCDOfTwo(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
