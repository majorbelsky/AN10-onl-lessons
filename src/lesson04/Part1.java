package lesson04;

import java.util.Arrays;
import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {



        /*
        1. Создайте массив целых чисел. Напишите программу, которая выводит сообщение о том,
           входит ли заданное число в массив или нет. Пусть число для поиска задается с консоли
           (класс Scanner).
        */

        int[] arr1 = {59, 26, 87, 13, 94, 80, 5, 47, 29, 18};
        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String isInArray = " is not in array";

        for(int x : arr1){
            if(x == num){
                isInArray = " is in array";
                break;
            }
        }
        System.out.println(num + isInArray);



        /*
        2. Создайте массив целых чисел. Удалите все вхождения заданного числа из массива. Пусть
           число задается с консоли (класс Scanner). Если такого числа нет – выведите сообщение
           об этом.
        */

        int[] arr2 = {59, 26, 87, 13, 94, 80, 26, 47, 29, 18};
        System.out.println("Original array: " + Arrays.toString(arr2));
        System.out.print("Enter number to delete: ");
        int delElement = scanner.nextInt();
        boolean isDeleted = false;
        int k = 0;
        int arrRange = arr2.length;

        while (k < arrRange) {
            if (arr2[k] == delElement) {
                System.arraycopy(arr2, k + 1, arr2, k, arr2.length - k - 1);
                isDeleted = true;
                arrRange--;
            } else {
                k++;
            }
        }
        System.out.println(Arrays.toString(arr2));

        arr2 = Arrays.copyOfRange(arr2, 0, arrRange);
        System.out.println("Number " + delElement + (isDeleted ? " deleted from array. " : " is not in array. ") +
                "Final array: " + Arrays.toString(arr2));


        /*
        3. Создайте и заполните массив случайными числами и выведите минимальное,
           максимальное и среднее значение. Для генерации случайного числа используйте метод
           Math.random(). Пусть будет возможность создавать массив произвольного размера. Пусть
           размер массива вводится с консоли.
        */

        System.out.print("Enter array range: ");
        arrRange = scanner.nextInt();
        int[] arr3 = new int[arrRange];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = (int) (Math.random() * 100);
        }
        System.out.println("Original Array is: "+ Arrays.toString(arr3));
        int min = arr3[0];
        int max = arr3[0];
        float average = 0;
        for (int j : arr3) {
            average += j;
            if (j < min) min = j;
            else if (j > max) max = j;
        }
        System.out.println("Min element is " + min + "\n" + "Max element is " + max + "\n" +
                "Average is " + average / arr3.length);



        /*
        4. Создайте 2 массива из 5 чисел. Выведите массивы на консоль в двух отдельных строках.
           Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого
           из массивов это значение оказалось больше (либо сообщите, что их средние
           арифметические равны).
        */

        int[] arr4 = {72, 92, 30, 68, 55};
        int[] arr5 = {58, 34, 61, 95, 28};
        int arr4Average = 0;
        int arr5Average = 0;
        String answer;
        System.out.println("Original Array 1 is: "+ Arrays.toString(arr4) + "\n" +
                "Original Array 2 is: "+ Arrays.toString(arr5));
        for (int i = 0; i < 5; i++) {
            arr4Average += arr4[i];
            arr5Average += arr5[i];
        }
        if (arr4Average/5 > arr5Average/5) {
            answer = "First array average is greater";
        } else if (arr4Average/5 < arr5Average/5) {
            answer = "Second array average is greater";
        } else {
            answer = "Averages equals";
        }
        System.out.println(answer);
    }
}
