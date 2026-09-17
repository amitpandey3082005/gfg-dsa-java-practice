class Solution {
    public int firstElement(int[] arr, int k) {

        int[] count = new int[1000001];// created a large frequency array for storing occurence of the array element 

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            count[num]++; // st
        }

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (count[num] == k) {
                return num; 
            }
        }

    
        return -1;
    }
}
