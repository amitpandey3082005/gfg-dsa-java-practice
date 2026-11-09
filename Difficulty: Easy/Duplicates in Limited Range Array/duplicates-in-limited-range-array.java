import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
      ArrayList<Integer> res = new ArrayList<>();
      int i = 0;

      // STEP 1: Cyclic Sort loop (ismein se res.add() bilkul hata diya hai)
      while (i < arr.length) {
          if (arr[i] == i + 1) {
              i++;
          } else {
              int idx = arr[i] - 1;

              // Agar duplicate element milta hai, toh swap nahi karenge, seedhe aage badhenge
              if (arr[idx] == arr[i]) {
                  i++; 
              } else {
                  // Sahi jagah swap karein
                  int temp = arr[i];
                  arr[i] = arr[idx];
                  arr[idx] = temp;
              }
          }
      }

      // STEP 2: Ab bas un elements ko res mein daalein jo apni sahi jagah par nahi hain
      for (int j = 0; j < arr.length; j++) {
          if (arr[j] != j + 1) {
              res.add(arr[j]);
          }
      }

      return res;
    }
}
