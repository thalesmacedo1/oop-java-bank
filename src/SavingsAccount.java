public class SavingsAccount extends Account {

    public SavingsAccount(Customer customer) {
        super(customer);
    }

    @Override
    public void printBankStatement() {
        System.out.println("=== BANK STATEMENT SAVINGS ACCOUNT ===");
        super.printAccountInfo();
    }
}
