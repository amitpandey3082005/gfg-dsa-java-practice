class Solution {
    public int recursivePower(int n, int p) {
        // time complexcity O(long)
        if(p==0) return 1; // any number with power 0 will be 1 always
        
        if(p%2==0){
            int res = recursivePower(n,p/2);
            return res*res;
        }else{
            int res = recursivePower(n,p/2);
            return n*res*res;
        }
    }
}
