class Solution {
    public static char getMaxOccuringChar(String s) {
        
       // converting string to array 
       char[] str = s.toCharArray();
       Arrays.sort(str); // sort array 
       
       // write the siding window logic on sorted array 
       int i=0,j=0,maxFreq = Integer.MIN_VALUE;
       char maxchar = str[0];
       
       while(i<str.length && j<str.length){
            if(str[i]==str[j]){
                j++;// if element same expand Window 
            }else{
                int currfreq = j-i; // when element are different calculate size of window 
                if(currfreq > maxFreq){
                    maxFreq = currfreq;
                    maxchar = str[i];
                }
                i=j;// now bring both pointer at the same index 
            }
       }
       
       // when the last element will be max char the 
        int currfreq = j-i; // when element are different calculate size of window 
        if(currfreq > maxFreq){
            maxFreq = currfreq;
            maxchar = str[str.length-1];
        }
       
       return maxchar;
    }
}
