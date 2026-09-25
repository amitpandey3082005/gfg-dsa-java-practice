class Solution {
    ArrayList<Integer> primeFactors(int n) {
        // creating the array list to store the prime factors 
        ArrayList<Integer> list = new ArrayList<>();

        // checking for factor of two 
        while(n % 2 == 0){
            list.add(2);
            n /= 2;
        }

        // checking for all odd factor
        for(int i = 3; i <= Math.sqrt(n); i+=2){ 
            while(n % i == 0){
                list.add(i);
                n /= i; // update continously n        
            }
        }

        if(n > 2){
            list.add(n);
        }
        return list;
    }
}
