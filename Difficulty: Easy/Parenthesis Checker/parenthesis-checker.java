class Solution { 
    public boolean isBalanced(String s) {
       // creating Stack 
       Stack<Character> stack = new Stack<>();
       
       for(int i=0;i<s.length();i++){
           
           char ch = s.charAt(i);
           // pushing the opening bracket to thet stack 
           if(ch=='(' || ch=='{' || ch=='['){
               stack.push(ch);
           }
           else{
               // check stack still empty or not 
               if(stack.isEmpty()){
                   return false;
               }
               
               char top = stack.peek(); // reading character from the top of the stack 
               if((ch==')' && top == '(') ||
                  (ch=='}' && top == '{') ||
                  (ch==']' && top == '[')
               ){
                    stack.pop();
                   
               }else {
                   return false;
               }
           }
       }
       return stack.isEmpty();
    } 
}
