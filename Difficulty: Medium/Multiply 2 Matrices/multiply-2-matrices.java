class Solution {
    public ArrayList<ArrayList<Integer>> multiply(int[][] mat1, int[][] mat2) {
         int row1 = mat1.length,col1 = mat1[0].length;
         int row2 = mat2.length,col2 = mat2[0].length;

        // crete empty 2D to store result of multplication  
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>(); // a new ans arraylist is created 
        for(int i=0;i<row1;i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0;j<col2;j++){
                list.add(0);
            }
            ans.add(list);
        }
        
        // checking edge Condition 
        if(col1 !=row2) return ans;
        
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.get(i).size();j++){
                int res = 0;
                for(int k=0;k<col1;k++){ // both col1 and row2 are same 
                   res += mat1[i][k]*mat2[k][j];
                }
                ans.get(i).set(j,res);
            }
        } 
        return ans;
    }
}