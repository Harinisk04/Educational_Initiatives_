public class Main {
    public static void main(String[] args) {
        System.out.println("-- Abstract Factory Pattern: Smart Home Demo --");
        SmartDeviceFactory factoryA = new BrandAFactory();
        SmartBulb bulbA = factoryA.createBulb();
        SmartSpeaker spkA = factoryA.createSpeaker();
        bulbA.turnOn();
        spkA.play("Song A");

        SmartDeviceFactory factoryB = new BrandBFactory();
        SmartBulb bulbB = factoryB.createBulb();
        SmartSpeaker spkB = factoryB.createSpeaker();
        bulbB.turnOn();
        spkB.play("Song B");
    }
}
