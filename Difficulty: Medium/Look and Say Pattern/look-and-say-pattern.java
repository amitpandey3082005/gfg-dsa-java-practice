class Solution {
    public String countAndSay(int n) {
        // Base Case 
        if(n==1) return "1";
        // recursive case 
        String s = countAndSay(n-1);
        String ans = "";
        int i=0;
        while(i<s.length()){
            int j=i;
            while(j<s.length() && s.charAt(i)==s.charAt(j) ){
               j++; 
            }
            int count = j-i;
            ans+=count;
            ans+=s.charAt(i);
            i=j;
        }
        return ans;
    }
}
