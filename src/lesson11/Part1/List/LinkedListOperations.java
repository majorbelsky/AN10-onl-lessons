package lesson11.Part1.List;

import java.util.LinkedList;
import java.util.Objects;

public class LinkedListOperations implements ListOperations<Integer>{

    private LinkedList<Integer> linkedList;
    private final int linkedListLength;

    public LinkedListOperations(int linkedListLength) {
        this.linkedListLength = linkedListLength;
        this.linkedList = new LinkedList<>();
        fillList();
    }

    @Override
    public void addFirst(Integer element) {
        linkedList.addFirst(element);
    }

    @Override
    public void addMiddle(Integer element, int index) {
        linkedList.add(index, element);
    }

    @Override
    public void addLast(Integer element) {
        linkedList.addLast(element);
    }

    @Override
    public void deleteFirst() {
        linkedList.removeFirst();
    }

    @Override
    public void deleteMiddle(int index) {
        linkedList.remove(index);
    }

    @Override
    public void deleteLast() {
        linkedList.removeLast();
    }

    @Override
    public Integer getFirst() {
        return linkedList.getFirst();
    }

    @Override
    public Integer getMiddle(int index) {
        return linkedList.get(index);
    }

    @Override
    public Integer getLast() {
        return linkedList.getLast();
    }

    @Override
    public Integer findElement(Integer element) {
        for (Integer i : linkedList) {
            if (Objects.equals(i, element)) {
                return i;
            }
        }
        return null;
    }

    private void fillList() {
        for (int i = 0; i < linkedListLength; i++) {
            linkedList.add(i, 0);
        }
    }

    @Override
    public void run() {

    }
}
