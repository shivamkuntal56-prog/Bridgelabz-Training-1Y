package Story3;

public class SavingsAccount extends Account{
    public SavingsAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }
    @Override
    public void calculateInterest() {
        System.out.println("Savings Interest : "+getBalance()*0.04);
    }
}
