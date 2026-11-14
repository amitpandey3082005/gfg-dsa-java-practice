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
        // Negative position check
        if (pos < 0) return head;

        Node newNode = new Node(val);

        // simply return newNode as head
        if (pos == 1) {
            newNode.next = head;
            return newNode;
        }

        Node temp = head;
        for (int i = 1; i < pos-1  && temp != null; i++) {
            temp = temp.next;
        }

        // Agar pos is greter than the size of linkedlist
        if (temp == null) return head;

        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }
}
