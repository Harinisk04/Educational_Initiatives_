public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("-- State Pattern: Order Lifecycle Demo --");
        OrderContext order = new OrderContext("ORD-1001");
        System.out.println("Current: " + order.getStateName());
        order.proceed(); // New -> Processing
        order.proceed(); // Processing -> Shipped
        order.cancel();  // cannot cancel
        order.proceed(); // Shipped -> Delivered
        order.cancel();  // cannot cancel
        System.out.println("Final State: " + order.getStateName());
    }
}
