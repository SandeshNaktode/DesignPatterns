package LLDDesignATM.CashWithdraw;

import LLDDesignATM.ATM;

public class FiveHundredWithdrawProcessor extends CashWithdrawProcessor {
    public FiveHundredWithdrawProcessor(CashWithdrawProcessor cashWithdrawProcessor) {
        super(cashWithdrawProcessor);
    }

    @Override
    public void withdraw(ATM atm, int remainingAmount) {
        int requiredNote = remainingAmount / 500;
        int balance = remainingAmount % 500;

        if (requiredNote <= atm.getNoOfFiveHundredNotes()) {
            atm.deductFiveHundredNotes(requiredNote);
        } else if (requiredNote > atm.getNoOfFiveHundredNotes()) {
            atm.deductFiveHundredNotes(atm.getNoOfFiveHundredNotes());
            balance = balance + (requiredNote - atm.getNoOfFiveHundredNotes()) * 500;
        }

        if (balance != 0) {
            super.withdraw(atm, balance);
        }
    }

}
