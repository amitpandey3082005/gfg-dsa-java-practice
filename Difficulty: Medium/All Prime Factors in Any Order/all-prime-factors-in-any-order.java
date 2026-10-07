class Solution {
    ArrayList<Integer> primeFactors(int n) {
       // creating array List to store all prime factor of the of the n 
       ArrayList<Integer> list = new ArrayList<>();
       
       // checking divisibility with 2 
       while(n%2==0){
           list.add(2);
           n/=2; // checking continousy for divisiblity with 2 if possible 
       }
       
       // checking other prime factor 
       for(int i=3;i<=Math.sqrt(n);i+=2){
           while(n%i==0){
               list.add(i);
               n/=i;// continously updating the values 
           }
       }
       
       if(n>2){
           list.add(n);
       }
       
       return list;
    }
}
