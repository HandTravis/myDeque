<h1>Deque ADT Implementation</h1>
  
- This repository contains a custom implementation of the Deque Abstract Data Type (ADT). The Deque (Double-Ended Queue) allows for adding and removing elements from both ends, offering a flexible and efficient way to manage data in a linear structure.
  
<h1>Features</h1>
  
- Dynamic resizing: Our Deque implementation automatically adjusts its size as elements are added or removed, ensuring efficient use of memory
- Generic elements: This implementation is type-agnostic, meaning it can store elements of any data type, including integers, strings, andobjects.
- Exception handling: Operations that attempt to access or remove elements from an empty Deque will raise clear and informative exceptions, aiding in robust error handling.
- Iterator support: The Deque includes an iterator implementation, making it compatible with for-loop iterations and other iterator-based functionalities in Python.
  
<h1>Operations</h1>

- addFirst(e): Insert an element e at the front of the Deque.
- addLast(e): Insert an element e at the rear of the Deque.
- removeFirst(): Remove and return the element at the front of the Deque. Raises an exception if the Deque is empty.
- removeLast(): Remove and return the element at the rear of the Deque. Raises an exception if the Deque is empty.
- first(): Return the element at the front of the Deque without removing it. Raises an exception if the Deque is empty.
- last(): Return the element at the rear of the Deque without removing it. Raises an exception if the Deque is empty.
- isEmpty(): Return True if the Deque is empty; False otherwise.
- size(): Return the number of elements in the Deque.
