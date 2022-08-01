package lesson06.Part3;

public class ATMMainClass {
    public static void main(String[] args) {
        Banknotes banknotesInATM = new Banknotes(100,100,100);
        ATM atm = new ATM(banknotesInATM);
        atm.printATMCash();

        Banknotes banknotesToAdd = new Banknotes(20,20,20);
        atm.addMoney(banknotesToAdd);
        atm.printATMCash();

        Banknotes banknotesToWithdraw = new Banknotes(130,120,120);
        System.out.println("Withdrawing sucsessful: " + atm.withdrawMoney(banknotesToWithdraw));
        atm.printATMCash();
    }
}
