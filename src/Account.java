public abstract class Account implements IAccount {
    private int branch;
    private int number;
    private double balance;

    public int getBranch() {
        return branch;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }
}
