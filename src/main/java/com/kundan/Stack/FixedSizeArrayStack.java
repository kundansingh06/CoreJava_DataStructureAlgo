package com.kundan.Stack;

public class FixedSizeArrayStack {

	protected int size;

	public static final int FINAL_CAPACITY = 16;

	protected int[] stackArray;

	protected int top = -1;

	public FixedSizeArrayStack() {
		this(FINAL_CAPACITY); // default capacity
	}

	public FixedSizeArrayStack(int size) {
		this.size = size;
		stackArray = new int[size];
	}

	public int size() {
		return (top + 1);
	}

	public boolean isFull() {
		return (size - 1 == top);
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public void push(int pushedElement) {
		if (!isFull()) {
			top = top + 1;
			stackArray[top] = pushedElement;
			System.out.println("Pushed element:" + pushedElement);
		} else {
			System.out.println("Stack is full !");
		}
	}

	public int top() throws Exception {
		if (isEmpty())
			throw new Exception("Stack is empty.");
		return stackArray[top];
	}

	public int pop() throws Exception {
		int data;
		if (!isEmpty()) {
			// throw new Exception("Stack is empty.");
			data = stackArray[top];
			// stackArray[top] = Integer.MIN_VALUE;
			top = top - 1;
			return data;
		} else {
			System.out.println("Stack is empty !");
			return -1;
		}
	}

	public static void main(String args[]) throws Exception {

		FixedSizeArrayStack myStack = new FixedSizeArrayStack(10);

		myStack.push(5);
		myStack.push(8);

		System.out.println("Size of stack : " + myStack.size());

		System.out.println("Pop element from Stack : " + myStack.pop());
		System.out.println("Pop element from Stack : " + myStack.pop());
		System.out.println("Pop element from Stack : " + myStack.pop());

		/*
		 * ;
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * System.out.println("Print stack elements after opo() : " +
		 * myStack.toString());
		 */
	}
}
