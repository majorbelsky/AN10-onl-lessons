package lesson06.Part3;

public class ATM {
    Banknotes banknotesInATM;
    int sumInATM;

    public ATM(Banknotes banknotesInATM) {
        this.banknotesInATM = banknotesInATM;
    }

    public void addMoney (Banknotes banknotesToAdd) {
        banknotesInATM.banknote20 += banknotesToAdd.banknote20;
        banknotesInATM.banknote50 += banknotesToAdd.banknote50;
        banknotesInATM.banknote100 += banknotesToAdd.banknote100;
    }

    public boolean withdrawMoney (Banknotes banknotesToGive) {
        boolean sucsess = false;
        if (banknotesInATM.banknote20 < banknotesToGive.banknote20
                || banknotesInATM.banknote50 < banknotesToGive.banknote50
                || banknotesInATM.banknote100 < banknotesToGive.banknote100) {
            System.out.println("Can't give this sum");
        } else {
            banknotesInATM.banknote20 -= banknotesToGive.banknote20;
            banknotesInATM.banknote50 -= banknotesToGive.banknote50;
            banknotesInATM.banknote100 -= banknotesToGive.banknote100;
            sucsess = true;
        }
        return sucsess;
    }

    public void printATMCash () {
        System.out.println("Banknotes in ATM: ");
        System.out.println("Banknote20: " + this.banknotesInATM.banknote20 + "pcs,");
        System.out.println("Banknote50: " + this.banknotesInATM.banknote50 + "pcs,");
        System.out.println("Banknote100: " + this.banknotesInATM.banknote100 + "pcs.");
    }
}
