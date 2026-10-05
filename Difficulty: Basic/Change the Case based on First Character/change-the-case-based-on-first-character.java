class Solution {
    String modify(String s) {
        char ch = s.charAt(0);
        
        if(Character.isUpperCase(ch)){
            return s.toUpperCase();
        }else{
            return s.toLowerCase();
        }
    }
}