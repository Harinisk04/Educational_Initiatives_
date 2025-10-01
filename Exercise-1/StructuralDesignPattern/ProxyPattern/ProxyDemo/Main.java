public class Main {
    public static void main(String[] args) {
        System.out.println("-- Proxy Pattern: Lazy Image Loading Demo --");
        Image img1 = new ProxyImage("photo1.jpg");
        Image img2 = new ProxyImage("photo2.jpg");
        img1.display(); // loads
        img1.display(); // cached
        img2.display(); // loads
        img2.display(); // cached
    }
}
