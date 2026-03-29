package Story2;

public class Runner {
    public static void main(String[] args) {
        Order o1 = new RegularOrder("SK365IJ",100);
        Order o2 = new PremiumOrder("PI980UI",500);
        System.out.println("Delivery charge : "+Order.deliveryCharge);
        System.out.println("Regular order bill : "+o1.calculateBill());
        System.out.println("Premium order bill : "+o2.calculateBill());
    }
}
