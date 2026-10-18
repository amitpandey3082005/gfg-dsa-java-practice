class Solution {
    public int maxZeros(int[][] arr) {
        int n = arr.length; // Matrix ka size yahan se mil jayega
        int maxZeroCount = 0;
        int maxZeroColumnIndex = -1; // Agar koi zero nahi mila, toh -1 return hoga

        // Har column par ek-ek karke traverse karein
        for (int i = 0; i < n; i++) {
            int currentColumnZeros = 0;

            // Us specific column 'i' ke andar saari rows 'j' ko check karein
            for (int j = 0; j < n; j++) {
                if (arr[j][i] == 0) {
                    currentColumnZeros++;
                }
            }

            // Strictly greater than (>) lagane se leftmost index save rahega
            if (currentColumnZeros > maxZeroCount) {
                maxZeroCount = currentColumnZeros;
                maxZeroColumnIndex = i;
            }
        }

        return maxZeroColumnIndex;
    }
}
