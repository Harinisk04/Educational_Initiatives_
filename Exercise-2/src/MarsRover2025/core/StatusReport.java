package MarsRover2025.core;

import MarsRover2025.grid.Grid;

public class StatusReport {
    private final Position position;
    private final Direction direction;
    private final Grid grid;

    public StatusReport(Position p, Direction d, Grid grid) {
        this.position = p;
        this.direction = d;
        this.grid = grid;
    }

    public String shortReport() {
        String obs = grid.isObstacle(position) ? "Obstacle present" : "No Obstacles detected";
        return String.format("Rover at %s facing %s. %s", position, direction.fullName(), obs);
    }
}
