class Solution {
    public static int sumSubstrings(String s) {
        // Handle empty or null strings safely
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int sum = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String substrings = s.substring(i, j);
                sum += Integer.parseInt(substrings); 
            }
        }
        return sum;
    }
}
