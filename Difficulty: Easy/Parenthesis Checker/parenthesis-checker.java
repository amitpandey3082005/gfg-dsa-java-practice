class Solution { 
    public boolean isBalanced(String s) {
       // creating a stack 
       Stack<Character> stack = new Stack<>();
       
       // traversing to the stack 
       for(int i=0;i<s.length();i++){
           char ch = s.charAt(i);
           // insert all opening parenthesis 
           if(ch=='{' || ch=='(' || ch=='['){
               stack.push(ch);
           }else if(ch=='}' || ch==')' || ch==']'){ // for closing parenthesis 
               // before inserting closing bracket we will check stcak empty or not 
               if(stack.isEmpty()){
                   return false;
               }
               // reading the element present at the top of the stack 
               char top = stack.peek();
               
               if((ch=='}' && top=='{')||
                  (ch==')' && top=='(')||
                  (ch==']' && top=='[')
                 ){
                     stack.pop(); // remove element from Top of the Stack 
                   
               }else {
                   return false;
               }
           }
       }
       
       return stack.isEmpty();
    } 
}
