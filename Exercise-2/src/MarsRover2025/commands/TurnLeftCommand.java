package MarsRover2025.commands;

import MarsRover2025.core.Rover;
import MarsRover2025.exceptions.CommandExecutionException;

public class TurnLeftCommand implements Command {
    @Override
    public void execute(Rover rover) {
        rover.turnLeft();
    }
}
