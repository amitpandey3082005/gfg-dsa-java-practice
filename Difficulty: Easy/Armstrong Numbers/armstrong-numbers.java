class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int original = n;
        int sum =0;
        while(n>0){
            int lastDigit = n%10;
            sum += Math.pow(lastDigit,3);
            n/=10;
        }
        
        return sum==original;
    }
}