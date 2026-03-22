package Encapsulation.Question_3;

public class Car extends Vehical implements Insurable{
    private String PolicyNumber;

    public Car(String vehicalNumber, String type, double rentalRate) {
        super(vehicalNumber,"Car", rentalRate);
        this.PolicyNumber = PolicyNumber;
    }
    @Override
    public int calculateInsurance(int days) {
        return 200*days;
    }
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate()*days;
    }
    @Override
    public String getInsuranceDetails() {
        return "Car Insurance (Policy Hidden)";
    }
}
