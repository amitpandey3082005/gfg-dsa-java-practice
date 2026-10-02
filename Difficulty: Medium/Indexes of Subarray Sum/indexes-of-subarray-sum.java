import java.util.ArrayList;

class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        int start = 0;
        int currentSum = 0;

        for (int end = 0; end < n; end++) {
            
            currentSum += arr[end];

            // currsum greater than target, then remove from currentSum
            while (currentSum > target && start < end) {
                currentSum -= arr[start];
                start++;
            }

            // Agar sum target ke barabar mil jaye
            if (currentSum == target) {
                list.add(start + 1); 
                list.add(end + 1);  
                return list;
            }
        }

        // if no such sub array exist return -1 in list 
        list.add(-1);
        return list;
    }
}

