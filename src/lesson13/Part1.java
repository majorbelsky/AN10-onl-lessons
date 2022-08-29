package lesson13;

/** Создать коллекцию класса ArrayList наполнить ее элементами рандомными элементами типа
 Integer.
 С помощью Stream'ов:
 - +Удалить дубликаты
 - +Вывести все четные элементы в диапазоне от 7 до 17 (включительно)
 - Каждый элемент умножить на 2
 - +Отсортировать и вывести на экран первых 4 элемента
 - +Вывести количество элементов в стриме
 - +Вывести среднее арифметическое всех чисел в стриме */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Part1 {
    public static void main(String[] args) {

        /** Создать коллекцию класса ArrayList наполнить ее элементами рандомными элементами типа Integer */
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add((int) (Math.random() * 20));
        }

        list.forEach(x -> System.out.print(x + " "));

        System.out.println();

        /** Удалить дубликаты */
        list.stream()
                .distinct()
                .forEach(x -> System.out.print(x + " "));

        System.out.println();

        /** - Вывести все четные элементы в диапазоне от 7 до 17 */
        list.stream()
                .filter(x -> x > 7 && x < 17 && x % 2 == 0)
                .forEach(x -> System.out.print(x + " "));

        System.out.println();

        /** Каждый элемент умножить на 2 */
        list.stream()
                .map(x -> x * 2)
                .forEach(x -> System.out.print(x + " "));

        /** Отсортировать и вывести на экран первых 4 элемента */
        list.stream()
                .sorted()
                .limit(4)
                .forEach(x -> System.out.print(x + " "));

        System.out.println();

        /** Вывести количество элементов в стриме */
        System.out.println(list.stream().count());

        /** Вывести среднее арифметическое всех чисел в стриме */
        System.out.println(list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(-1));
    }
}
