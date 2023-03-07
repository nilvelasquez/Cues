public interface Queue<E> {
    void push(E e) throws FullQueueException;
    E pop() throws EmptyQueueException;
    int size();
}