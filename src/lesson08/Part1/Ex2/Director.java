package lesson08.Part1.Ex2;

/**
 * Класс, описывающий сущность Директор
 */

public class Director implements Printable{
    @Override
    public void printJobTitle() {
        System.out.println("Director");
    }
}
