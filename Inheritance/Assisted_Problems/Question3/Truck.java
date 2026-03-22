package Assisted_Problems.Question_3;

public class Truck extends Vehicle{

    String  loadingCapacity = "20 tons";

    public Truck(int maxSpeed, String fuelType) {
        super(maxSpeed, fuelType);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Loading capacity : "+loadingCapacity);
    }
}
