## State Pattern Example: Order Lifecycle

## Overview
This project demonstrates the State design pattern in Java through a simple order lifecycle management system. The State pattern allows an object to alter its behavior when its internal state changes, making state transitions explicit and avoiding large conditional blocks.

In this example, an OrderContext object represents a customer order, and its behavior changes depending on its current state (`New, Processing, Shipped, Delivered, or Cancelled`).

## Structure
- **OrderState** (Interface):
Defines methods `proceed(OrderContext ctx), cancel(OrderContext ctx), and getName()`.
Every concrete state implements this interface to provide its own behavior.

- **NewState**:
Initial state of an order.
`proceed()` → changes state to Processing.
`cancel()` → changes state to Cancelled.

- **ProcessingState**:
Represents an order being processed.
`proceed()` → changes state to Shipped.
`cancel()` → changes state to Cancelled.

- **ShippedState**:
Represents an order already shipped.
`proceed()` → changes state to Delivered.
`cancel()` → not allowed (prints a warning).

- **DeliveredState**:
Represents an order that has been successfully delivered.
`proceed()` → not allowed (already delivered).
`cancel()` → not allowed (already delivered).

- **CancelledState**:
Represents an order that has been cancelled.
`proceed()`→ not allowed (order cancelled).
`cancel()` → not allowed (already cancelled).

-**OrderContext**:
Maintains a reference to the current OrderState.
Provides methods `proceed(), cancel(), and getStateName()`.
Handles state changes with logging messages for clarity.

- **Main**:
Demo class showing the lifecycle of an order as its state changes through different scenarios.

## Workflow Example
New order is created → Initial state is New.
Proceed → New → Processing.
Proceed → Processing → Shipped.
Cancel → not allowed (already shipped).
Proceed → Shipped → Delivered.
Cancel → not allowed (already delivered).
Final state = Delivered.

## How to Run
1. Make sure you have Java (JDK 8 or later) installed.
2. Place all .java files in the same directory.
3. Compile the program:
    `javac *.java`
4. Run the Main class:
    `java Main`


## Output
The output will show the state transitions of the order, for example:
-- State Pattern: Order Lifecycle Demo --
Current: New
[Order ORD-1001] State change: New -> Processing
[Order ORD-1001] State change: Processing -> Shipped
Cannot cancel. Order already shipped.
[Order ORD-1001] State change: Shipped -> Delivered
Cannot cancel. Order already delivered.
Final State: Delivered