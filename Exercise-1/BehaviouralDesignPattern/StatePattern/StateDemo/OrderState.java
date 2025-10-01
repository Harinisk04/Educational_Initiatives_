public interface OrderState {
    void proceed(OrderContext ctx);
    void cancel(OrderContext ctx);
    String getName();
}
