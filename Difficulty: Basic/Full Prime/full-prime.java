class Solution {
    private static boolean checkPrime(int n){
        boolean isPrime=true;
        if(n<=1){
            return false;
        }else if(n==2 || n==3){
            return true;
        }else if(n%2==0 || n%3==0){
            return false;
        }else{
            for(int i=5;i<=Math.sqrt(n);i++){
                if(n%i==0 || n%(i+2)==0){
                    isPrime=false;
                    break;
                }
            }
        }
        return isPrime;
    }
    static int fullPrime(int N) {
        // code here
        
      if(checkPrime(N)){
        while(N>0){
            int lastDigit = N%10;
            
            if(checkPrime(lastDigit)) {
                N/=10;
            }else{
                return 0;
            }
        }
      }else{
        return 0;
      }
        
        return 1;
    }
}