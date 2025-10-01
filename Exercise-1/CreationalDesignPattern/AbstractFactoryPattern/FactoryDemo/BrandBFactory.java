public class BrandBFactory implements SmartDeviceFactory {
    public SmartBulb createBulb() { return new BrandBBulb(); }
    public SmartSpeaker createSpeaker() { return new BrandBSpeaker(); }
}
class BrandBBulb implements SmartBulb {
    public void turnOn() { System.out.println("BrandB bulb ON"); }
    public void turnOff() { System.out.println("BrandB bulb OFF"); }
    public String getBrand() { return "BrandB"; }
}
class BrandBSpeaker implements SmartSpeaker {
    public void play(String song) { System.out.println("BrandB speaker playing: " + song); }
    public String getBrand() { return "BrandB"; }
}
