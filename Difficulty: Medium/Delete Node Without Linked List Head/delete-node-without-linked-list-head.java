/* Structure of Linked List Node
class Node
{
    int data ;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/
class Solution {
    public void deleteNode(Node x) {
        x.data = x.next.data; // store value of next node data 
        x.next = x.next.next; // now break the connection x node with new value
    }
}