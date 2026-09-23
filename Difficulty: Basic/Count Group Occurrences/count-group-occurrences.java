import java.util.HashMap;

class Sol {
    int getCount(String s, int k) {
        
        HashMap<Character, Integer> map = new HashMap<>();

        int i = 0;
        int n = s.length();

        while (i < n) {
            char currentChar = s.charAt(i);

 
            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);

            // skip when same charecter Appear  
            while (i < n && s.charAt(i) == currentChar) {
                i++;
            }
        }

        // check occurenece of the character whose value is equal to k 
        int ans = 0;
        for (int count : map.values()) {
            if (count == k) {
                ans++;
            }
        }

        return ans;
    }
}
