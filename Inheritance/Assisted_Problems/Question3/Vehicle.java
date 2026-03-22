package Assisted_Problems.Question_3;

public class Vehicle {
    int maxSpeed;
    String fuelType;

    public Vehicle(int maxSpeed,String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType=fuelType;
    }
    public void displayInfo(){
        System.out.println("Maximum speed: "+maxSpeed);
        System.out.println("Fuel type : "+fuelType);
    }
}
