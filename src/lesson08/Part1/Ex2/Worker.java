package lesson08.Part1.Ex2;

/**
 * Класс, описывающий сущность Рабочий
 */

public class Worker implements Printable{
    public Worker() {
    }

    @Override
    public void printJobTitle() {
        System.out.println("Worker");
    }
}
