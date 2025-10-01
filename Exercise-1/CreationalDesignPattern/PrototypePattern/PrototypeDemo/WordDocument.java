public class WordDocument implements DocumentPrototype {
    private String content;
    private final String templateName;

    public WordDocument(String templateName) {
        this.templateName = templateName;
        this.content = "";
    }

    public DocumentPrototype clone() {
        WordDocument copy = new WordDocument(this.templateName);
        copy.content = this.content; // shallow copy ok for String
        return copy;
    }

    public void setContent(String content) { this.content = content; }
    public String getContent() { return content; }
    public String getType() { return "Word(" + templateName + ")"; }
}
