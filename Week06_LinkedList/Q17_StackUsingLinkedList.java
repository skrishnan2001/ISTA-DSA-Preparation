package Week06_LinkedList;

//TC: O(1) || SC: O(1) -> For both push and pop operation

class StackNode {
    int data;
    StackNode next;

    StackNode(int data) {
        this.data = data;
        next = null;
    }
}

public class Q17_StackUsingLinkedList {
    StackNode top;

    void push(int a) {
        StackNode newNode = new StackNode(a);
        if (top == null)
            top = newNode;
        else {
            newNode.next = top;
            top = newNode;
        }
    }

    // Function to remove an item from top of the stack.
    int pop() {
        if (top == null)
            return -1;
        else {
            StackNode currTop = top;
            int val = currTop.data;
            top = top.next;
            currTop.next = null;
            return val;
        }
    }
}
