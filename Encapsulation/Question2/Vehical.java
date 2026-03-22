package Encapsulation.Question_3;

abstract class Vehical {
    private String vehicalNumber;
    private String type;
    private double rentalRate;

    public Vehical(String vehicalNumber,String type,double rentalRate){
        this.vehicalNumber=vehicalNumber;
        this.type=type;
        this.rentalRate=rentalRate;
    }
    public String getVehicalNumber(){
        return vehicalNumber;
    }
    public String getType(){
        return type;
    }
    public double getRentalRate(){
      return rentalRate;
    }
    public void setRentalRate(double rentalRate){
        if(rentalRate>0) {
            this.rentalRate = rentalRate;
        }
    }
    public abstract double calculateRentalCost(int days);
}
