class ShippedState implements OrderState {
    public void proceed(OrderContext ctx) {
        ctx.setState(new DeliveredState());
    }
    public void cancel(OrderContext ctx) {
        System.out.println("Cannot cancel. Order already shipped."); 
    }
    public String getName() { return "Shipped"; }
}
