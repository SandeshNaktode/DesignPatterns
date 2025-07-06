package LLDVendingMachineStateDesignPattern;

public enum Coin {
    ONE(1),
    FIVE(5),
    TEN(10),
    TWENTY(20),
    FIFTY(50);

    public int getValue() {
        return value;
    }

    int value;

    Coin(int value) {
        this.value = value;
    }
}
