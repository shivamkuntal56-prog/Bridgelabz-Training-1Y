package Story3;

public abstract class Account {
    private long accountNumber;
    private double balance;

    static String bankName = "Indian Bank";

    public Account(long accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public double getBalance() {
        return balance;
    }
    public double getAccountNumber() {
        return accountNumber;
    }
    public abstract void calculateInterest();
}
