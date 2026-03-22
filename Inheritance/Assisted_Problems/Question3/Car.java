package Assisted_Problems.Question_3;

public class Car extends Vehicle{

    private int seatCapacity = 8;

    public Car(int maxSpeed, String fuelType) {
        super(maxSpeed, fuelType);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seat capacity : "+seatCapacity);
    }
}
