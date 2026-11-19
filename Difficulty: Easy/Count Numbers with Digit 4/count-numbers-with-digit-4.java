class Solution {
    // function to chck number has digit 4 appear in any place one tens etc 
    public static boolean hasDigitFour(int n){
        
        while(n>0){
            if(n%10==4){
               return true; // if one appear at unit place 
            }
            // otherwise check 4 appearence in places like tenth 100th place in the number n 
            n/=10;
        }
        
        return false;

    }
    public static int countNumberswith4(int n) {
        // code here
        int i= 1,count=0;
        while(i<=n){
            if(hasDigitFour(i)){
                count++;
            }
            i++;
        }
        
        return count;
    }
}
