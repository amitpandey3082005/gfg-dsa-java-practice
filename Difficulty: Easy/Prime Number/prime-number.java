class Solution {
    static boolean isPrime(int n) {
      // code here
      boolean isPrime = true;
      if(n<=1){
          return false;
      }else if(n==2 || n==3){
          return true;
      }
      else if(n%2==0 || n%3==0){
          return false;
      }else{
          for(int i=5;i<=Math.sqrt(n);i+=6){
            if(n%i==0 || n%(i+2)==0){
                isPrime = false;
                break;
            }   
          }
      }
      return isPrime;
    }
}