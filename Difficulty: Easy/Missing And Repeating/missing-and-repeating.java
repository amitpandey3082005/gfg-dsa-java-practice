class Solution {
    ArrayList<Integer> findTwoElement(int nums[]) {
        ArrayList<Integer> ans = new ArrayList<>();
              int n= nums.length+1;
              int i=0;
              while(i<nums.length){
                  if(nums[i] == i+1||nums[i]>n|| nums[i]==nums[nums[i]-1]){
                      i++;
                  } else{
                      // swap 
                      int idx = nums[i]-1;
                      int temp = nums[i];
                      nums[i] = nums[idx];
                      nums[idx] = temp;
                  }
              }
              // searching for missing ad repeating 
              for(i=0;i<nums.length;i++){
                  if(nums[i] != i+1){
                      ans.add(nums[i]); // element repeated 
                      ans.add(i+1); // index missing number 
                      return ans;
                  }
              }
              return ans;
        
    }
}
