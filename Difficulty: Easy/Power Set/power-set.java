class Solution {
   
    public static ArrayList<String> subset(String ans, String s, int idx, ArrayList<String> list) {
        // when Complete Scanning of Array is done 
        if (idx == s.length()) {
            list.add(ans); // Add ans into the arrayList 
            return list;
        }

        // Recursive Case
        char ch = s.charAt(idx);

        // 1. Pick the character (Include in answer)
        subset(ans + ch, s, idx + 1, list); 

        // 2. Skip the character (Exclude from answer)
        subset(ans, s, idx + 1, list);

        return list;
    }

    public ArrayList<String> powerSet(String s) {
        ArrayList<String> res = new ArrayList<>();
        return subset("", s, 0, res);
    }
}
