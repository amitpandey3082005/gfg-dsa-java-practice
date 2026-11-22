/* Linked List Node Structure
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    
    int getMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        // Jab tak fast aur uska agla node null na ho
        while (fast != null && fast.next != null) {
            slow = slow.next;          // 1 step
            fast = fast.next.next;     // 2 steps
        }

        return slow.data; // Slow hamesha middle par hoga
    }
}