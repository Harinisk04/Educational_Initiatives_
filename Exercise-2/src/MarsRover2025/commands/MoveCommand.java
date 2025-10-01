package MarsRover2025.commands;

import MarsRover2025.core.Position;
import MarsRover2025.core.Rover;
import MarsRover2025.exceptions.CommandExecutionException;
import MarsRover2025.exceptions.ObstacleDetectedException;
import MarsRover2025.exceptions.OutOfBoundsException;

public class MoveCommand implements Command {
    @Override
    public void execute(Rover rover) throws CommandExecutionException {
        Position next = rover.nextPosition();
        try {
            rover.getGrid().validateWithinBounds(next);
        } catch (OutOfBoundsException e) {
            throw e;
        }
        if (rover.getGrid().isObstacle(next)) {
            throw new ObstacleDetectedException("Obstacle at " + next);
        }
        rover.moveTo(next);
    }
}
