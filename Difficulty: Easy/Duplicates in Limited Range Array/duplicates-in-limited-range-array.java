import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
      ArrayList<Integer> res = new ArrayList<>();
      int i = 0;

      // STEP 1: Cyclic Sort loop 
      while (i < arr.length) {
          if (arr[i] == i + 1) {
              i++;
          } else {
              int idx = arr[i] - 1;

              // if find duplicate then increment only 
              if (arr[idx] == arr[i]) {
                  i++; 
              } else { // swap at perfect place 
                  int temp = arr[i];
                  arr[i] = arr[idx];
                  arr[idx] = temp;
              }
          }
      }

      // now swap duplicate element only 
      for (int j = 0; j < arr.length; j++) {
          if (arr[j] != j + 1) {
              res.add(arr[j]);
          }
      }

      return res;
    }
}
