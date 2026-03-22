package Assisted_Problems.Question_3;

public class MotorCycle extends Vehicle{

    int maximumSitingCapacity = 2;

    public MotorCycle(int maxSpeed, String fuelType) {
        super(maxSpeed, fuelType);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Maximum siting capacity : "+maximumSitingCapacity);
    }
}
