/*
class Node {
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
};
*/

class Solution {
    public int cycleStart(Node head) {
        // code here
        Node slow = head;
        Node fast = head;
        Node temp = head;
        
        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                while(temp != slow){
                    temp= temp.next;
                    slow = slow.next;
                }
                return temp.data;
            }
        }
        return -1; // indicate no node find i.e No loop detected 
    }
}