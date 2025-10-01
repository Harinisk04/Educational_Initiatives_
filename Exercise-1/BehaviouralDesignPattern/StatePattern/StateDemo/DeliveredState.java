class DeliveredState implements OrderState {
    public void proceed(OrderContext ctx) {
        System.out.println("Order already delivered."); 
    }
    public void cancel(OrderContext ctx) {
        System.out.println("Cannot cancel. Order already delivered."); 
    }
    public String getName() { return "Delivered"; }
}
