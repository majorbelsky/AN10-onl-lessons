package lesson08.Part1.Ex2;

/**
 * Класс, описывающий сущность Бухгалтер
 */

public class Accountant implements Printable{
    @Override
    public void printJobTitle() {
        System.out.println("Accountant");
    }
}
