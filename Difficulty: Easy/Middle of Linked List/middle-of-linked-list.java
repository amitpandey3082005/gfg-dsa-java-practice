/* Linked List Node Structure
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head) {
        // logic to get middle of the linked list 
        Node temp = head;
        Node temp1 = head;
        int size =0;
        while(temp !=null){
            size++;
            temp = temp.next;
        }
        
         for(int i=0;i<(size/2)-1;i++){
              temp1 = temp1.next;
             }
         return temp1.next.data;
        
        // if(size%2==0){
        //     for(int i=0;i<(size/2)-1;i++){
        //         temp1 = temp1.next;
        //     }
        //     return temp1.next.data;
        // }else{
        //      for(int i=0;i<(size/2)-1;i++){
        //         temp1 = temp1.next;
        //     }
        //     return temp1.next.data;
        // }
    }
}