class Solution {
    public String reverseWords(String s) {
       // if string is empty 
       if(s==null) return " ";
       
       // creating a string array 
       String[] str = s.trim().split("\\s+");
       StringBuilder ans = new StringBuilder();
       
       // traversingto the String array 
       for(String ele: str){
           StringBuilder res = new StringBuilder();
           res.append(ele).reverse();
           ans.append(res).append(" ");
       }
       
       return ans.toString().trim();
    }
}

