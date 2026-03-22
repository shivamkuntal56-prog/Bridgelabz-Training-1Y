package Encapsulation.Question_3;

public class Truck extends Vehical implements Insurable{

    private int policiyNumber;
    public Truck(String vehicalNumber, String type, double rentalRate) {
        super(vehicalNumber,"truck", rentalRate);
        this.policiyNumber=policiyNumber;
    }

    @Override
    public int calculateInsurance(int days) {
        return 300*days;
    }

    @Override
    public String getInsuranceDetails() {
        return "truck insurance";
    }
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate()*days;
    }
}
