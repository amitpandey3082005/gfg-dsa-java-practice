class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        long CurrEle = 1;
        res.add((int)CurrEle);
        
        for(int i=1;i<n;i++){
            CurrEle=(CurrEle*(n-i))/i;
            res.add((int)CurrEle);
        }
        return res;
    }
}