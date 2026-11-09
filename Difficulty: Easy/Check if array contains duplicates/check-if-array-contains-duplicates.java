import java.util.HashSet;

class Solution {
    public boolean checkDuplicates(int arr[]) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {
            // Agar num pehle se set mein hai, matlab duplicate mil gaya!
            if (!seen.add(num)) {
                return true;
            }
        }

        // Agar loop poora khatam ho gaya aur koi duplicate nahi mila
        return false;
    }
}
