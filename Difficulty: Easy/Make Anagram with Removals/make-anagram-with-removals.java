import java.util.HashMap;

class Solution {
    public int remAnagram(String s1, String s2) {
        // Create a HashMap to track character frequencies
        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Count characters of the first string by INCREMENTING (+1)
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Cancel out matching characters by DECREMENTING (-1) for the second string
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }

        int deletions = 0;

        // Step 3: Loop through all final remaining counts in the map.
        // If a count is 0, it means it was perfectly matched.

        for (int count : map.values()) {
            // Math.abs() converts negative counts (like -1) to positive (+1) 
            // so we can sum up the total number of characters that need to be deleted.
            deletions += Math.abs(count); 
        }

        return deletions;
    }
}
