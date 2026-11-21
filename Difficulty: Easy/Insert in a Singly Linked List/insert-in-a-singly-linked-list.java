/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        this.data = x;
        this.next = null;
    }
} */
class Solution {
    public Node insertPos(Node head, int pos, int val) {
        // creating new node 
        Node newNode = new Node(val);
        Node temp = head;
        if(pos<1){
            return head;
        } else if(pos == 1) {
            newNode.next  = head;
            head = newNode;
        }else{
          for(int i=1;i<pos-1 && temp.next !=null;i++){
            temp = temp.next;            
          }
          newNode.next = temp.next;
          temp.next = newNode;
        }
        return head;
    }
}
