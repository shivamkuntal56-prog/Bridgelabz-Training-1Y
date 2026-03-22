package Hybrid_Inheritance.Question_2;

public class PetrolVehicle extends Vehical implements Refuelable{
    public PetrolVehicle(int maxSpeed, String modal) {
        super(maxSpeed, modal);
    }
    @Override
    public void refuel() {
        System.out.println(model + " is being refueled with petrol.");
    }
}
