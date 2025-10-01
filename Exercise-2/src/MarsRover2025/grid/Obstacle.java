package MarsRover2025.grid;

import MarsRover2025.core.Position;

public class Obstacle implements GridComponent {
    private final Position pos;
    public Obstacle(Position p) { this.pos = p; }
    @Override public Position getPosition() { return pos; }
    @Override public boolean isObstacle() { return true; }
    @Override public String toString() { return "Obstacle@" + pos; }
}
