/*
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}
*/

class Solution {
    void printList(Node head) {
        // Base case 
      if (head == null) {
                 return;
             }
             System.out.print(head.data + " ");
             printList(head.next);
    }
}