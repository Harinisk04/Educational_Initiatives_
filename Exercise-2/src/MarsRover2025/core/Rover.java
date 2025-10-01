package MarsRover2025.core;

import MarsRover2025.grid.Grid;
import MarsRover2025.logging.AppLogger;
import MarsRover2025.exceptions.*;

import java.util.logging.Level;

public class Rover {
    private Position position;
    private Direction direction;
    private final Grid grid;
    private final AppLogger logger = AppLogger.getLogger();

    public Rover(Position start, Direction dir, Grid grid) {
        this.position = start;
        this.direction = dir;
        this.grid = grid;
        logger.info("Rover initialized at " + position + " facing " + direction);
    }

    public Position getPosition() { return position; }
    public Direction getDirection() { return direction; }
    public Grid getGrid() { return grid; }

    public Position nextPosition() {
        return position.translate(direction.dx(), direction.dy());
    }

    public void moveTo(Position p) {
        logger.fine("Moving from " + position + " to " + p);
        this.position = p;
    }

    public void turnLeft() {
        logger.fine("Turning left from " + direction);
        this.direction = this.direction.left();
    }

    public void turnRight() {
        logger.fine("Turning right from " + direction);
        this.direction = this.direction.right();
    }

    public StatusReport getStatusReport() {
        return new StatusReport(position, direction, grid);
    }
}
