package LLDVendingMachineStateDesignPattern.states;

import LLDVendingMachineStateDesignPattern.VendingMachine;

import java.util.ArrayList;

public class IdleState implements IVendingMachineStates{

    VendingMachine machine;
    public IdleState(){
        System.out.println("Currently Vending machine is in IdleState");
    }

    public IdleState(VendingMachine machine){
        System.out.println("Currently Vending machine is in IdleState");
        machine.setCoinList(new ArrayList<>());
        this.machine = machine;
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) {
        System.out.println("Clickedon InsertCoin Button");
        machine.setVendingMachineState(new HasMoneyState());
    }
}
