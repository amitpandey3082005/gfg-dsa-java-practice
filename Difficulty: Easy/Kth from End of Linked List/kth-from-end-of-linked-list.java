/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public int getKthFromLast(Node head, int k) {
        Node temp = head;
        int length = 0;

        // 1. Total length calculate karein
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        // check k valid length or not 
        if (k > length || k <= 0) {
            return -1;
        }

        // traverse upto length-k 
        temp = head;
        for (int i = 0; i < length - k; i++) {
            temp = temp.next;
        }

        // 4. Target node ki value return karein
        return temp.data;
    }
}
