public class Main {
    public static void main(String[] args) {
        System.out.println("-- Composite Pattern: File System Demo --");
        Folder root = new Folder("root");
        Folder docs = new Folder("docs");
        docs.add(new File("resume.pdf", 120));
        docs.add(new File("coverletter.docx", 30));
        Folder pics = new Folder("pics");
        pics.add(new File("vacation.jpg", 2048));
        root.add(docs);
        root.add(pics);
        root.showDetails(""); 
        System.out.println("Total size: " + root.getSize() + "KB");
    }
}
