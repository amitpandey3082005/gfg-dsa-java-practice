import java.util.ArrayList;

class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length; 
        ArrayList<ArrayList<Integer>> transpose = new ArrayList<>();

      
        for (int j = 0; j < cols; j++) {

            ArrayList<Integer> currentRow = new ArrayList<>();

           
            for (int i = 0; i < rows; i++) {
                
                currentRow.add(mat[i][j]);
            }

            
            transpose.add(currentRow);
        }

        return transpose;
    }
}
