package LLDDesignATM;

public enum TransactionType {
    //Currently considering only two type of TransactionType
    CASH_WITHDRAWAL,
    BALANCE_CHECK;

    public static void showAllTransactionTypes() {
        for (TransactionType type : TransactionType.values()) {
            System.out.println(type.name());
        }
    }
}
