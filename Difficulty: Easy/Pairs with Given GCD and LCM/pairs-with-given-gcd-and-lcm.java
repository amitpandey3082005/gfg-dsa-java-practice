class Solution {

    // Iterative GCD helper function
    private static int getGCD(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public int pairCount(int x, int y) {
        // check lcm and hcf are divisible 
        if (y % x != 0) {
            return 0;
        }

        int P = y / x;
        int count = 0;

        
        for (int i = 1; i * i <= P; i++) {
         
            if (P % i == 0) {
                int k1 = i;
                int k2 = P / i;

               
                if (getGCD(k1, k2) == 1) {
                    if (k1 == k2) {
                        count += 1; 
                    } else {
                        count += 2; 
                    }
                }
            }
        }

        return count;
    }
}
