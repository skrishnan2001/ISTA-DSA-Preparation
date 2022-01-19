package Week06_LinkedList;

//TC: O(n) || SC: O(1)

public class Q15_SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode prevHead = new ListNode(0);
        prevHead.next = head;
        ListNode curr = prevHead;

        while (curr.next != null && curr.next.next != null) {
            ListNode firstNode = curr.next;
            ListNode secondNode = curr.next.next;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;
            curr.next = secondNode;
            curr = curr.next.next;
        }
        return prevHead.next;
    }
}
