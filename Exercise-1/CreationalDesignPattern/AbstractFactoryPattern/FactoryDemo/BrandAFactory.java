public class BrandAFactory implements SmartDeviceFactory {
    public SmartBulb createBulb() { return new BrandABulb(); }
    public SmartSpeaker createSpeaker() { return new BrandASpeaker(); }
}
class BrandABulb implements SmartBulb {
    public void turnOn() { System.out.println("BrandA bulb ON"); }
    public void turnOff() { System.out.println("BrandA bulb OFF"); }
    public String getBrand() { return "BrandA"; }
}
class BrandASpeaker implements SmartSpeaker {
    public void play(String song) { System.out.println("BrandA speaker playing: " + song); }
    public String getBrand() { return "BrandA"; }
}
