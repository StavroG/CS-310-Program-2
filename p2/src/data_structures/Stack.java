/* Stavro Gorou
	cssc4063
*/

package data_structures;

import java.util.Iterator;

public class Stack<E extends Comparable<E>> implements Iterable<E> {
	private LinearList<E> stack;
	
	public Stack() {
		stack = new LinearList<E>();
	}
	
	public void printStack() {
		stack.printList();
	}
	
	/* inserts the object obj into the stack
	*/
	public void push(E obj) {
		stack.addFirst(obj);
	}
	
	/* pops and returns the element on the top of the stack
	*/
	public E pop() {
		E tmp = stack.peekFirst();
		stack.removeFirst();
		return tmp;
	}
	
	/* returns the number of elements currently in the stack
	*/
	public int size() {
		return stack.size();
	}
	
	/* return true if the stack is empty, otherwise false
	*/
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	/* returns but does not remove the element on the top of the stack
	*/
	public E peek() {
		return stack.peekFirst();
	}
	
	/* returns true if the object obj is in the stack,
	* otherwise false
	*/
	public boolean contains(E obj) {
		return stack.contains(obj);
	}
	
	/* returns the stack to an empty state
	*/
	public void makeEmpty() {
		stack.clear();
	}
	
	/* removes the Object obj if it is in the stack and
	* returns true, otherwise returns false.
	*/
	public boolean remove(E obj) {
		if (stack.contains(obj)) {
			stack.remove(obj);
			return true;
		}
		return false;
	}
	
	
	/* returns an iterator of the elements in the queue. The elements
	* must be in the same sequence as dequeue would return them.
	*/
	@Override
	public Iterator<E> iterator() {
		return stack.iterator();
	} 
}
