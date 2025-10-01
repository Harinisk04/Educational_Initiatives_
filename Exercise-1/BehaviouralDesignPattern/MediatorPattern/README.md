## Mediator Pattern Example: Chat Room

## Overview
This project demonstrates the Mediator design pattern in Java through a simple chat room application. The Mediator pattern facilitates communication between objects `(Users)` by centralizing the interaction logic in a mediator `(ChatRoom)`, thus decoupling the components for better maintainability and flexibility.

In this example, multiple users communicate with each other through a chat room mediator. When a user sends a message, the chat room handles delivering the message to all other users except the sender.

## Structure
- **ChatMediator** (Interface):
Defines two methods: `sendMessage(String msg, User sender)` to send messages through the mediator, and `addUser(User user)` to register users with the chat room.

- **ChatRoom**:
Implements `ChatMediator`. Maintains a list of users registered in the chat room. It relays messages from a sender to all other users by invoking their `receive` method.

- **User** (Abstract Class):
Represents a user participating in the chat. Each user has a reference to the mediator and a name. Defines abstract methods `send(String message)` and `receive(String message, String from) ` to be implemented by concrete user classes.

- **ConcreteUser**:
A concrete implementation of the User class. Implements sending by printing and passing the message to the mediator, and receiving messages by printing them with the sender's name.

- **Main**:
Demo class that creates a chat room and multiple users (Alice, Bob, Carol), registers them, and simulates message exchange between them.

## Workflow Example
1. The chat room is created.
2. Users Alice, Bob, and Carol are created and added to the chat room.
3. Alice sends a message "Hi everyone!", which is received by Bob and Carol.
4. Bob replies "Hello Alice!", received by Alice and Carol.
5. Carol greets "Good day!", received by Alice and Bob.

## How to Run
1. Make sure Java (JDK 8 or later) is installed.
2. Place all .java files in the same directory.
3. Compile the files:
    `javac *.java`
4. Run the Main class:
    `java Main`

## Output
The console will display message exchanges as follows:
-- Mediator Pattern: Chat Room Demo --
[Alice] sending: Hi everyone!
[Bob] received from Alice: Hi everyone!
[Carol] received from Alice: Hi everyone!
[Bob] sending: Hello Alice!
[Alice] received from Bob: Hello Alice!
[Carol] received from Bob: Hello Alice!
[Carol] sending: Good day!
[Alice] received from Carol: Good day!
[Bob] received from Carol: Good day!