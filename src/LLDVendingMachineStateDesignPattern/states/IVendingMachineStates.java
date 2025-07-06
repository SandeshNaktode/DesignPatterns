package LLDVendingMachineStateDesignPattern.states;

import LLDVendingMachineStateDesignPattern.Coin;
import LLDVendingMachineStateDesignPattern.Item;
import LLDVendingMachineStateDesignPattern.VendingMachine;

import java.util.List;

public interface IVendingMachineStates {
    public default void clickOnInsertCoinButton(VendingMachine machine) throws Exception{
        throw new Exception("you can not click on insert coin button in: " + machine.getVendingMachineState().getClass().getSimpleName());
    };

    public default void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception{
        throw new Exception("first you need to click on insert coin button");
    }

    public default void insertCoin(VendingMachine machine , Coin coin) throws Exception{
        throw new Exception("you can not insert Coin in: "+machine.getVendingMachineState().getClass().getSimpleName());    }

    public default void chooseProduct(VendingMachine machine, int codeNumber) throws Exception{
        throw new Exception("you can not choose Product in: " + machine.getVendingMachineState().getClass().getSimpleName());
    }

    public default int getChange(VendingMachine machine, int returnChangeMoney) throws Exception{
        throw new Exception("you can not get change in: " + machine.getVendingMachineState().getClass().getSimpleName());
    }

    public default Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception{
        throw new Exception("product can not be dispensed: " + machine.getVendingMachineState().getClass().getSimpleName());
    }

    public default List<Coin> refundFullMoney(VendingMachine machine) throws Exception{
        throw new Exception("you can not get refunded in: " + machine.getVendingMachineState().getClass().getSimpleName());
    }

    public default void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception{
        machine.getInventory().addItem(item, codeNumber);
    }
}
