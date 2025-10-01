import java.util.*;

public class Folder implements FileSystemComponent {
    private final String name;
    private final List<FileSystemComponent> children = new ArrayList<>();

    public Folder(String name) { this.name = name; }
    public void add(FileSystemComponent c) { children.add(c); }
    public void showDetails(String indent) {
        System.out.println(indent + "+ Folder: " + name);
        for (FileSystemComponent c : children) {
            c.showDetails(indent + "  ");
        }
    }
    public int getSize() {
        int total = 0;
        for (FileSystemComponent c : children) total += c.getSize();
        return total;
    }
}
