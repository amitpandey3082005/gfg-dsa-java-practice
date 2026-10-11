class Solution {
    public static String reverseString(String s) {
      StringBuilder str = new StringBuilder(s); // passing string with string builder
      int i=0,j=str.length()-1;
      while(i<=j){
          char temp = str.charAt(i);
          char temp1 = str.charAt(j);
          
          str.setCharAt(i,temp1);
          str.setCharAt(j,temp);
          i++;j--;
      }
      
      return str.toString();
    }
}