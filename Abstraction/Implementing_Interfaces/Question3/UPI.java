package Implementing_Interfaces.Question_3;

public class UPI implements Digital_Payment{
    @Override
    public void pay(double amount) {
        System.out.println(amount+"Paid using UPI");
    }
}
