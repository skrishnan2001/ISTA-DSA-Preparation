package Week06_LinkedList;

import java.util.*;

//TC: O(N log N) || SC: O(N)

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class Q23_UnionOfTwoLinkedList {
    public static Node findUnion(Node head1, Node head2) {
        Node curr1 = head1, curr2 = head2;
        TreeSet<Integer> set = new TreeSet<>();

        while (curr1 != null) {
            if (!set.contains(curr1.data))
                set.add(curr1.data);
            curr1 = curr1.next;
        }

        while (curr2 != null) {
            if (!set.contains(curr2.data))
                set.add(curr2.data);
            curr2 = curr2.next;
        }

        Node sentinel = new Node(0);
        Node curr = sentinel;

        while (set.size() > 0) {
            Node newNode = new Node(set.first());
            set.remove(set.first());
            curr.next = newNode;
            curr = curr.next;
        }
        return sentinel.next;
    }
}
