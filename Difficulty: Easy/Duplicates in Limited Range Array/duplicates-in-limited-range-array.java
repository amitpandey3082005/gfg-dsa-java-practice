class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
       // creating a ArrayList to store the duplicate element in array 
       ArrayList<Integer>list = new ArrayList<>();
       // sorting Arrays to use pointer approch within single while loop
        Arrays.sort(arr);
        
        int i=0,j=1;
        
        while(i<arr.length && j<arr.length){
            if(arr[i]==arr[j]){
                list.add(arr[i]);
            }
            i++;j++;
        }
        
        return list;
    }
}