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
        // creating new Node 
        Node newNode = new Node(x);
       // check list empty or not 
       if(head==null){
           head=newNode;
       }else{
           Node temp = head;
           while(temp.next !=null){
               temp = temp.next;
           }
           temp.next = newNode; // connecting new node with temp 
           temp = newNode; // move tailto the newNode
       }
       return head;
    }
}