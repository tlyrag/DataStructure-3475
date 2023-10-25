package Stack;

import java.awt.DisplayMode;

public class App {

	public static void main(String[] args) {
		//LinkedStackTest();
		//ArrayStackTest();
		VectorStackTest();
	
	}
	public static void LinkedStackTest() {
	LinkedStack<Integer> stack = new LinkedStack<>();
		
		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		stack.pop();
		stack.clear();
		System.out.println("First item in Stack is:"+stack.peek());
		System.out.println("Is Stack Empty?" + stack.isEmpty());
		stack.displayStack();
	}
	public static void ArrayStackTest() {
		ArrayStack<Integer> stack = new ArrayStack<>();
		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		stack.pop();
		stack.clear();
		System.out.println("First item in Stack is:"+stack.peek());
		System.out.println("Is Stack Empty?" + stack.isEmpty());
		stack.displayStack();
	}
	public static void VectorStackTest() {
		VectorStack<Integer> stack = new VectorStack();
		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		stack.pop();
		//stack.clear();
		System.out.println("First item in Stack is:"+stack.peek());
		System.out.println("Is Stack Empty?" + stack.isEmpty());
		stack.displayStack();
	}

}
