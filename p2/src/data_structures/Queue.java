/* Stavro Gorou
	cssc4063
*/

package data_structures;

import java.util.Iterator;

public class Queue<E extends Comparable<E>> implements Iterable<E> {
	private LinearList<E> queue;
	
	public Queue() {
		queue = new LinearList<E>();
	}
	
	public void printQueue() {
		queue.printList();
	}
	
	/*inserts the object obj into the queue
	*/
	public void enqueue(E obj) {
		queue.addLast(obj);
	}
	
	/* removes and returns the object at the front of the queue
	*/
	public E dequeue() {
		E tmp = queue.peekFirst();
		queue.removeFirst();
		return tmp;
	}
	
	/* returns the number of objects currently in the queue
	*/
	public int size() {
		return queue.size();
	}

	/* returns true if the queue is empty, otherwise false
	*/
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	
	/* returns but does not remove the object at the front of the queue
	*/
	public E peek() {
		return queue.peekFirst();
	}
	
	/* returns true if the Object obj is in the queue
	*/
	public boolean contains(E obj) {
		return queue.contains(obj);
	}
	
	/* returns the queue to an empty state
	*/
	public void makeEmpty() {
		queue.clear();
	}
	
	/* removes the Object obj if it is in the queue and
	* returns true, otherwise returns false.
	*/
	public boolean remove(E obj) {
		if (queue.contains(obj)) {
			queue.remove(obj);
			return true;
		}
		return false;
	}
	
	/* returns an iterator of the elements in the queue. The elements
	* must be in the same sequence as dequeue would return them.
	*/
	@Override
	public Iterator<E> iterator() {
		return queue.iterator();
	}

}
