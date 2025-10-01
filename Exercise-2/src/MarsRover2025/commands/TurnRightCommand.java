package MarsRover2025.commands;

import MarsRover2025.core.Rover;
import MarsRover2025.exceptions.CommandExecutionException;

public class TurnRightCommand implements Command {
    @Override
    public void execute(Rover rover) {
        rover.turnRight();
    }
}
