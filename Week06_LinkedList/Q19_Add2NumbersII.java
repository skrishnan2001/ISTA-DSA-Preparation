package Week06_LinkedList;

//TC: O(m + n) || SC: O(max(m, n))

public class Q19_Add2NumbersII {
    ListNode reverse(ListNode head) {
        ListNode prev = null, next;
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode ptr1 = l1, ptr2 = l2, curr = null, ans = null;
        int carry = 0;
        while (ptr1 != null || ptr2 != null || carry > 0) {
            int dig1 = ptr1 != null ? ptr1.val : 0;
            int dig2 = ptr2 != null ? ptr2.val : 0;
            int sum = (dig1 + dig2 + carry) % 10;
            carry = (dig1 + dig2 + carry) / 10;
            ListNode newNode = new ListNode(sum);

            if (ans == null) {
                ans = newNode;
                curr = newNode;
            } else {
                curr.next = newNode;
                curr = curr.next;
            }
            ptr1 = ptr1 != null ? ptr1.next : null;
            ptr2 = ptr2 != null ? ptr2.next : null;
        }
        return reverse(ans);
    }
}
