public class Main {
    public static void main(String[] args) {
        System.out.println("-- Prototype Pattern: Document Cloning Demo --");
        WordDocument template = new WordDocument("InvoiceTemplate");
        template.setContent("Customer: XYZ\nAmount: $1000");

        WordDocument cloned = (WordDocument) template.clone();
        cloned.setContent(cloned.getContent() + "\nNote: cloned copy");

        System.out.println("Original type: " + template.getType() + ", content:\n" + template.getContent());
        System.out.println("Cloned type: " + cloned.getType() + ", content:\n" + cloned.getContent());
    }
}
