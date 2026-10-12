class Solution {
    public String compressString(String s) {
      // creating string builder 
      StringBuilder ans = new StringBuilder();
       int i=0,j=0;
       while(i<s.length() && j<s.length()){

           char ch = Character.toLowerCase(s.charAt(i));
           char ch1 = Character.toLowerCase(s.charAt(j));

           if(ch == ch1){
               j++; // expand window 
           }else{
               int freq = j - i; 
               ans.append(ch);
               ans.append(freq);
               i=j; 
           }
       }

       if (i < s.length()) {
          
            int freq = j - i;
            char ch = Character.toLowerCase(s.charAt(i));
            ans.append(ch);
            ans.append(freq);
        }

       return ans.toString();
    }
}
