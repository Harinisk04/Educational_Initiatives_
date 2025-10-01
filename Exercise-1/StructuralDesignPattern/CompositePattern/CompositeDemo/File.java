public class File implements FileSystemComponent {
    private final String name;
    private final int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void showDetails(String indent) {
        System.out.println(indent + "- File: " + name + " (" + size + "KB)"); 
    }
    public int getSize() { return size; }
}
