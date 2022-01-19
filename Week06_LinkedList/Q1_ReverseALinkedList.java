package Week06_LinkedList;

//TC: O(n) || SC: O(1)

public class Q1_ReverseALinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head, prev = null, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
