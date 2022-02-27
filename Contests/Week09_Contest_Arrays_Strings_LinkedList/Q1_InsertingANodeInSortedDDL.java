package Contests.Week09_Contest_Arrays_Strings_LinkedList;

//TC: O(n) | SC: O(1)
//Problem link: https://www.hackerrank.com/challenges/insert-a-node-into-a-sorted-doubly-linked-list/problem

import java.io.*;

class DoublyLinkedListNode {
    public int data;
    public DoublyLinkedListNode next;
    public DoublyLinkedListNode prev;

    public DoublyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    public DoublyLinkedListNode head;
    public DoublyLinkedListNode tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
            node.prev = this.tail;
        }

        this.tail = node;
    }
}

class DoublyLinkedListPrintHelper {
    public static void printList(DoublyLinkedListNode node, String sep, BufferedWriter bufferedWriter)
            throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }
}

public class Q1_InsertingANodeInSortedDDL {
    public static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode llist, int data) {
        DoublyLinkedListNode curr = llist, prev = null;
        while (curr != null && data > curr.data) {
            prev = curr;
            curr = curr.next;
        }

        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        if (curr == llist) {
            newNode.next = llist;
            llist.prev = newNode;
            llist = newNode;
        } else if (curr == null) {
            prev.next = newNode;
            newNode.prev = prev;
        } else {
            prev = curr.prev;
            curr.prev = newNode;
            newNode.next = curr;
            newNode.prev = prev;
            prev.next = newNode;
        }
        return llist;
    }
}
