package lesson14.Part1;

import static lesson14.Part1.Phrase.*;

public class Spammer {
    private Phrase currentPhrase = PHRASE1;

    public synchronized void printPhrase1() {
        while (currentPhrase != PHRASE1) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.print(PHRASE1);
        currentPhrase = PHRASE2;
        notifyAll();
    }

    public synchronized void printPhrase2() {
        while (currentPhrase != PHRASE2) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.print(PHRASE2);
        currentPhrase = PHRASE3;
        notifyAll();
    }

    public synchronized void printPhrase3() {
        while (currentPhrase != PHRASE3) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(PHRASE3);
        currentPhrase = PHRASE1;
        notifyAll();
    }
}

