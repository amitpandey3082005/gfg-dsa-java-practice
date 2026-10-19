class Solution {
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<matrix.length;i++){
            
            if(i%2==0){
                for(int j=0;j<matrix[0].length;j++){
                    list.add(matrix[i][j]);
                }
            }else{
                for(int j=matrix[0].length-1;j>=0;j--){
                    list.add(matrix[i][j]);
                }
            }
        }
        
        return list;
        
    }
}