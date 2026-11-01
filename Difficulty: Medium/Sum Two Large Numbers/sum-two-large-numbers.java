import java.math.BigInteger;

class Solution {
    String findSum(String s1, String s2) {
        // Create BigInteger objects directly from the strings
        BigInteger num1 = new BigInteger(s1);
        BigInteger num2 = new BigInteger(s2);

        // Add them together
        BigInteger sum = num1.add(num2);

        // Convert the result back to a String
        return sum.toString();
    }
}
