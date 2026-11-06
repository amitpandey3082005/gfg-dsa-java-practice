import java.util.ArrayList;

class Solution {

    public static ArrayList<Integer> traverse(int[][] mat, ArrayList<Integer> res, int fc, int lc, int fr, int lr) {
        
        if (fr > lr || fc > lc) {
            return res;
        }

        // 1. First Row: fc se lc tak (Saare elements include karne ke liye <= lc)
        for (int i = fc; i <= lc; i++) {
            res.add(mat[fr][i]);
        }

        // 2. Last Column: fr + 1 se lr tak (Duplicate top-right corner bachane ke liye fr+1)
        for (int i = fr + 1; i <= lr; i++) {
            res.add(mat[i][lc]);
        }

        // for single row print duplicate 
        if (fr < lr) {
            // 3. Last Row: lc - 1 se fc tak (Reverse direction)
            for (int i = lc - 1; i >= fc; i--) {
                res.add(mat[lr][i]);
            }
        }

        // for single column to remove duplicate ading 
        if (fc < lc) {
            // 4. First Column: lr - 1 down to fr + 1 (Reverse direction)
            for (int i = lr - 1; i > fr; i--) {
                res.add(mat[i][fc]);
            }
        }

        // Recursion call for inner matrix
        return traverse(mat, res, fc + 1, lc - 1, fr + 1, lr - 1);
    }

    public ArrayList<Integer> spirallyTraverse(int[][] mat) {
        if (mat == null || mat.length == 0 || mat[0].length == 0) {
            return new ArrayList<>();
        }

        int fr = 0;
        int fc = 0;
        int lr = mat.length - 1;
        int lc = mat[0].length - 1;

        ArrayList<Integer> res = new ArrayList<>();
        return traverse(mat, res, fc, lc, fr, lr);
    }
}
