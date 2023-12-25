package com.kundan.Stacks;

import java.util.NoSuchElementException;

class StackOfLinkedList {

    public static void main(String[] args) {

        LinkedListStack stack = new LinkedListStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);

        System.out.println("Size of stack currently is: " + stack.getSize());

        assert stack.pop() == 5;
        assert stack.pop() == 4;

        System.out.println("Top element of stack currently is: " + stack.peek());
    }
}

// A node class

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

/**
 * A class which implements a stack using a linked list
 * <p>
 * Contains all the stack methods : push, pop, printStack, isEmpty
 **/

class LinkedListStack {

    Node head;

    private int size;

    public LinkedListStack() {
        head = null;
        size = 0;
    }

    public boolean push(int x) {
        Node newNode = new Node(x);
        newNode.next = head;
        head = newNode;
        size++;
        return true;
    }

    public int pop() {
        if (size == 0) {
            throw new NoSuchElementException("Empty stack. Nothing to pop");
        }
        Node destroy = head;
        head = head.next;
        int retValue = destroy.data;
        destroy = null; // clear to let GC do it's work
        size--;
        return retValue;
    }

    public int peek() {
        if (size == 0) {
            throw new NoSuchElementException("Empty stack. Nothing to pop");
        }
        return head.data;
    }

    @Override
    public String toString() {
        Node cur = head;
        StringBuilder builder = new StringBuilder();
        while (cur != null) {
            builder.append(cur.data).append("->");
            cur = cur.next;
        }
        return builder.replace(builder.length() - 2, builder.length(), "").toString();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
