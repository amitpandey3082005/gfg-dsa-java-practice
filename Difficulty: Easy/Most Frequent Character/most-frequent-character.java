import java.util.Arrays;

class Solution {
    public static char getMaxOccuringChar(String s) {
        // Convert string to character array
        char[] str = s.toCharArray();

        // Sort the array so identical characters sit next to each other
        Arrays.sort(str);

        int i = 0, j = 0;
        int maxFreq = Integer.MIN_VALUE; // Fixed capitalization (Freq)
        char maxChar = str[0];

        // Sliding window loop to count frequencies
        while (i < str.length && j < str.length) {
            if (str[i] == str[j]) {
                j++; // Expand the window if characters match
            } else {
                int currFreq = j - i; // Calculate window size (frequency)

                if (currFreq > maxFreq) {
                    maxFreq = currFreq;
                    maxChar = str[i];
                }
                i = j; // Move the window start pointer to the new character
            }
        }


        int currFreq = j - i;
        if (currFreq > maxFreq) {
            maxFreq = currFreq;
            maxChar = str[i];
        }

        // Return the character with the maximum frequency
        return maxChar; 
    }
}
