public class OrderContext {
    private OrderState state;
    private final String orderId;

    public OrderContext(String orderId) {
        this.orderId = orderId;
        this.state = new NewState();
    }

    public void setState(OrderState state) {
        System.out.println("[Order " + orderId + "] State change: " + this.state.getName() + " -> " + state.getName());
        this.state = state;
    }

    public void proceed() { state.proceed(this); }
    public void cancel() { state.cancel(this); }
    public String getStateName() { return state.getName(); }
}
