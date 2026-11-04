import java.util.ArrayList;

class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        // creating a ArrayList 
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[left] == x && arr[right] == x) {
                list.add(left);
                list.add(right);
                break;
            }

            if (arr[left] != x) {
                left++;
            }

            if (arr[right] != x) {
                right--;
            }
        }
        // check if list is empty then add -1 and -1 in the arrayList and finally return that list 
        if (list.isEmpty()) {
            list.add(-1);
            list.add(-1);
        }

        return list;
    }
}
