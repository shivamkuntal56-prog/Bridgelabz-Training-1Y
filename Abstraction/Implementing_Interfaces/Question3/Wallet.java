package Implementing_Interfaces.Question_3;

public class Wallet implements Digital_Payment {

    @Override
    public void pay(double amount) {
        System.out.println(amount+"paid using wallet");
    }
}
