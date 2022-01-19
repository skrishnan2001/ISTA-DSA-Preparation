package Week06_LinkedList;

//TC: O(max(m, n)) || SC: O(max(m , n))

public class Q18_Add2Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
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
        return ans;
    }
}
