class Solution {

    String substring(String s, int l, int r) {
        // code here
        if(s.length()==r){
            return s.substring(l,r);
        }
        return s.substring(l,r+1);
    }
}
