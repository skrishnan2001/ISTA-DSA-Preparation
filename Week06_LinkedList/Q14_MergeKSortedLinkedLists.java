package Week06_LinkedList;

//TC: O(N log K) where N is the no. of nodes in the final list || SC: O(K)

import java.util.*;

public class Q14_MergeKSortedLinkedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        Comparator<ListNode> cmp = new Comparator<>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        };

        PriorityQueue<ListNode> pq = new PriorityQueue<>(cmp);

        for (ListNode list : lists) {
            if (list != null)
                pq.add(list);
        }

        if (pq.size() == 0)
            return null;

        ListNode curr = pq.poll();
        ListNode head = curr;
        if (curr.next != null)
            pq.add(curr.next);

        while (!pq.isEmpty()) {
            ListNode minNode = pq.poll();
            curr.next = minNode;
            if (minNode.next != null)
                pq.add(minNode.next);
            curr = curr.next;
        }
        return head;
    }
}
