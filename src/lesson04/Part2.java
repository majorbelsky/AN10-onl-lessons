package lesson04;

import java.util.Arrays;
import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {



        /*
        1. Создайте массив из N-случайных целых чисел и выведите его на экран. Размер массива пусть
           задается с консоли и размер массива может быть больше 5 и меньше или равно 10. Если N не
           удовлетворяет условиям – выведите сообщение. Если пользователь ввел неподходящее N, то
           программа должна просить пользователя повторить ввод. Создайте второй массив только из четных
           элементов первого массива, если они там есть, и вывести эго на экран.
        */

        int arrRange;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Enter array range >5 and <=10: ");
            arrRange = scanner.nextInt();
            if (arrRange <= 5 || arrRange >10) {
                System.out.println("Wrong range!");
            } else break;
        }
        int[] arr1 = new int[arrRange];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 100);
        }
        System.out.println("Original Array is: "+ Arrays.toString(arr1));
        int k = 0;

        while (k < arrRange) {
            if (arr1[k] % 2 == 1) {
                System.arraycopy(arr1, k + 1, arr1, k, arr1.length - k - 1);
                arrRange--;
            } else {
                k++;
            }
        }
        System.out.println(Arrays.toString(arr1));

        arr1 = Arrays.copyOfRange(arr1, 0, arrRange);
        System.out.println("Even array " + Arrays.toString(arr1));


        /*
        2. Создайте массив и заполните его. Выведите массив на экран в строку. Замените каждый элемент с
           нечетным индексом на 0. Снова выведите массив на экран на отдельной строке.
        */

        System.out.print("Enter array range: ");
        arrRange = scanner.nextInt();
        int[] arr2 = new int[arrRange];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) (Math.random() * 100);
        }
        System.out.println("Original Array is: "+ Arrays.toString(arr2));
        for (int i = 1; i < arr2.length; i += 2) {
            arr2[i] = 0;
        }
        System.out.println("Final Array is: "+ Arrays.toString(arr2));



        /*
        3. Создайте массив строк. Заполните его произвольными именами людей. Отсортируйте массив.
           Результат выведите на консоль.
        */

        String[] arr3 = {"John", "Paul", "Elvis", "Steve", "Kurt"};
        Arrays.sort(arr3);
        System.out.println("Sorted Array is: "+ Arrays.toString(arr3));



        /*
        4. Реализуйте алгоритм сортировки пузырьком, проставляя комментарии на каждом шаге.
        */

        int[] array = new int[] {5, 0, 7, 3, 4, 2, 6, 1, 9, 8}; //Инициализация наполненного массива
        System.out.println(Arrays.toString(array) + " - original array"); //Вывод исходного массива в консоль
        boolean isSorted = false; //Показатель окончания сорировки, false - не отсортирован
        int temp; //Вспомогательная переменная
        while (!isSorted) { //Пока массив не отсортирован
            isSorted = true; //Массив отсортирован, если не выполнится условие во вложенном цикле
            for (int i = 0; i < array.length - 1; i++) { //Проходим по всем эелементам массива
                if (array[i] > array[i + 1]) { //Если элемент i больше следующего элемента
                    temp = array[i]; //Вспогогательной переменной присваиваем элемент i
                    array[i] = array[i + 1]; //на место элемента i вставляем следующий элемент
                    array[i + 1] = temp; //на место следующего элемента ставим вспомогательную переменную, т.е. элемент i
                    isSorted = false; /*
                    т.к. в этом проходе цикла были совершены действия по сортировке, массив еще не отсортирован
                    если условие не выполняется и никаких действие совершать не требуется, массив отсортирован
                    */
                }
            }
            System.out.println(Arrays.toString(array)); //Вывод массива в строку
        }
    }
}
