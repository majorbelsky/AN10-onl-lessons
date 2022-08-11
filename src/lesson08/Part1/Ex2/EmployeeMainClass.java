package lesson08.Part1.Ex2;

/**
 * Создать классы "Директор", "Рабочий", "Бухгалтер".
 * Реализовать интерфейс с методом, который печатает название должности и
 * имплементировать этот метод в созданные классы.
 */

public class EmployeeMainClass {
    public static void main(String[] args) {
        Printable worker = new Worker();
        worker.printJobTitle();
    }
}
