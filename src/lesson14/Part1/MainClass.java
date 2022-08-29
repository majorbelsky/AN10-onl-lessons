package lesson14.Part1;

/** Создать три потока Т1, Т2 и Т3
 Реализовать выполнение потоков в последовательности Т3 -> Т2 -> Т1. Выполнить 20 раз
 (используя метод join)
 T3 выводит "Привет"
 T2 выводит "Как дела?"
 T1 выводит "Что делаешь?"
 */

public class MainClass {
    public static void main(String[] args) throws InterruptedException {
        Spammer spammer = new Spammer();

        Thread T3 = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                spammer.printPhrase1();
            }
        });

        Thread T2 = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                spammer.printPhrase2();
            }
        });

        Thread T1 = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                spammer.printPhrase3();
            }
        });

        T3.start();
        T2.start();
        T1.start();

        T3.join();
        T2.join();
        T1.join();
    }
}
