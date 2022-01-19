package Week06_LinkedList;

//TC: O(1) || SC: O(1)

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class Q12_DeleteWithoutHead {
    void deleteNode(Node del) {
        Node nextNode = del.next;
        del.data = nextNode.data;
        del.next = nextNode.next;
    }
}
