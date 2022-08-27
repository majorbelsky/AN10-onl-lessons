package lesson13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Part2 {
    public static void main(String[] args) {

        /** Создать коллекцию класса ArrayList со значениями имен всех студентов в группе */
        List<String> students = new ArrayList<>(Arrays.asList(
                "Ivan",
                "Ekaterina",
                "Denis",
                "Vladislav",
                "Andrey",
                "Eugeni",
                "Elisaveta",
                "Nadezhda",
                "Denis",
                "Artem",
                "Alexandr"
        ));
        students.forEach(System.out::println);

        System.out.println();

        /** Вернуть количество количество людей с вашим именем (вне зависимости от верхнего/нижнего
         регистра букв) */
        System.out.println(students.stream()
                .filter(x -> x.equalsIgnoreCase("ivan"))
                .count());

        System.out.println();

        /** Выбрать все имена, начинающиеся на "а" (вне зависимости от верхнего/нижнего регистра букв)
         */
        students.stream()
                .filter(x -> x.substring(0,1).equalsIgnoreCase("a"))
                .forEach(System.out::println);

        System.out.println();

        /** Отсортировать и вернуть первый элемент коллекции или "Empty", если коллекция пуста */
        System.out.println(students.stream()
                .sorted()
                .findFirst()
                .orElse("Empty"));
    }
}
