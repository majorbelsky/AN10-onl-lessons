package lesson03;

import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
        /*
            1. Написать программу для вывода времени года по номеру месяца. Должно быть 2 варианта
            реализации: switch-case и if-else-if
            (Номер месяца можно либо явно задать в коде, либо вводить из консоли)
        */
        System.out.print("Enter month: ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        String season;

        // Вариант switch-case
        switch (month) {
            case 12, 1, 2 -> season = "Winter";
            case 3, 4, 5 -> season = "Spring";
            case 6, 7, 8 -> season = "Summer";
            case 9, 10, 11 -> season = "Autumn";
            default -> season = "Wrong month";
        }
        System.out.println(season);

        //Вариант if-else-if
        if (month == 12 || month <= 2 && month > 0) season = "Winter";
        else if (month >= 3 && month <= 5) season = "Spring";
        else if (month >= 6 && month <= 8) season = "Summer";
        else season = "Wrong month";
        System.out.println(season);

        /*
            2. Напишите программу, которая будет принимать на вход число (можно задать явно в коде) и на выход
            будет выводить сообщение о четности числа.
        */
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        String evenOdd;

        if (number % 2 == 0) evenOdd = "Even number";
        else evenOdd = "Odd number";
        System.out.println(evenOdd);

        /*
            3. Для числа t (температура на улице) вывести:
            - Если t > 15, то вывести «Тепло»
            - Если t <= 15 и t > -5, то вывести «Нормально»
            - Если t <= -5, то вывести «Холодно»
        */
        System.out.print("Enter temperature: ");
        int t = scanner.nextInt();
        String feel;

        if (t > 15) feel = "Warm";
        else if (t > -5) feel = "Normal";
        else feel = "Cold";
        System.out.println(feel);

        /*
            4. По введенному (можно задать явно) номеру определить цвет радуги (1 – красный, 4 – зеленый и т.д.)
        */
        System.out.print("Enter the number of color in rainbow: ");
        int colorNumber = scanner.nextInt();
        String color = switch (colorNumber) {
            case 1 -> "Red";
            case 2 -> "Orange";
            case 3 -> "Yellow";
            case 4 -> "Green";
            case 5 -> "Light blue";
            case 6 -> "Dark blue";
            case 7 -> "Purple";
            default -> "Wrong number";
        };
        System.out.println(color);
    }
}
