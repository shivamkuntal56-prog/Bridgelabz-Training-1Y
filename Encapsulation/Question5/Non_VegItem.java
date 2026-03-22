package Encapsulation.Question_6;

public class Non_VegItem extends FoodItem implements Discountable{
    private static final double EXTRA_CHARGE = 50;
    private double discount = 0;

    public Non_VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }
    @Override
    public void applyDiscount(double percentage) {
        this.discount=percentage;
    }
    @Override
    public String getDiscountDetails() {
        return "Non-Veg Discount: " + discount + "% + Extra Charge Applied";
    }
    @Override
    public double calculateTotalPrice() {
        double total = (getPrice() * getQuantity()) + EXTRA_CHARGE;
        return total - (total * discount / 100);
    }
}
