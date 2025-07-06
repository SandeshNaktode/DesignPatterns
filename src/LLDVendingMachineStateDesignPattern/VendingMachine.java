package LLDVendingMachineStateDesignPattern;

import LLDVendingMachineStateDesignPattern.states.IVendingMachineStates;
import LLDVendingMachineStateDesignPattern.states.IdleState;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private IVendingMachineStates vendingMachineState;
    private Inventory inventory;
    private List<Coin> coinList;

    public VendingMachine() {
        this.vendingMachineState = new IdleState();
        this.inventory = new Inventory(10);
        coinList = new ArrayList<>();
    }

    public IVendingMachineStates getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(IVendingMachineStates vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }
}
