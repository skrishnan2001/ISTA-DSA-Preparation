package Week06_LinkedList;

//TC: O(n) || SC: O(1)

public class Q4_LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null || head.next.next == null)
            return null;

        ListNode slow = head.next, fast = head.next.next;

        while (slow != fast && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast == null || fast.next == null || fast.next.next == null)
            return null;
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
