package Encapsulation.Question_4;

abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    protected double balance;

    public BankAccount(int accountNumber,String holderName,double balance){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }
    public void deposit(double amount){
        if(amount>0) {
            balance += amount;
        }
    }
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
        else {
            System.out.println("Invalid withdrawal!");
        }
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public String getHolderName(){
        return holderName;
    }
    public double getBalance(){
        return balance;
    }
    public abstract double calculateInterest();
}
