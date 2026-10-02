import java.util.HashMap;

class Solution {
    public static int subArraySum(int[] arr, int k) {
        int count = 0;
        int currSum = 0;

       // store sum and number of times subarray sum occur (i.e. frequency )
        HashMap<Integer, Integer> map = new HashMap<>();

        // method to put value 
        map.put(0, 1); 

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i]; 

            // Agar (currSum - k) pehle dikha hai, toh utne valid subarrays mil gaye
            if (map.containsKey(currSum - k)) {
                count += map.get(currSum - k);
            }

            // Current sum ki frequency ko map mein update karein
            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }

        return count;
    }
}
