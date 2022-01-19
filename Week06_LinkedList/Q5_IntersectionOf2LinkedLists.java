package Week06_LinkedList;

//TC: O(n + m) || SC: O(1)

public class Q5_IntersectionOf2LinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode APointer = headA, BPointer = headB;
        while (APointer != BPointer) {
            if (APointer == null)
                APointer = headB;
            else
                APointer = APointer.next;

            if (BPointer == null)
                BPointer = headA;
            else
                BPointer = BPointer.next;
        }
        return APointer;
    }
}
