class Solution {
    // Helper method for recursion
    public static List<String> subset(String res, String s, int idx, List<String> list) {
        
        if (idx == s.length()) {
            list.add(res); 
            return list;
        }

        // Recursive case
        char ch = s.charAt(idx);

        // 1. Pick the character
        subset(res + ch, s, idx + 1, list);

        // 2. Skip the character 
        subset(res, s, idx + 1, list);

        return list;
    }

    public List<String> powerSet(String s) {
        List<String> ans = new ArrayList<>();

        // generate list of subsequence 
        subset("", s, 0, ans);
        // sorting ArrayList for lexographical order 
        Collections.sort(ans);

        return ans;
    }
}
