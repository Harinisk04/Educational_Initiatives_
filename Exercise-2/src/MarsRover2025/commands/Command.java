package MarsRover2025.commands;

import MarsRover2025.core.Rover;
import MarsRover2025.exceptions.CommandExecutionException;

public interface Command {
    void execute(Rover rover) throws CommandExecutionException;
}
