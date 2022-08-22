package lesson11.Part1;

import lesson11.Part1.List.ArrayListOperations;
import lesson11.Part1.List.LinkedListOperations;
import lesson11.Part1.List.ListOperations;

import java.io.FileWriter;

public class MainClass {
    public static void main(String[] args) throws Exception{
        final int listLength = 10000000;
        ListOperations<Integer> linkedList = new LinkedListOperations(listLength);
        ListOperations<Integer> arrayList = new ArrayListOperations(listLength);
        FileWriter fw = new FileWriter("src/lesson11/results.txt");



        fw.write("Add first:\nLinked list: " + timer(() -> linkedList.addFirst( 50)) + "\n" +
                                    "Array list: " + timer(() -> arrayList.addFirst(50)) + "\n\n" +
                    "Add middle:\nLinked list: " + timer(() -> linkedList.addMiddle(100, 50)) + "\n" +
                                    "Array list: " + timer(() -> arrayList.addMiddle(100, 50)) + "\n\n" +
                    "Add Last:\nLinked list: " + timer(() -> linkedList.addLast( 50)) + "\n" +
                                    "Array list: " + timer(() -> arrayList.addLast(50)) + "\n\n" +
                    "Delete first:\nLinked list: " + timer(linkedList::deleteFirst) + "\n" +
                                    "Array list: " + timer(arrayList::deleteFirst) + "\n\n" +
                    "Delete middle:\nLinked list: " + timer(() -> linkedList.deleteMiddle(100)) + "\n" +
                                    "Array list: " + timer(() -> arrayList.deleteMiddle(100)) + "\n\n" +
                    "Delete last:\nLinked list: " + timer(linkedList::deleteLast) + "\n" +
                                    "Array list: " + timer(arrayList::deleteLast) + "\n\n" +
                    "Get first:\nLinked list: " + timer(linkedList::getFirst) + "\n" +
                                    "Array list: " + timer(arrayList::getFirst) + "\n\n" +
                    "Get middle:\nLinked list: " + timer(() -> linkedList.getMiddle(100)) + "\n" +
                                    "Array list: " + timer(() -> arrayList.getMiddle(100)) + "\n\n" +
                    "Get last:\nLinked list: " + timer(linkedList::getLast) + "\n" +
                                    "Array list: " + timer(arrayList::getLast) + "\n\n" +
                    "Find element:\nLinked list: " + timer(() -> linkedList.findElement(50)) + "\n" +
                                    "Array list: " + timer(() -> arrayList.findElement(50)));

        fw.close();
    }

    public static String timer(Runnable method) {
        long time = System.nanoTime();
        method.run();
        long elapsedTime = System.nanoTime() - time;
        return String.valueOf(elapsedTime);
    }
}
