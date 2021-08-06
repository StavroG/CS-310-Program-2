# Doubly Linked List
This was a program that I completed for my data structures class in school. I used Java and eclipse to make this program. For this program I was suppose to make a Doubly Linked List class using a Nodes class. I was also to use that Doubly Linked List class for my Queue and Stack class.

What I learned:

  1. I learned how to use and create Stacks and Queue datastructures.
  2. I learned how to test my program to make sure that it is working as intended.\
  3. I learned how to create and use a Node class for the data structers that I created: Doubly linked list, Stack and Queue.

How to run the test class:
  1. javac driver/*.java data_structers/*.java
  2. java driver.Driver

Methods for LinearListADT Class:

  1. addFirst - Adds elements to the begining of the list, making that element the front node.
  2. addLast - Adds elements to the end of the list, making that element the rear node.
  3. removeFirst - Removes the first elemetn in the list. If the list has multiple elements the element that was added after the front node element becomes the front element.
  4. removeLast - Removes the last element in the list. If the list is has multiple elements the element that was in front of the last element becomes the rear element.
  5. remove - Searches the list for a value. If the value is found then that element is removed.
  6. peekFirst - Checks what is the first element in the list. Does not affect the list.
  7. peekLast - Checks what was the last elemetn in the list. Does not affect the list.
  8. contains - Searches the list for a specfic element. If the element is in the list the list returns true, false otherwise.
  9. find - Searches the list for a specific element. Returns the element closest to the front.
  10. clear - Sets every element in the list to null.
  11. isEmpty - Checks if the list is empty.
  12. isFull - Checks if the list is full.
  13. size - Returns the size of the list.

Methods for Queue Class: 

  1. enqueue - Adds an element to the back of the queue.
  2. dequeue - Removes the first element in the queue.
  3. size - Returns the size of the queue.
  4. isEmpty - Checks if the queue is empty.
  5. peek - Returns the first element in the queue, does not remove that element from the queue.
  6. contains - Checks if an element is in the queue.
  7. makeEmpty - Removes every element in the queue.
  8. remove - Searches the queue for a value. If the value is found then that element is removed.

Methods for Stack Class: 

  1. push - Adds an element to the top of the stack.
  2. pop - Removes the element on top of the stack.
  3. size - Returns the size of the stack.
  4. isEmpty - Checks if the stack is empty.
  5. peek - Returns the element on top of the stack 
  6. contains - Checks if an elemetn is in the stack.
  7. makeEmpty - Removes every element in the stack.
  8. remove - Searches the stack for a value. If the value is found then that element is removed from the stack
