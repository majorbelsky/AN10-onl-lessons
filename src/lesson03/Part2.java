package lesson03;

import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {

        /*
            1. При помощи цикла for вывести на экран нечетные числа от 1 до 99. (использовать инкремент)
        */
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println(); // переход на другую строку

        /*
            2. При помощи цикла for вывести на экран числа от 15 до 1. (использовать декремент)
        */
        for (int i = 15; i >=1; i--) {
            System.out.print(i + " ");
        }

        System.out.println(); // переход на другую строку

        /*
            3. Напишите программу, где пользователь вводит любое целое положительное число - N. Программа
            суммирует все числа от 1 до N. Для ввода числа используйте класс Scanner.
        */
        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum = 0;

        if (N > 0) {
            for (int i = 0; i <= N; i++) {
                sum += i;
            }
            System.out.println(sum);
        } else System.out.println("Wrong number!");

        /*
            4. Напишите программу, которая будет выводить на экран такую последовательность: 7 14 21 28 35 42
            49 56 63 70 77 84 91 98. В решении использовать цикл while
        */
        int count = 7;
        while (count <= 98) {
            System.out.print(count + " ");
            count += 7;
        }

        System.out.println(); // переход на другую строку

        /*
            5. Вывести 10 первых чисел последовательности 0, -5, -10, -15…
        */
        int count1 = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print(count1 + " ");
            count1 -= 5;
        }

        System.out.println(); // переход на другую строку

        /*
            6. Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно
        */
        for (int i = 10; i <= 20; i++) {
            System.out.print(i * i + " ");
        }
    }
}
