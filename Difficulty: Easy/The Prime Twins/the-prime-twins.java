import java.util.ArrayList;

class Solution {

    public static boolean checkPrime(int n){
        if(n <= 1){
            return false;
        } else if(n == 2 || n == 3){
            return true;
        } else if(n % 2 == 0 || n % 3 == 0){
            return false;
        } else {
            for(int i = 5; i <= Math.sqrt(n); i += 6){
                if(n % i == 0 || n % (i + 2) == 0){
                    return false;
                }
            }
        }
        return true;
    }

    public ArrayList<Integer> primeTwins(int l, int r) {
        ArrayList<Integer> result = new ArrayList<>();

        
        for (int i = l; i <= r - 2; i++) {
            
            if (checkPrime(i) && checkPrime(i + 2)) {
                result.add(i);
                result.add(i + 2);
                return result; 
            }
        }

        
        result.add(-1);
        return result;
    }
}
