import java.util.ArrayList;

class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0;
        int right = arr.length - 1;

        int firstIdx = -1;
        int lastIdx = -1;

        while (left <= right) {
          
            if (arr[left] == x && arr[right] == x) {
                firstIdx = left;
                lastIdx = right;
                break;
            }

            if (arr[left] != x) {
                left++;
            }

            if (arr[right] != x) {
                right--;
            }
        }

        list.add(firstIdx);
        list.add(lastIdx);
        return list;
    }
}
