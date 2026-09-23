class Sol {
    int[] count(String s) {
       // variable to storing lower upper numeric and special character count 
       int upper=0,lower=0,special=0,numeric=0;
       int i=0;
       while(i<s.length()){
           if(s.charAt(i)>='a' &&s.charAt(i)<='z'){
               lower++;
           }else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
               upper++;
           }else if(s.charAt(i)>='0' && s.charAt(i)<='9'){
               numeric++;
           }else{
               special++;
           }
           i++;
       }
       
       int[] arr = new int[4];
       arr[0] = upper;
       arr[1] = lower;
       arr[2] = numeric;
       arr[3] = special;
       
       return arr;
    }
}