public class Main {
    public static void main(String[] args) {
        System.out.println("-- Mediator Pattern: Chat Room Demo --");
        ChatRoom room = new ChatRoom();
        ConcreteUser alice = new ConcreteUser(room, "Alice");
        ConcreteUser bob = new ConcreteUser(room, "Bob");
        ConcreteUser carol = new ConcreteUser(room, "Carol");
        room.addUser(alice);
        room.addUser(bob);
        room.addUser(carol);

        alice.send("Hi everyone!"); 
        bob.send("Hello Alice!"); 
        carol.send("Good day!"); 
    }
}
