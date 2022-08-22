package lesson11.Part1.List;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListOperations implements Runnable, ListOperations<Integer>{

    private ArrayList<Integer> arrList;
    private final int arrListLength;

    public ArrayListOperations(int arrListLength) {
        this.arrListLength = arrListLength;
        this.arrList = new ArrayList<>(arrListLength);
        fillList();
    }

    @Override
    public void addFirst(Integer element) {
        arrList.add(0, element);
    }

    @Override
    public void addMiddle(Integer element, int index) {
        arrList.add(index, element);
    }

    @Override
    public void addLast(Integer element) {
        arrList.add(arrList.size() - 1, element);
    }

    @Override
    public void deleteFirst() {
        arrList.remove(0);
    }

    @Override
    public void deleteMiddle(int index) {
        arrList.remove(index);
    }

    @Override
    public void deleteLast() {
        arrList.remove(arrList.size() - 1);
    }

    @Override
    public Integer getFirst() {
        return arrList.get(0);
    }

    @Override
    public Integer getMiddle(int index) {
        return arrList.get(index);
    }

    @Override
    public Integer getLast() {
        return arrList.get(arrList.size() - 1);
    }

    @Override
    public Integer findElement(Integer element) {
        for (Integer i : arrList) {
            if (Objects.equals(i, element)) {
                return i;
            }
        }
        return null;
    }

    private void fillList() {
        for (int i = 0; i < arrListLength; i++) {
            arrList.add(i, 0);
        }
    }

    @Override
    public void run() {

    }
}
