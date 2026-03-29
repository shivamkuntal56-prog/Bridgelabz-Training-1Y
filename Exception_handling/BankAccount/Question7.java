package Execption.BankAccount;

import java.util.Scanner;

public class Question7 {
    double balance;
    public Question7(double balances){
        this.balance=balances;
    }
    public void withdraw(double amount) throws InsufficientBalanceException {
        if(amount<0){
            throw new IllegalArgumentException("Invalid amount!");
        }
        if(amount>balance){
            throw  new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double balance = input.nextDouble();

        Question7 account = new Question7(balance);

        System.out.print("Enter withdrawal amount: ");
        double amount = input.nextDouble();
        try {
            account.withdraw(amount);
        }
        catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
