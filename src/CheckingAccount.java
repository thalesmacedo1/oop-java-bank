public class CheckingAccount extends Account {

    public CheckingAccount(Customer customer) {
        super(customer);
    }

    @Override
    public void printBankStatement() {
        System.out.println("=== BANK STATEMENT CHECKING ACCOUNT ===");
        super.printAccountInfo();
    }
}