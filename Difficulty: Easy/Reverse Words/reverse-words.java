class Solution {
    public String reverseWords(String s) {
        
        String[] str = s.split("\\.");
        StringBuilder ans = new StringBuilder();

        
        for (int i = str.length - 1; i >= 0; i--) {

            if (!str[i].isEmpty()) {

                if (ans.length() > 0) {
                    ans.append(".");
                }

                ans.append(str[i]);
            }
        }

        return ans.toString();
    }
}
