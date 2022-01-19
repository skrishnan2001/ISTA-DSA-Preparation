package Week06_LinkedList;

import java.util.*;

//TC: O(N) || SC: O(N)

class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};

public class Q20_FlattenMultilevelDDL {
    public Node flatten(Node head) {
        Stack<Node> st = new Stack<>();
        Node curr = head;

        while (curr != null) {
            if (curr.child != null) {
                if (curr.next != null)
                    st.add(curr.next);
                curr.next = curr.child;
                curr.child.prev = curr;
                curr.child = null;
                curr = curr.next;
            } else if (curr.next != null)
                curr = curr.next;
            else {
                if (!st.isEmpty()) {
                    Node top = st.pop();
                    curr.next = top;
                    curr.child = null;
                    top.prev = curr;
                }
                curr = curr.next;
            }
        }
        return head;
    }
}
