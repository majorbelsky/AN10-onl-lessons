package lesson05;

import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {



        /*
        1. Создайте трехмерный массив из целых чисел. С помощью циклов «пройти» по всему массиву и увеличить каждый
           элемент на заданное число. Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли.
        */

        int[][][] arr1 = new int[][][] {
                {
                    {32, 48, 56},
                    {71, 29, 11},
                    { 0, 19, 82},
                    {93,  7,  2}
                },
                {
                    {46, 72, 99},
                    {16, 12, 87},
                    { 3, 17, 54},
                    {95, 48, 62}
                },
                {
                    {15, 47, 81},
                    {93, 51, 78},
                    {39,  8, 12},
                    {87, 68, 27}
                },
                {
                    {84, 25, 16},
                    { 4, 17, 67},
                    {37, 84, 72},
                    {86, 45, 60}
                }
        };

        System.out.print("Enter number to add: ");
        Scanner scanner = new Scanner(System.in);
        int addNumber = scanner.nextInt();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                for (int k = 0; k < arr1[i][j].length; k++) {
                    arr1[i][j][k] += addNumber;
                }
            }
        }



        /*
        2. Шахматная доска. Создайте программу для раскраски шахматной доски с помощью цикла. Использовать двумерный
           массив String размером 8х8. С помощью циклов задать элементам значения B (Black) или W (White).
        */

        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < chessBoard[i].length; j++) {
                    if (j % 2 == 0) {
                        chessBoard[i][j] = "W";
                    } else {
                        chessBoard[i][j] = "B";
                    }
                }
            } else {
                for (int j = 0; j < chessBoard[i].length; j++) {
                    if (j % 2 == 0) {
                        chessBoard[i][j] = "B";
                    } else {
                        chessBoard[i][j] = "W";
                    }
                }
            }
        }

        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                System.out.printf("%2s ", chessBoard[i][j]);
            }
            System.out.println();
        }
    }
}
