package Encapsulation.Question_6;

public class Runner {
    public static void main(String[] args) {
        FoodItem item1 = new VegItem("Paneer Roll", 120, 2);
        FoodItem item2 = new Non_VegItem("Chicken Burger", 150, 2);

        Discountable d1 = (Discountable) item1;
        Discountable d2 = (Discountable) item2;

        d1.applyDiscount(10);
        d2.applyDiscount(5);

        OrderProcessor.processOrder(item1);
        OrderProcessor.processOrder(item2);
    }
}
