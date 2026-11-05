import java.util.ArrayList;

class Solution {
   
    public static void generate(ArrayList<String> res , int pairs, int left, int right, String ans){
       
        if(right == pairs){
            res.add(ans);
            return;  
        }

        // Recursive case 
        if(left < pairs) {
            generate(res, pairs, left + 1, right, ans + '(');
        }
        if(right < left) {
            generate(res, pairs, left, right + 1, ans + ')');
        }
    }

    public ArrayList<String> generateParentheses(int n) {
        ArrayList<String> res = new ArrayList<>();

        if (n % 2 != 0) {
            return res;
        }

        // total length 'n' है, तो pairs की संख्या 'n / 2' होगी
        generate(res, n / 2, 0, 0, "");
        return res;
    }
}
