package Encapsulation.Question_3;

public class Bike extends Vehical implements Insurable{
    private int policiyNumber;

    public Bike( String vehicalNumber,String type,double rentalRate){
        super(vehicalNumber,"Bike",rentalRate);
        this.policiyNumber= policiyNumber;
    }

    @Override
    public int calculateInsurance(int days) {
        return 50*days;
    }
    @Override
    public String getInsuranceDetails() {
        return "bike insurance";
    }
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate()*days;
    }
}
