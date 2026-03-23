package Implementing_Interfaces.Question_3;

public class Runner {
    public static void main(String[] args) {
        Digital_Payment d1 = new CreditCard();
        Digital_Payment d2 = new UPI();
        Digital_Payment d3 = new Wallet();

        d1.pay(120);
        d2.pay(235);
        d3.pay(2356);
    }
}
