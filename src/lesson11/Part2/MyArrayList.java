package lesson11.Part2;

public class MyArrayList<T> {
    private static final int DEFAULT_LENGTH = 10;
    private T[] array;
    private int size = 0;

    public MyArrayList() {
        this(DEFAULT_LENGTH);
    }

    public MyArrayList(int size) {
        array = (T[]) new Object[size];
    }

    /** Add element */
    public void add(T element) {
        if (array.length == size) {
            T[] tempArray = (T[]) new Object[size * 2];
            System.arraycopy(array, 0, tempArray, 0, size);
            array = tempArray;

        }
        array[size] = element;
        size += 1;
    }

    /** Remove element */
    public boolean remove(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i] != null && array[i].equals(element)) {
                return remove(i);
            }
        }
        return false;
    }

    /** Remove element by index */
    public boolean remove(int index) throws ArrayIndexOutOfBoundsException {
        if (index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Wrong index " + index);
        } else {
            System.arraycopy(array, index + 1, array, index, size - index - 1);
            array[size - 1] = null;
            size -= 1;
        }

        return true;
    }

    /** Get element by index */
    public T get(int index) throws ArrayIndexOutOfBoundsException {
        if (index > array.length) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " is out of length " + array.length);
        }
        return array[index];
    }

    /** Check if collection contains element */
    public boolean isContains(T element) {
        for (T e : array) {
            if (e != null && e.equals(element)) {
                return true;
            }
        }
        return false;
    }

    /** Delete all elements from collection */
    public void clearAll() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }
}
