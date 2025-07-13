package DesignATM.CashWithdraw;

import DesignATM.ATM;

public class TwoThousandWithdrawProcessor extends CashWithdrawProcessor {
    public TwoThousandWithdrawProcessor(CashWithdrawProcessor cashWithdrawProcessor) {
        super(cashWithdrawProcessor);
    }

    @Override
    public void withdraw(ATM atm, int remainingAmount) {
        int requiredNote = remainingAmount / 2000;
        int balance = remainingAmount % 2000;

        if (requiredNote <= atm.getNoOfTwoThousandNotes()) {
            atm.deductTwoThousandNotes(requiredNote);
        } else if (requiredNote > atm.getNoOfTwoThousandNotes()) {
            atm.deductTwoThousandNotes(atm.getNoOfTwoThousandNotes());
            balance = balance + (requiredNote - atm.getNoOfTwoThousandNotes()) * 2000;
        }

        if (balance != 0) {
            super.withdraw(atm, balance);
        }
    }
}
