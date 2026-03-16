package Level_2;

import java.util.Scanner;

class ATM {
    String accountHolder;
    int accountNumber;
    double balance;

    void inputDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        accountHolder = sc.nextLine();

        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
    }
    void deposit(double amount) {
        balance += amount;
        System.out.println("Money Deposited: " + amount);
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Money Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ATM acc = new ATM();

        acc.inputDetails();

        System.out.print("Enter deposit amount: ");
        double d = input.nextDouble();
        acc.deposit(d);
        System.out.print("Enter withdraw amount: ");
        double w = input.nextDouble();
        acc.withdraw(w);
        acc.displayBalance();
    }
}