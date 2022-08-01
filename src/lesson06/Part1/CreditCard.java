package lesson06.Part1;

public class CreditCard {
    int accountNumber;
    int currentSum;

    public CreditCard(int accountNumber, int currentSum) {
        this.accountNumber = accountNumber;
        this.currentSum = currentSum;
    }

    public void addSum(int sum) {
        this.currentSum += sum;
    }

    public void withdrawSum(int sum) {
        if (sum > this.currentSum) {
            System.out.println("----------------------------------------------");
            System.out.println("Card" + this.accountNumber + ":Not enough funds!");
        } else {
            this.currentSum -= sum;
        }
    }

    public void printCardSum() {
        System.out.println("Card: " + this.accountNumber + "\nCurrent sum: " + this.currentSum);
    }
}
