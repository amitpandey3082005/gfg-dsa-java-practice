import java.util.HashMap;

class Solution {
    public static char getMaxOccuringChar(String s) {
       
       int n = s.length();
       int maxFrequency=Integer.MIN_VALUE;
       char maxChar = s.charAt(0);
       
       for(int i=0;i<n;i++){
           int count = 0;
           char ch = s.charAt(i);
           for(int j=i+1;j<n;j++){
               if(s.charAt(j)==ch){
                   count++;
               }
           }
           
           if(count>maxFrequency){
               maxFrequency = count;
               maxChar = ch;
           }else if(maxFrequency == count && ch<maxChar){
               maxChar = ch;   
           }
       }
       
       return maxChar;
       
    }
}
