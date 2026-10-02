class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        
        // Handle empty matrix edge case
        if (mat == null || mat.length == 0 || mat[0].length == 0) return false;

        int rows = mat.length, cols = mat[0].length; 
        int left = 0, right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // FIXED: Corrected the binary search mid formula

            // Map 1D index back to 2D matrix coordinates
            int midrow = mid / cols;
            int midcol = mid % cols;

            if (mat[midrow][midcol] == x) {
                return true;
            } else if (mat[midrow][midcol] > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return false;
    }
}
