package lesson03;

import java.util.Scanner;

public class Part3 {
    public static void main(String[] args) {

        /*
            1. Выведите на экран первый 11 членов последовательности Фибоначчи
        */
        int n0 = 0;
        int n1 = 1;
        int n2;
        System.out.print(n0 + " " + n1 + " ");
        for (int i = 3; i <= 11; i++) {
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }

        System.out.println(); // переход на другую строку

        /*
            2. За каждый месяц банк начисляет к сумме вклада 7% от суммы. Напишите программу, в которую
            пользователь вводит сумму вклада и количество месяцев. А банк вычисляет конечную сумму вклада
            с учетом начисления процентов за каждый месяц. Для вычисления суммы с учетом процентов
            используйте цикл for.
        */
        System.out.print("Enter deposit amount: ");
        Scanner scanner = new Scanner(System.in);
        float deposit = scanner.nextInt();
        System.out.print("Enter month amount: ");
        int month = scanner.nextInt();

        for (int i = 1; i <= month; i++) {
            deposit *= 1.07;
            System.out.println("month " + i + " deposit: " + deposit);
        }
        System.out.println("Final deposit amount: " + deposit);

        /*
            3. Напишите программу, которая выводит в консоль таблицу умножения.
        */
        for(int i = 1; i < 10; i++){
            for(int j = 1; j < 10; j++){
                System.out.printf("%5d", j * i);
            }
            System.out.println();
        }
    }
}
