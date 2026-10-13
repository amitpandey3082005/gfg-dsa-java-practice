class Solution {
    public String compressString(String s) {
        if (s == null || s.length() == 0) return "";

        StringBuilder ans = new StringBuilder();
        int i = 0, j = 0;

        while (j < s.length()) {
            char ch = s.charAt(i);
            char ch1 = s.charAt(j);
            
            // since we have to treat both upper and lower case as same  
            if (ch >= 'A' && ch <= 'Z') ch += 32;
            if (ch1 >= 'A' && ch1 <= 'Z') ch1 += 32;

            if (ch == ch1) {
                j++; // Window expands smoothly
            } else {
                int freq = j - i; 
                ans.append(ch);
                ans.append(freq);

                i = j; // Base pointer jumps to the new character segment
            }
        }

        // Final segment processing for the last remaining character block
        if (i < s.length()) {
            int freq = j - i;
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') ch += 32;
            ans.append(ch);
            ans.append(freq);
        }

        return ans.toString();
    }
}
