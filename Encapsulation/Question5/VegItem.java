package Encapsulation.Question_6;

public class VegItem extends FoodItem implements Discountable{
    private double discount = 0;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public void applyDiscount(double percentage) {
         this.discount=percentage;
    }
    @Override
    public String getDiscountDetails() {
        return "Veg Item Discount: " + discount + "%";
    }
    @Override
    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        return total - (total * discount / 100);
    }
}
