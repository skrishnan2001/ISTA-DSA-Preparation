package Week06_LinkedList;

import java.util.*;

//TC: O(n) || SC: O(n)

public class Q11_RemoveDuplicateNodesFromLinkedListII {
    public ListNode deleteDuplicates(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            st.push(curr);
            if (curr.next.val != st.peek().val)
                curr = curr.next;
            else {
                curr = curr.next;
                while (curr != null && st.peek().val == curr.val)
                    curr = curr.next;
                st.pop();
                if (!st.isEmpty())
                    st.peek().next = curr;
                else
                    head = curr;
            }
        }
        return head;
    }
}
