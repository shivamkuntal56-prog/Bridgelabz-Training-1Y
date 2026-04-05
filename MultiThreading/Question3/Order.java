package Assignment_13.Question3;

public class Order implements Runnable{
    int orderId;
    String restaurantName;
    int deliveryTime;

    public Order(int orderId, String restaurantName, int deliveryTime){
        this.orderId = orderId;
        this.restaurantName = restaurantName;
        this.deliveryTime = deliveryTime;
    }
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        String agent = Thread.currentThread().getName();

        System.out.println(agent + " picked up Order " + orderId + " from " + restaurantName);
        try {
            Thread.sleep(1000);
            System.out.println(agent + " Order " + orderId + " is In Transit");

            Thread.sleep(deliveryTime * 1000);

            long totalTime = (System.currentTimeMillis() - start) / 1000;

            System.out.println(agent + " delivered Order " + orderId + " in " + totalTime + " seconds ");
        } catch (InterruptedException e) {
            System.out.println("Order " + orderId + " interrupted");
        }
    }
}
