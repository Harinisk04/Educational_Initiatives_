## Proxy Pattern Example: Lazy Image Loading

## Overview
This project demonstrates the Proxy design pattern in Java through a lazy image loading example. The Proxy pattern acts as a surrogate or placeholder for another object to control access to it or add additional behavior.

In this example, a proxy object `(ProxyImage)` represents the real image object `(RealImage)`. The proxy controls loading the image from disk lazily—only when the `display()` method is called for the first time. Subsequent calls use the cached image without reloading, improving efficiency.

## Structure
- **Image** (Interface):
Declares the `display()` method implemented by both the proxy and the real image.

- **RealImage** (Real Subject):
Loads an image from disk and displays it. The loading is simulated with a delay.

- **ProxyImage** (Proxy):
Holds a reference to the `RealImage` but delays loading until display is requested. After the real image has loaded once, it uses the cached image to avoid reloading.

- **Main**:
Demonstrates creating two proxy images and calls `display()` twice on each, showing lazy loading and caching behavior.

## Workflow Example
1. Create proxies for two images "photo1.jpg" and "photo2.jpg".
2. Call display() on the first proxy. It loads the real image and displays it.
3. Call display() again on the first proxy. It uses the cached image without loading again.
4. Repeat the display calls with the second proxy, demonstrating similar lazy loading and caching.

## How to Run
1. Ensure Java (JDK 8 or later) is installed.
2. Place all .java files together.
3. Compile the files with:
    `javac *.java`
4. Run the main class:
    `java Main`

## Output
-- Proxy Pattern: Lazy Image Loading Demo --
Loading image from disk: photo1.jpg
Displaying: photo1.jpg
Using cached image: photo1.jpg
Displaying: photo1.jpg
Loading image from disk: photo2.jpg
Displaying: photo2.jpg
Using cached image: photo2.jpg
Displaying: photo2.jpg