package Week06_LinkedList;

//TC: O(n) || SC: O(1)

public class Q8_RotateList {
    int countNodes(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }

    ListNode[] reverse(ListNode head, ListNode nextToTail) {
        ListNode curr = head, prev = null, next = null;
        while (curr != nextToTail) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return new ListNode[] { prev, head };
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null)
            return null;
        int n = countNodes(head);
        k %= n;

        int i = 1;
        ListNode curr = head;
        while (i < n - k) {
            curr = curr.next;
            i++;
        }
        ListNode temp = curr.next;
        ListNode[] firstPart = reverse(head, curr.next);// firstPart[0]: head, firstPart[1]: tail
        ListNode[] secondPart = reverse(temp, null); // secondPart[0]: head, secondPart[1]: tail
        firstPart[1].next = secondPart[0];
        return reverse(firstPart[0], null)[0];
    }
}
