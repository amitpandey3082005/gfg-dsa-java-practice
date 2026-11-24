/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node deleteMid(Node head) {
        // checking list empty or have single element
        if(head==null || head.next==null){
            return null;
        }
        Node prev = null;
        Node slow = head;
        Node fast = head;
       while(fast !=null && fast.next !=null){
           prev = slow;
           slow = slow.next;
           fast = fast.next.next;
       }
       prev.next = slow.next;
       return head;
    }
}
