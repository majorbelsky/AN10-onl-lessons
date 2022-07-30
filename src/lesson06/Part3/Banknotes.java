package lesson06.Part3;

public class Banknotes {
    int banknote20;
    int banknote50;
    int banknote100;

    public Banknotes(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    public static int banknotesSum (Banknotes banknotes) {
        int sum = banknotes.banknote20 * 20
                + banknotes.banknote50 * 50
                + banknotes.banknote100 * 100;
        return sum;
    }
}
