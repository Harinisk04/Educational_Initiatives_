package MarsRover2025.core;

import java.util.Map;

public enum Direction {
    N(0,1), E(1,0), S(0,-1), W(-1,0);

    private final int dx;
    private final int dy;
    private static final Map<Direction, Direction> leftMap = Map.of(
        N, W, W, S, S, E, E, N
    );
    private static final Map<Direction, Direction> rightMap = Map.of(
        N, E, E, S, S, W, W, N
    );

    Direction(int dx, int dy) {
        this.dx = dx; this.dy = dy;
    }

    public int dx() { return dx; }
    public int dy() { return dy; }

    public Direction left() { return leftMap.get(this); }
    public Direction right() { return rightMap.get(this); }

    public static Direction fromString(String s) {
        if (s == null) throw new IllegalArgumentException("Direction cannot be null");
        switch (s.trim().toUpperCase()) {
            case "N": return N;
            case "S": return S;
            case "E": return E;
            case "W": return W;
            default: throw new IllegalArgumentException("Unknown direction: " + s);
        }
    }

    public String fullName() {
        switch (this) {
            case N: return "North";
            case S: return "South";
            case E: return "East";
            case W: return "West";
            default: return this.name();
        }
    }
}
