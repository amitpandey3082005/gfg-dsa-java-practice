import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    // Helper method for recursion
    public static List<String> subset(String res, String s, int idx, List<String> list) {
        // Base Case: जब पूरी स्ट्रिंग प्रोसेस हो जाए
        if (idx == s.length()) {
            list.add(res); // खाली स्ट्रिंग सहित सभी को ऐड करें
            return list;
        }

        // Recursive case
        char ch = s.charAt(idx);

        // 1. Pick the character (अक्षर को शामिल करें)
        subset(res + ch, s, idx + 1, list);

        // 2. Skip the character (अक्षर को छोड़ दें)
        subset(res, s, idx + 1, list);

        return list;
    }

    public List<String> powerSet(String s) {
        List<String> ans = new ArrayList<>();

        // Step 1: ओरिजिनल स्ट्रिंग से ही सारे सबसीक्वेंस जनरेट करें
        subset("", s, 0, ans);

        // Step 2: फाइनल लिस्ट को अल्फाबेटिकल (lexicographical) ऑर्डर में सॉर्ट करें
        Collections.sort(ans);

        return ans;
    }
}
