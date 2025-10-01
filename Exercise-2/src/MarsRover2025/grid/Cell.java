package MarsRover2025.grid;

import MarsRover2025.core.Position;

public class Cell implements GridComponent {
    private final Position pos;

    public Cell(Position p) { this.pos = p; }
    @Override public Position getPosition() { return pos; }
    @Override public boolean isObstacle() { return false; }
}
