/* Structure of Linked List Node
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = next;
    }
} */

class Solution {
    public Node deleteHead(Node head) {
        // check list empty 
        head = head.next;
        return head;
    }
}