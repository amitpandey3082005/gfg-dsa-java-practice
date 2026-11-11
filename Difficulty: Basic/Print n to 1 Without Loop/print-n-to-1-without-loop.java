class Solution {
    public void printNos(int n) {
        // Base Case 
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        // Recursive Case
        System.out.print(n+" ");
        printNos(n-1);
    }
}