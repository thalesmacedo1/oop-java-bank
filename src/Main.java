public class Main {
    public static void main(String[] args) {
        Customer MayHoward = new Customer();
        MayHoward.setName("May Howard");

        Customer AlexanderVonDutch = new Customer();
        AlexanderVonDutch.setName("Alexander von Dutch");

        Account CA = new CheckingAccount(MayHoward);
        CA.deposit(100);

        Account SA = new SavingsAccount(AlexanderVonDutch);

        CA.transfer(100, SA);

        CA.printBankStatement();
        SA.printBankStatement();
    }
}
