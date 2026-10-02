class Solution {
    public boolean searchRowMatrix(int[][] mat, int x) {
        // Return false when matrix is empty
        if (mat == null || mat.length == 0 || mat[0].length == 0) return false;

        int rows = mat.length;    // Calculate total rows
        int cols = mat[0].length; // Calculate total columns 

        for (int i = 0; i < rows; i++) {
            // Check if 'x' lies within the range of the current row
            if (x >= mat[i][0] && x <= mat[i][cols - 1]) {

                // Perform standard Binary Search on the current row
                int left = 0, right = cols - 1;
                while (left <= right) {
                    int mid = left + (right - left) / 2;

                    if (mat[i][mid] == x) {
                        return true;    // Found the element
                    } else if (mat[i][mid] > x) {
                        right = mid - 1; // Go to left side
                    } else {
                        left = mid + 1;  // Go to right side
                    }
                }
            }
        }

        return false; // Return false when element is not found 
    }
}
