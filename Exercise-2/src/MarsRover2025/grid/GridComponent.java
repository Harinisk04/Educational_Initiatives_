package MarsRover2025.grid;

import MarsRover2025.core.Position;

public interface GridComponent {
    Position getPosition();
    boolean isObstacle();
}
