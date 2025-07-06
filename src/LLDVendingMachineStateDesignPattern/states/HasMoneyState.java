package LLDVendingMachineStateDesignPattern.states;

import LLDVendingMachineStateDesignPattern.Coin;
import LLDVendingMachineStateDesignPattern.Item;
import LLDVendingMachineStateDesignPattern.VendingMachine;

import java.util.List;

public class HasMoneyState implements IVendingMachineStates{

    VendingMachine machine;
    public HasMoneyState(){
        System.out.println("Currently Vending machine is in HasMoneyState");
    }

    public HasMoneyState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        return;
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new SelectionState());
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        System.out.println("Accepted the coin");
        machine.getCoinList().add(coin);
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) {
        System.out.println("Returned the full amount back in the Coin Dispense Tray");
        machine.setVendingMachineState(new IdleState(machine));
        return machine.getCoinList();
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("inventory can not be updated in Dispense state");
    }
}
