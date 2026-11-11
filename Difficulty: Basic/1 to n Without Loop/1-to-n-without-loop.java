class Solution {
    public void printTillN(int n) {
        // Base case 
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printTillN(n-1);
        System.out.print(n+" ");
    }
}