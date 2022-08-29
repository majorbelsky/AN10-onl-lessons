package lesson14.Part2;

/** Создать три потока Т1, Т2 и Т3
 Реализовать выполнение потоков в последовательности Т3 -> Т2 -> Т1. Выполнить 20 раз
 T3 выводит "Привет"
 T2 выводит "Как дела?"
 T1 выводит "Что делаешь?"
 любым способом кроме join
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainClass {
    public static void main(String[] args) {

        Thread T1 = new Thread(() -> System.out.println("What are you doing?"));
        Thread T2 = new Thread(() -> System.out.print("How are you? "));
        Thread T3 = new Thread(() -> System.out.print("Hello! "));
        ExecutorService executor = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 20; i++) {
            executor.submit(T3);
            executor.submit(T2);
            executor.submit(T1);
        }

        executor.shutdown();
    }
}
