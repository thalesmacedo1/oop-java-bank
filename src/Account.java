public abstract class Account implements IAccount {
    private static final int DEFAULTBRANCH = 001;
    private static int SEQUENTIAL = 1;

    protected int branch;
    protected int number;
    protected double balance;


    public Account(){
        this.branch = Account.DEFAULTBRANCH;
        this.number = SEQUENTIAL++;
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

    }

    @Override
    public void deposit(double value) {

    }

    @Override
    public void transfer(double value, Account DestinationAccount) {

    }
}
