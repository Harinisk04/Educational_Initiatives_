class ProcessingState implements OrderState {
    public void proceed(OrderContext ctx) {
        ctx.setState(new ShippedState());
    }
    public void cancel(OrderContext ctx) {
        ctx.setState(new CancelledState());
    }
    public String getName() { return "Processing"; }
}
