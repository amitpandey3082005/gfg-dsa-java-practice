/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node insertAtFront(Node head, int x) {
        //creating new node 
        Node newNode = new Node(x);
        // connecting with head
        newNode.next = head;
        // Now move head to the newNode 
        head = newNode;
        
        return head;
    }
}