package MarsRover2025.grid;

import MarsRover2025.core.Position;
import MarsRover2025.exceptions.OutOfBoundsException;

import java.util.HashSet;
import java.util.Set;

public class Grid {
    private final int width;
    private final int height;
    private final Set<Position> obstacles = new HashSet<>();

    public Grid(int width, int height) {
        if (width <= 0 || height <= 0) throw new IllegalArgumentException("Grid dimensions must be positive");
        this.width = width;
        this.height = height;
    }

    public void addObstacle(int x, int y) {
        validateWithinBounds(new Position(x,y));
        obstacles.add(new Position(x,y));
    }

    public boolean isObstacle(Position p) {
        return obstacles.contains(p);
    }

    public void validateWithinBounds(Position p) {
        if (p.getX() < 0 || p.getY() < 0 || p.getX() >= width || p.getY() >= height) {
            throw new OutOfBoundsException("Position " + p + " outside grid 0.." + (width-1) + " x 0.." + (height-1));
        }
    }

    @Override
    public String toString() {
        return String.format("Grid[%d x %d] Obstacles=%d", width, height, obstacles.size());
    }
}
