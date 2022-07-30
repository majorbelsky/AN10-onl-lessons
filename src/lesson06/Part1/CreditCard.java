package lesson06.Part1;

public class CreditCard {
    int accountNumber;
    int currentSum;

    public CreditCard(int accountNumber, int currentSum) {
        this.accountNumber = accountNumber;
        this.currentSum = currentSum;
    }

    public static CreditCard addSum(CreditCard card, int sum) {
        card.currentSum += sum;
        return card;
    }

    public static CreditCard withdrawSum(CreditCard card, int sum) {
        if (sum > card.currentSum) {
            System.out.println("----------------------------------------------");
            System.out.println("Card" + card.accountNumber + ":Not enough funds!");
        } else {
            card.currentSum -= sum;
        }
        return card;
    }

    public static void printCardSum(CreditCard card) {
        System.out.println("Card: " + card.accountNumber + "\nCurrent sum: " + card.currentSum);
    }
}
