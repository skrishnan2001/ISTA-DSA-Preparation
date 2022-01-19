package Week06_LinkedList;

//TC: O(n) || SC: O(1)

public class Q7_PalindromeLinkedList {
    ListNode reverse(ListNode head) {
        ListNode next = null, prev = null;
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;

        ListNode slow = head, fast = head, prev = null;

        // Finding middle node
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;
        slow = reverse(slow); // slow is the head of the 2nd half of the linked list

        while (head != null && slow != null) {
            if (head.val != slow.val)
                return false;
            head = head.next;
            slow = slow.next;
        }
        return true;
    }
}
