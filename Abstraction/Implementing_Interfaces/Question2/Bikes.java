package Implementing_Interfaces.Question_2;

public class Bikes implements RentalSystem{
    @Override
    public void rent() {
        System.out.println("Bike has been rented.");
    }
    @Override
    public void returnVehicle() {
        System.out.println("Bike has been returned.");
    }
}
