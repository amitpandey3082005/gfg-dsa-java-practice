/* Structure of Linked List Node
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
    Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node nextNode = curr.next; // Save the next node
            curr.next = prev;          // Reverse the current node's pointer
            prev = curr;               // Move prev forward
            curr = nextNode;           // Move curr forward
        }

        return prev; // prev is now the new head of the reversed list
    }
}
