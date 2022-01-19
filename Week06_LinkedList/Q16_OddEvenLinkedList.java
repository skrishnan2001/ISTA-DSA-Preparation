package Week06_LinkedList;

//TC: O(n) || SC: O(n)

public class Q16_OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {

        if (head == null)
            return head;

        ListNode odd = head, even = head.next, evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
