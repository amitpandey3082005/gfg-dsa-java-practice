/* Structure for Linked List node
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
    public ArrayList<Integer> printList(Node head) {
        // logic
        ArrayList<Integer> res = new ArrayList<>();
        Node temp = head;
        while(temp!=null){
            res.add(temp.data);
            temp = temp.next;
        }
        return res;
    }
}