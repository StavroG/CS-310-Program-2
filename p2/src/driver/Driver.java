package driver;

import data_structures.LinearList;
import data_structures.Stack;
import data_structures.Queue;

public class Driver {
	private LinearList<Integer> list = new LinearList<Integer>();
	private Stack<Integer> stack = new Stack<Integer>();
	private Queue<Integer> queue = new Queue<Integer>();
	
	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.test();
	}

	private void test() {
		linearListTest();
		stackTest();
		queueTest();
	}
	
	private void linearListTest() {
		System.out.println("============= Start of linearlist test =============");
		containsTest();
		removeTest();
		addTest();
	}
	
	private void addTest() {
		System.out.println();
		System.out.println("Should be: 4, 3, 2, 1");
		list.clear();
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		list.addFirst(4);
		for(Integer i : list) {
			System.out.print(i + " ");
			System.out.println();
		}
		list.clear();
		System.out.println();
		System.out.println("Should print 99 - 0");
		for (int i = 0; i < 100; i++) {
			list.addFirst(i);
		}
		list.printList();
	}
	
	private void containsTest() {
		list.clear();
		list.addFirst(1);
		if (list.contains(1) && !list.contains(10)) {
			System.out.println("Contains works");
		}
		else {
			System.out.println("Contains does not work");
		}
		if (list.find(1) == 1 && list.find(10) == null) {
			System.out.println("Find works");
		}
		else {
			System.out.println("Find does not work");
		}
	}
	
	private void removeTest() {
		list.clear();
		list.addFirst(1);
		list.addLast(4);
		list.addFirst(3);
		System.out.println();
		System.out.println("List before removing element");
		list.printList();
		System.out.println(list.remove(3));
		System.out.println();
		System.out.println("List after removing 3");
		list.printList();
	}
	
	private void stackTest() {
		System.out.println("============= Start of stack test =============");
		System.out.println("Should be: 3, 2, 1");
		stack.makeEmpty();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.printStack();
		System.out.println();
		System.out.println("Should be: 2, 1");
		stack.pop();
		stack.printStack();
		stack.makeEmpty();
		System.out.println();
		System.out.println("Should have nothing in stack");
		stack.push(1);
		stack.pop();
		stack.printStack();
		System.out.println();
		System.out.println("Should have 1 item in stack");
		stack.push(1);
		stack.printStack();
		System.out.println();
		System.out.println("Should be: 3, 2, 1");
		stack.makeEmpty();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		for(Integer i : stack) {
		   System.out.println(i + " ");
		}
		System.out.println();
		System.out.println("Should print 99 - 0");
		stack.makeEmpty();
		for (int i = 0; i < 100; i++) {
			stack.push(i);
		}
		stack.printStack();
	}
	
	private void queueTest() {
		System.out.println("============= Start of queue test =============");
		System.out.println("Should be: 1, 2, 3");
		queue.makeEmpty();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.printQueue();
		System.out.println();
		System.out.println("Should be: 2, 3");
		queue.dequeue();
		queue.printQueue();
		queue.makeEmpty();
		System.out.println();
		System.out.println("Should have nothing in queue");
		queue.enqueue(1);
		queue.dequeue();
		queue.printQueue();
		System.out.println();
		System.out.println("Should have 1 item in queue");
		queue.enqueue(1);
		queue.printQueue();
		System.out.println();
		System.out.println("Should be: 1, 2, 3");
		queue.makeEmpty();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		for(Integer i : queue) {
		   System.out.println(i + " ");
		}
		System.out.println();
		System.out.println("Should print 0 - 99");
		queue.makeEmpty();
		for (int i = 0; i < 100; i++) {
			queue.enqueue(i);
		}
		queue.printQueue();
	}
}
