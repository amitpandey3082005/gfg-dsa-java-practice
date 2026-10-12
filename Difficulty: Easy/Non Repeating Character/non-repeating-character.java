class Solution {
    public char nonRepeatingChar(String s) {
       // Creating a frequency array for 26 lowercase characters
       int[] freq = new int[26]; 

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int idx = (int)(ch - 97);
            freq[idx]++; // Increase the frequency 
        }   

       
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int idx = (int)(ch - 97);

            if(freq[idx] == 1){
                return ch; // Returns the FIRST non-repeating character in string order
            }
        }

        return '$';
    }
}
