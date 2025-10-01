public interface DocumentPrototype extends Cloneable {
    DocumentPrototype clone();
    void setContent(String content);
    String getContent();
    String getType();
}
