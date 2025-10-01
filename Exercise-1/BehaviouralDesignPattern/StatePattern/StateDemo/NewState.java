class NewState implements OrderState {
    public void proceed(OrderContext ctx) {
        ctx.setState(new ProcessingState());
    }
    public void cancel(OrderContext ctx) {
        ctx.setState(new CancelledState());
    }
    public String getName() { return "New"; }
}
