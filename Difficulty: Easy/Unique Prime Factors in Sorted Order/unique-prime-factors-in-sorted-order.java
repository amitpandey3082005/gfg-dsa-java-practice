class Solution {
    public static ArrayList<Integer> primeFac(int n) {
        
      // creating a ArrayList for unique prime numbers 
      ArrayList<Integer> list = new ArrayList<>();
      int j=0;
    
      while(n%2==0){
          if(j==0){ list.add(2);j++;}
          n/=2;
      }
      int temp=0;
      for(int i=3;i<=Math.sqrt(n);i++){
          
          while(n%i==0){
              if(i!=temp){
                  list.add(i);
              }
              temp=i;
              n/=i;
          }
      }
      
      if(n>2){
          list.add(n);
      }
      
      return list;
        
    }
}