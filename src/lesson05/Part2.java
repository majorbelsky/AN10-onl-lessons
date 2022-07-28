package lesson05;

import java.util.Arrays;
import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {



        /*
        1. Умножение двух матриц. Создайте два массива целых чисел размером 3х3 (две матрицы).
           Напишите программу для умножения двух матриц.
        */

        int[][] arr1 = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] arr2 = new int[][]{
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };
        int[][] multArr = new int[3][3];

        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr2[i].length; j++) {
                for(int k = 0; k < arr2.length; k++) {
                    multArr[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }

        for (int i = 0; i < multArr.length; i++) {
            System.out.printf("%-12s%s%12s  %s%15s\n",
                    Arrays.toString(arr1[i]),
                    i == 1 ? "*" : " ",
                    Arrays.toString(arr2[i]),
                    i == 1 ? "=" : " ",
                    Arrays.toString(multArr[i])
            );
        }



        /*
            2. Создайте двумерный массив целых чисел. Выведите на консоль сумму всех элементов.
        */
        int arr3[][] = createTwoDimensionalRandomArray();
        System.out.println("Original array is: ");
        printTwoDimensionalArray(arr3);
        int sum = 0;
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                sum += arr3[i][j];
            }
        }
        System.out.println("Sum of elements = " + sum);



        /*
            3. Создайте двумерный массив. Выведите на консоль диагонали массива.
        */

        int arr4[][] = createTwoDimensionalRandomArray();
        System.out.println("Original array is: ");
        printTwoDimensionalArray(arr4);
        int maxIdx = arr4.length - 1;

        System.out.print("First diagonal: ");
        for (int i = maxIdx; i >= 0; i--) {
            System.out.printf("%3d ", arr4[i][i]);
        }
        System.out.println();

        System.out.print("Second diagonal: ");
        for (int i = maxIdx; i >= 0; i--) {
            System.out.printf("%3d ", arr4[i][maxIdx - i]);
        }
        System.out.println();



        /*
            4. Создайте двумерный массив целых чисел. Отсортируйте элементы в строках двумерного массива по возрастанию.
        */

        int arr5[][] = createTwoDimensionalRandomArray();
        System.out.println("Original array is: ");
        printTwoDimensionalArray(arr5);
        for (int i = 0; i < arr5.length; i++) {
            Arrays.sort(arr5[i]);
        }
        System.out.println();
        System.out.println("Array sorted by rows: ");
        printTwoDimensionalArray(arr5);
    }

    public static int[][] createTwoDimensionalRandomArray () {
        System.out.println();
        System.out.println("-------------------------------------------------------------------");
        System.out.println();
        System.out.print("Input rows quantity: ");
        Scanner scanner = new Scanner(System.in);
        int sizeX = scanner.nextInt();
        System.out.print("Input columns quantity: ");
        int sizeY = scanner.nextInt();
        int array[][] = new int[sizeX][sizeY];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }
        return array;
    }

    public static void printTwoDimensionalArray (int array[][]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("|");
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%3d ", array[i][j]);
            }
            System.out.println("|");
        }
    }
}
