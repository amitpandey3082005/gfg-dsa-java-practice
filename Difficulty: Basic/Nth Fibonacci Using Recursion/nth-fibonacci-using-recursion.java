class Solution {
    static int nthFibonacci(int n) {
       // Base case 
       if(n==0 || n==1) return n;
       
       return nthFibonacci(n-1)+nthFibonacci(n-2);
        
    }
}
