package Week06_LinkedList;

//TC: O(n) || SC: O(1)

class Node {
    int data;
    Node next, prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class Q22_ReverseADoublyLinkedList {
    public static Node reverseDLL(Node head) {
        if (head == null || head.next == null)
            return head;

        Node temp = null, curr = head;

        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        return temp.prev;
    }
}
