package Week06_LinkedList;

//TC: O(n) | SC: O(1)

public class Q2_ReverseASublist {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode curr = head, prevToLeft = null;
        int pos = 1;
        while (pos < left) {
            prevToLeft = curr;
            curr = curr.next;
            pos++;
        }

        ListNode prev = null, next = null, newHeadSublist, oldHeadSublist = curr;
        while (pos <= right) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            pos++;
        }

        newHeadSublist = prev;
        oldHeadSublist.next = curr;
        if (prevToLeft != null)
            prevToLeft.next = newHeadSublist;
        else
            head = newHeadSublist;
        return head;
    }
}
