/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        // creating newNode 
         Node newNode = new Node(x);
        if(head==null) return newNode;
        // traversing to the last node 
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        // connect with the new Node 
        temp.next = newNode; // connecting with the linked list 
        // Now move tail toh the new Node
        temp = newNode;
        
        return head;
    }
}