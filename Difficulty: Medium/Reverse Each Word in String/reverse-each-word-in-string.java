class Solution {
    public String reverseWords(String s) {
       // writing the edge Condition when string is empty 
       if(s==null) return "";
       
       // spliting the string based on tab and trim it 
       String[] str = s.trim().split("\\s+"); // here + group multiple spaces 
       StringBuilder ans = new StringBuilder();
       
       // now traversing to the entire string array
       for(String ele : str){
           //creating another string builder 
           StringBuilder res = new StringBuilder();
           res.append(ele).reverse(); // adding each element of the string array into res stringBuilder
           // now adding res to the ans string builder 
           ans.append(res).append(" ");
       }
       
       return ans.toString().trim();
    }
}

