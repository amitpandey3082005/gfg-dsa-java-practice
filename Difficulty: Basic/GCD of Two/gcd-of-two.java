class Solution {
    public static int gcd(int a, int b) {
       // recursive code 
       if(b==0) return a;
       // recursive code 
       return gcd(b,a%b);
    }
}
