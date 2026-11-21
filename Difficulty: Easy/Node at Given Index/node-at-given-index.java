/*
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
    // function to check list is emptty or not 
    public boolean isEmpty(Node head){
        if(head==null){
            return true;
        }
        return false;
    }
    public int getNode(Node head, int k) {
        // storing head node in temp node
        Node temp = head;
        if(k<0 || isEmpty(head)){
            return -1;
        }
        for(int i=0;i<k-1;i++){// for 0 based index i=0 to k
            // check idx is greter than length of linkedlist or not 
            if(temp.next == null){
                return -1;
            }
            temp = temp.next;
        }
        return temp.data;
    }
}