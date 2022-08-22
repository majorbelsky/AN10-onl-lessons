package lesson11.Part1.List;

public interface ListOperations<T> extends Runnable {
    void addFirst(T element);
    void addMiddle(T element, int index);
    void addLast(T element);
    void deleteFirst();
    void deleteMiddle(int index);
    void deleteLast();
    T getFirst();
    T getMiddle(int index);
    T getLast();
    T findElement(T element);
}
