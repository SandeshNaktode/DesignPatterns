package LLDVendingMachineStateDesignPattern;

public class Inventory {
    ItemShelf[] inventory = null;

    Inventory(int itemCount) {
        inventory = new ItemShelf[itemCount];
        initialEmptyInventory();
    }

    public ItemShelf[] getInventory() {
        return inventory;
    }

    public void setInventory(ItemShelf[] inventory) {
        this.inventory = inventory;
    }

    private void initialEmptyInventory() {
        int start = 101;
        for (int i = 0; i < inventory.length; i++) {
            ItemShelf shelf = new ItemShelf();
            shelf.setPositionNumber(start);
            shelf.setSoldOut(true);
            inventory[i] = shelf;
            start++;
        }
    }

    public void addItem(Item item, int positionNumber) throws Exception {
        for (ItemShelf itemShelf : inventory) {
            if (itemShelf.getPositionNumber() == positionNumber) {
                if (itemShelf.isSoldOut()) {
                    itemShelf.setItem(item);
                    itemShelf.setSoldOut(false);
                } else {
                    throw new Exception("already item is present, you can not add item here");
                }
            }
        }
    }

    public Item getItem(int positionNumber) throws Exception {
        for (ItemShelf itemShelf : inventory) {
            if (itemShelf.getPositionNumber() == positionNumber) {
                if (itemShelf.isSoldOut()) {
                    throw new Exception("item already sold out");
                } else {
                    return itemShelf.getItem();
                }
            }
        }
        throw new Exception("Invalid Code");
    }
    public void updateSoldOutItem(int codeNumber){
        for (ItemShelf itemShelf : inventory) {
            if (itemShelf.getPositionNumber() == codeNumber) {
                itemShelf.setSoldOut(true);
            }
        }
    }

}
