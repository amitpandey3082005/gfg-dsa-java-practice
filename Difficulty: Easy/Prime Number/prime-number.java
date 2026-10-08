class Solution {
    static boolean isPrime(int n) {
      //creating a variabe to add check point for prime 
      boolean isPrime = true;
      
      if(n<=1){
        isPrime = false;    
      }else if(n==2 || n==3){
          isPrime = true;
      }else if(n%2==0 || n%3==0){
          isPrime = false;
      }else{
          for(int i=5;i<=Math.sqrt(n);i+=6){
              // all prime which is not multiple of 2 and 3 they can expressed as 6K+1 or 6K-1
               if(n%i==0 || n%(i+2)==0){
                   isPrime = false;
                   break;
               }
          }
      }
      
      return isPrime;
    }
}