import java.util.ArrayList;

class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0, right = arr.length - 1;
        int firstidx = -1;
        int lastidx = -1; 

        while (left <= right) { 
            if (arr[left] == x && arr[right] == x) {
                firstidx = left;
                lastidx = right;
                break;
            }
            if (arr[left] != x) left++;
            if (arr[right] != x) right--;
        }

        list.add(firstidx);
        list.add(lastidx);
        return list;
    }
}
