public abstract class Account implements IAccount {
    private static final int DEFAULTBRANCH = 001;
    private static int SEQUENTIAL = 1;

    protected int branch;
    protected int number;
    protected double balance;
    protected Customer customer;


    public Account(Customer customer){
        this.branch = Account.DEFAULTBRANCH;
        this.number = SEQUENTIAL++;
        this.customer = customer;
    }

    public int getBranch() {
        return branch;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }


    @Override
    public void withdraw(double value) {
        balance -= value;
    }

    @Override
    public void deposit(double value) {
        balance += value;
    }

    @Override
    public void transfer(double value, Account DestinationAccount) {
        this.withdraw(value);
        DestinationAccount.deposit(value);
    }

    protected void printAccountInfo() {
        System.out.println(String.format("OWNER  : %s", this.customer.getName()));
        System.out.println(String.format("BRANCH : %d", this.branch));
        System.out.println(String.format("NUMBER : %d", this.number));
        System.out.println(String.format("BALANCE: %.2f", this.balance));
    }
}
