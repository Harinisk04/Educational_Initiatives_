package MarsRover2025.commands;

import java.util.Map;
import java.util.function.Supplier;

public class CommandFactory {
    private final Map<Character, Supplier<Command>> registry;

    public CommandFactory() {
        registry = Map.of(
            'M', MoveCommand::new,
            'L', TurnLeftCommand::new,
            'R', TurnRightCommand::new
        );
    }

    public Command getCommand(char c) {
        Supplier<Command> s = registry.get(Character.toUpperCase(c));
        if (s == null) throw new IllegalArgumentException("Unknown command: " + c);
        return s.get();
    }
}
