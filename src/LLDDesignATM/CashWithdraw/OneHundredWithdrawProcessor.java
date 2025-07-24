package LLDDesignATM.CashWithdraw;

import LLDDesignATM.ATM;

public class OneHundredWithdrawProcessor extends CashWithdrawProcessor {
    public OneHundredWithdrawProcessor(CashWithdrawProcessor cashWithdrawProcessor) {
        super(cashWithdrawProcessor);
    }

    @Override
    public void withdraw(ATM atm, int remainingAmount) {
        int requiredNote = remainingAmount / 100;
        int balance = remainingAmount % 100;

        if (requiredNote <= atm.getNoOfOneHundredNotes()) {
            atm.deductOneHundredNotes(requiredNote);
        } else if (requiredNote > atm.getNoOfOneHundredNotes()) {
            atm.deductOneHundredNotes(atm.getNoOfOneHundredNotes());
            balance = balance + (requiredNote - atm.getNoOfOneHundredNotes()) * 100;
        }

        if (balance != 0) {
            super.withdraw(atm, balance);
        }
    }
}
