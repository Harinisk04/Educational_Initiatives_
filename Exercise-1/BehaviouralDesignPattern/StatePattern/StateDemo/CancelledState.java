class CancelledState implements OrderState {
    public void proceed(OrderContext ctx) {
        System.out.println("Cannot proceed. Order cancelled."); 
    }
    public void cancel(OrderContext ctx) {
        System.out.println("Order already cancelled."); 
    }
    public String getName() { return "Cancelled"; }
}
