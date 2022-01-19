package Week06_LinkedList;

//TC: O(n log n) || SC: O(log n)

class Node {
    int data;
    Node next;

    Node(int key) {
        this.data = key;
        next = null;
    }
}

public class Q24_MergeSortForLinkedList {
    static Node mergeSort(Node head) {
        if (head == null || head.next == null)
            return head;

        Node slow = head, fast = head;

        // Finding the middle node (hare and tortoise method)
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node rightHead = slow.next;
        slow.next = null;
        head = mergeSort(head);
        rightHead = mergeSort(rightHead);
        return mergeSortedList(head, rightHead);
    }

    static Node mergeSortedList(Node leftHead, Node rightHead) {
        Node head;
        if (leftHead.data < rightHead.data) {
            head = leftHead;
            leftHead = leftHead.next;
        } else {
            head = rightHead;
            rightHead = rightHead.next;
        }

        Node ans = head;

        while (leftHead != null && rightHead != null) {
            if (leftHead.data < rightHead.data) {
                head.next = leftHead;
                leftHead = leftHead.next;
            } else {
                head.next = rightHead;
                rightHead = rightHead.next;
            }
            head = head.next;
        }

        while (leftHead != null) {
            head.next = leftHead;
            leftHead = leftHead.next;
            head = head.next;
        }

        while (rightHead != null) {
            head.next = rightHead;
            rightHead = rightHead.next;
            head = head.next;
        }
        return ans;
    }
}
