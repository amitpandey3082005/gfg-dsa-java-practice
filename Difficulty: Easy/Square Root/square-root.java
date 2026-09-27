class Solution {
    int floorSqrt(int n) {
        // code here
        int i = 1,j=n;
        
        while(i<=j){
            int mid = (i+j)/2;
            
            if(mid*mid==n){
                return mid;
            }else if(mid*mid>n){
                j = mid-1;
            }
            else{
                i= mid+1;
            }
        }
        
        return j;
    }
}