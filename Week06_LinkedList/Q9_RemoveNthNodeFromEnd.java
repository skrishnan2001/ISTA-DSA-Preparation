package Week06_LinkedList;

//TC: O(n) || SC: O(1)

public class Q9_RemoveNthNodeFromEnd {
    int countNodes(ListNode head) {
        int len = 0;
        while (head != null) {
            head = head.next;
            len++;
        }
        return len;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null)
            return null;
        int len = countNodes(head);
        ListNode curr = head;
        int i = 1, pos = len - n + 1;
        if (pos == 1) {
            head = head.next;
            return head;
        }
        while (i < pos - 1) {
            curr = curr.next;
            i++;
        }

        if (curr.next.next == null)
            curr.next = null;
        else
            curr.next = curr.next.next;
        return head;
    }
}
