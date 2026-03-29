package Story2;

public class PremiumOrder extends Order{
    public PremiumOrder(String orderId, int baseAmount) {
        super(orderId, baseAmount);
    }
    @Override
    double calculateBill(){
        double discount = baseAmount*0.20;
        return (baseAmount-discount)+deliveryCharge;
    }
}
