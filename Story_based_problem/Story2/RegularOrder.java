package Story2;

public class RegularOrder extends Order{
    public RegularOrder(String orderId, int baseAmount) {
        super(orderId, baseAmount);
    }
    @Override
    double calculateBill(){
        return baseAmount+deliveryCharge;
    }
}
