class Solution {
    double calculatePow(double b,int e){
        // Base case 
        if(e==1.0) return b;
        // writing recursive case 
        if(e%2==0){
            double res = power(b,e/2);
            return (double)res*res;
        }else{
            double res = power(b,e/2);
            return (double)b*res*res;
        }
    }
    double power(double b, int e) {
        if(e==0) return 1.0;
        if(e<0){
            b = 1.0/b;
            e = -e;
        }
        return calculatePow(b,e);
        
    }
}