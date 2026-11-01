import java.math.BigInteger;
class Solution {
    public ArrayList<Integer> factorial(int n) {

       ArrayList<Integer> res = new ArrayList<>();

       BigInteger fact = BigInteger.ONE; 

       for(int i = 1; i <= n; i++){

           fact = fact.multiply(BigInteger.valueOf(i)); 
       }

       // loop run until fact become 0     
       while (!fact.equals(BigInteger.ZERO)) {

            // compute the modulus of the fact with 10 and convert back to int
           int lastDigit = fact.mod(BigInteger.valueOf(10)).intValue();
           res.add(lastDigit);

           // divide the fact by 10 
           fact = fact.divide(BigInteger.valueOf(10));
       }

       // reverse the element of arayList 
       Collections.reverse(res);
       return res;
    }
}
