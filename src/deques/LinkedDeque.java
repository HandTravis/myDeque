package deques;

/**
 * @see Deque
 */
public class LinkedDeque<T> extends AbstractDeque<T> {
    private int size;
    // IMPORTANT: Do not rename these fields or change their visibility.
    // We access these during grading to test your code.
    Node<T> front;
    Node<T> back;
    // Feel free to add any additional fields you may need, though.

    public LinkedDeque() {
        size = 0;
        front = new Node<>(null);
        back = new Node<>(null);
        front.next = back;
        back.prev = front;
    }

    public void addFirst(T item) {
        size += 1;
        Node<T> temp = front.next;
        front.next = new Node<>(item, front, temp);
        temp.prev = front.next;
    }

    public void addLast(T item) {
        size += 1;
        Node<T> temp = back.prev;
        back.prev = new Node<>(item, back.prev, back);
        temp.next = back.prev;
    }

    public T removeFirst() {
        if (size == 0) {
            return null;
        }
        size -= 1;
        T val = front.next.value;
        Node<T> temp = front.next.next;
        temp.prev = front;
        front.next = temp;
        return val;
    }

    public T removeLast() {
        if (size == 0) {
            return null;
        }
        size -= 1;
        T val = back.prev.value;
        Node<T> temp = back.prev.prev;
        temp.next = back;
        back.prev = temp;
        return val;
    }

    public T get(int index) {
        if ((index >= size) || (index < 0)) {
            return null;
        }
        Node<T> cur;
        if (index > size / 2) {
           cur  = back.prev;
           for (int i = size - 1; i > index; i--) {
               cur = cur.prev;
           }
        } else {
            cur = front.next;
            for (int i = 0; i < index; i++) {
                cur = cur.next;
            }
        }
        return cur.value;
    }

    public int size() {
        return size;
    }
}
