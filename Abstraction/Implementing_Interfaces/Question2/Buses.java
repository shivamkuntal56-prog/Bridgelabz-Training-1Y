package Implementing_Interfaces.Question_2;

public class Buses implements RentalSystem{
    @Override
    public void rent() {
        System.out.println("Bus has been rented.");
    }
    @Override
    public void returnVehicle() {
        System.out.println("Bus has been returned.");
    }
}
