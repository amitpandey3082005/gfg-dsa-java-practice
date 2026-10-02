class Solution {
    public boolean matSearch(int[][] mat, int x) {
        int rows = mat.length;
        int cols = mat[0].length;

        // start with top right corner 
        int left = 0;        // keep track of row
        int right = cols - 1;

        // check for row 
        while (left < rows && right >= 0) { 

           
            if (mat[left][right] == x) { 
                return true; // Element found 
            } else if (mat[left][right] > x) {
                right--; // move 
            } else {
                left++; // move down
            }
        }

        return false; // Element not found 
    }
}
