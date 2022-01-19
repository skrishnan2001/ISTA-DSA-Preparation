package Week06_LinkedList;

//TC: O(n) || SC: O(1)

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class Q25_SortedInsertForCircularLL {
    public static Node sortedInsert(Node head, int data) {
        Node newNode = new Node(data);
        Node curr = head, prev = head;

        while (curr.next != head)
            curr = curr.next;
        Node tail = curr;

        if (data <= head.data) {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }

        else {
            curr = head.next;
            while (curr != head) {
                if (data > curr.data) {
                    prev = curr;
                    curr = curr.next;
                } else {
                    prev.next = newNode;
                    newNode.next = curr;
                    break;
                }
            }
        }
        return head;
    }
}
