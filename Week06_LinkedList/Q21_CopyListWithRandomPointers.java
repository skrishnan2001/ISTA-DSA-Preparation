package Week06_LinkedList;

import java.util.*;

//TC: O(n) || SC: O(n)

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class Q21_CopyListWithRandomPointers {
    public Node copyRandomList(Node head) {
        if (head == null)
            return null;

        Node cloneHead = new Node(head.val);
        Node cloneCurr = cloneHead, curr = head;
        curr = curr.next;

        Map<Node, Node> mp = new HashMap<>();
        mp.put(head, cloneHead);

        while (curr != null) {
            Node nextNode = new Node(curr.val);
            cloneCurr.next = nextNode;
            mp.put(curr, nextNode);
            curr = curr.next;
            cloneCurr = cloneCurr.next;
        }

        curr = head;
        cloneCurr = cloneHead;

        while (curr != null) {
            cloneCurr.random = mp.get(curr.random);
            curr = curr.next;
            cloneCurr = cloneCurr.next;
        }

        return cloneHead;
    }
}
