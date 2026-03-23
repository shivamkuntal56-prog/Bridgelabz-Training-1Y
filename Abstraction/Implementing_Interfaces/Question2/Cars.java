package Implementing_Interfaces.Question_2;

public class Cars implements RentalSystem{
    @Override
    public void rent() {
        System.out.println("Car has been rented.");
    }
    @Override
    public void returnVehicle() {
        System.out.println("Car has been returned.");
    }
}
