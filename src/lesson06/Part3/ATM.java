package lesson06.Part3;

public class ATM {
    Banknotes banknotesInATM;
    int sumInATM;

    public ATM(Banknotes banknotesInATM, int sumInATM) {
        this.banknotesInATM = banknotesInATM;
        this.sumInATM = sumInATM;
    }

    public void addMoney (Banknotes banknotesToAdd) {
        banknotesInATM.banknote20 += banknotesToAdd.banknote20;
        banknotesInATM.banknote50 += banknotesToAdd.banknote50;
        banknotesInATM.banknote100 += banknotesToAdd.banknote100;
        sumInATM += Banknotes.banknotesSum(banknotesToAdd);
    }

    public boolean withdrawMoney (Banknotes banknotesToGive) {
        boolean sucsess = false;
        int sumToGive = Banknotes.banknotesSum(banknotesToGive);
        if (sumInATM < sumToGive
                || banknotesInATM.banknote20 < banknotesToGive.banknote20
                || banknotesInATM.banknote50 < banknotesToGive.banknote50
                || banknotesInATM.banknote100 < banknotesToGive.banknote100) {
            System.out.println("Can't give this sum");
        } else {
            System.out.println("Sum to give: " + sumToGive);
            banknotesInATM.banknote20 -= banknotesToGive.banknote20;
            System.out.println("Banknote20: " + banknotesToGive.banknote20 + "pcs,");
            banknotesInATM.banknote50 -= banknotesToGive.banknote50;
            System.out.println("Banknote50: " + banknotesToGive.banknote50 + "pcs,");
            banknotesInATM.banknote100 -= banknotesToGive.banknote100;
            System.out.println("Banknote100: " + banknotesToGive.banknote100 + "pcs.");
            sumInATM -= sumToGive;
            sucsess = true;
        }
        return sucsess;
    }

    public void printATMCash (ATM atm) {
        System.out.println("Sum in ATM: " + atm.sumInATM);
        System.out.println("Banknotes: ");
        System.out.println("Banknote20: " + atm.banknotesInATM.banknote20 + "pcs,");
        System.out.println("Banknote50: " + atm.banknotesInATM.banknote50 + "pcs,");
        System.out.println("Banknote100: " + atm.banknotesInATM.banknote100 + "pcs,");
    }
}
