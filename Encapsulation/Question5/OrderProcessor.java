package Encapsulation.Question_6;

public class OrderProcessor {
    public static void processOrder(FoodItem item) {
        item.getItemDetails();
        System.out.println("Total Price: " + item.calculateTotalPrice());
        Discountable d = (Discountable) item;
        System.out.println(d.getDiscountDetails());

        System.out.println("----------------------");
   }
}
