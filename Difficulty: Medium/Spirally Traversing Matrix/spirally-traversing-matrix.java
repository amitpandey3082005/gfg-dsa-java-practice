class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] mat) {


        // creating array list to print spiral order 
        ArrayList<Integer> ans = new ArrayList<>();

        // Handle edge cases     
        if (mat == null || mat.length == 0) {
            return ans;
        }

        int fr = 0, lr=mat.length-1; // fr and lr are first row and last row respectively 
        int fc = 0,lc = mat[0].length-1; // fc and lc are the first column and last column respectively 

        while((fr<=lr) && (fc<=lc)){

            // print first column to last column keeping row same 
            for(int j=fc;j<=lc;j++){
                ans.add(mat[fr][j]);
            }
            fr++; // shift first row 

            // storing first row to last row 
            for(int i=fr;i<=lr;i++){
                ans.add(mat[i][lc]);
            }
            lc--; // shift last column 

            // DIKKAT WALI LINE YAHA THI: Check lagana zaroori hai
            if (fr <= lr) {
                // storing from lc to first column 
                for(int j=lc;j>=fc;j--){
                    ans.add(mat[lr][j]);
                }
                lr--; // shift last row 
            }

            // DIKKAT WALI LINE YAHA THI: Check lagana zaroori hai
            if (fc <= lc) {
                // storing from last row to first row 
                for(int i=lr;i>=fr;i--){
                    ans.add(mat[i][fc]);
                }
                fc++; // shifting the first column 
            }

        }

        return ans;
    }
}
