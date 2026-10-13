class Solution {
    public char nonRepeatingChar(String s) {
      // creating a frequency array of size 26 
      int[] freq = new int[26]; // by default string will contain 0
      
      // trversing string for mapping frequency 
      for(int i=0;i<s.length();i++){
          char ch = s.charAt(i); // chareter of string will store 
          int idx = ch-'a';
          freq[idx]++;
      }
      
      for(int i=0;i<s.length();i++){
          char ch = s.charAt(i);
          int idx = ch-'a';
          if(freq[idx]==1) return ch;
      }
      
      return '$';
      
    }
}
