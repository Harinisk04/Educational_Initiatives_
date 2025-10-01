public class PdfDocument implements DocumentPrototype {
    private String content;
    public PdfDocument() { this.content = ""; }
    public DocumentPrototype clone() {
        PdfDocument copy = new PdfDocument();
        copy.content = this.content;
        return copy;
    }
    public void setContent(String content) { this.content = content; }
    public String getContent() { return content; }
    public String getType() { return "PDF"; }
}
