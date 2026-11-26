/* Structure of Linked List Node
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
         if (x < 1 || head == null) {
                    return head;
                }

                if (x == 1) { // 0th index (head) delete karein
                    head = head.next;
                    return head;
                }

                // (x - 1)th index tak traverse karein
                Node temp = head;
                for (int i = 1; i < x - 1 && temp != null; i++) { // for 0 based (0 to pos-1) and 1-based(1 to pos-1)
                    temp = temp.next;
                }

                // Out of bounds check
                if (temp == null || temp.next == null) {
                    return head;
                }

                // x-th index ki node delete karein
                temp.next = temp.next.next;
                return head;
    }
}