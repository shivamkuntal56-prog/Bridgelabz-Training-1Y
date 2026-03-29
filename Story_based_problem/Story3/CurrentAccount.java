package Story3;

public class CurrentAccount extends Account{
    public CurrentAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }
    @Override
    public void calculateInterest() {
        System.out.println("Current Interest : "+getBalance()*0.02);
    }
}
