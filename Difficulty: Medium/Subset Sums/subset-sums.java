class Solution {
    public static ArrayList<Integer> subsetSum(int[] arr , ArrayList<Integer> ans , int sum ,int idx ){
        if(idx== arr.length) {
            ans.add(sum);
            return ans;
        }
       
        // pick 
        subsetSum(arr,ans,sum+arr[idx],idx+1);
        // skip recursion 
        subsetSum(arr,ans,sum,idx+1);
        return ans;
    }
    public ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        return subsetSum(arr,res,0,0);
    }
}