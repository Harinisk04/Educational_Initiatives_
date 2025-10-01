## Abstract Factory Pattern Example: Smart Home Devices

## Overview
This project demonstrates the Abstract Factory design pattern in Java using a smart home device factory example. The Abstract Factory pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.

Here, two brands `(BrandA and BrandB)` are represented with their own factories that create corresponding smart bulbs and smart speakers. This pattern ensures that the client code can work with different product families (brands) through a common interface without being concerned about their concrete implementations.

## Structure
- **SmartDeviceFactory** (Interface):
Declares factory methods `createBulb() and createSpeaker()` that return abstract products `SmartBulb and SmartSpeaker`.

- **BrandAFactory, BrandBFactory** (Concrete Factories):
Implement `SmartDeviceFactory` to create BrandA or BrandB specific bulbs and speakers.

-  **SmartBulb, SmartSpeaker** (Interfaces):
Define abstract product types with methods like `turnOn(), turnOff(), play(), and getBrand()`.

- **BrandABulb, BrandBBulb** (Concrete Products):
Implement the `SmartBulb` interface with brand-specific behavior.

- **BrandASpeaker, BrandBSpeaker** (Concrete Products):
Implement the `SmartSpeaker` interface with brand-specific behavior.

- **Main**:
Demonstrates creating and using smart home devices from different brands through their respective factories.

## Workflow Example
1. Create a `BrandAFactory`.
2. Use it to create a `BrandABulb` and `BrandASpeaker`.
3. Control the bulb and speaker (turn on, play music) which outputs brand-specific messages.
4. Similarly, create a `BrandBFactory` and its products to interact with BrandB devices.

## How to Run
1. Ensure Java (JDK 8 or later) is installed.
2. Place all .java files in the same directory.
3. Compile the Java files with:
    `javac *.java`
4. Run the Main class:
    `java Main`

## Output
-- Abstract Factory Pattern: Smart Home Demo --
BrandA bulb ON
BrandA speaker playing: Song A
BrandB bulb ON
BrandB speaker playing: Song B