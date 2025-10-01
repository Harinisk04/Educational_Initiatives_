## Mars Rover 2025 Simulation
## Overview
This project simulates the operation of a Mars rover navigating a grid with obstacles in Java. It uses object-oriented design and patterns such as Command to process movement and turning commands. The rover moves on a user-defined grid, detects obstacles, and validates moves within bounds.
The simulation accepts commands to move the rover forward, turn left, or turn right, and reports rover status after each command.

## Structure
- **Main**: Entry point that starts the simulation by creating and running RoverSimulation.
- **application**.RoverSimulation: Manages user interaction, command execution, and simulation lifecycle.
-**commands**:
    `Command` interface for commands.
    `CommandFactory` creates commands from characters.
    `MoveCommand`, `TurnLeftCommand`, `TurnRightCommand` implement movement logic.
- **core**:
    `Rover` encapsulates rover state and motion logic.
    `Direction` enum models compass directions and turning.
    `Position` represents coordinates on the grid.
    `StatusReport` provides rover's state summary.
- **grid**:
    `Grid` models the 2D terrain and methods for obstacles and boundaries.
    `Cell` and `Obstacle` implement GridComponent interface.
- **exceptions** : Custom exceptions for command failures, obstacles, bounds, and invalid inputs.
- **logging**: `AppLogger` wraps Java logging, used for info and debug messages.

## Workflow Example
1. User inputs grid dimensions and obstacles.
2. User inputs starting rover position and facing direction.
3. User enters command string (e.g. "MMRMLM") to move and turn the rover.
4. The simulation executes each command, reporting status or errors like obstacle detection.
5. User can enter "batch" to run a sample command sequence or "exit" to quit.

## How to Run
1. Make sure you have Java (JDK 8 or later) installed.
2. Place all .java files in the same directory.
3. Compile the program:
    `javac -d out application\*.java commands\*.java core\*.java exceptions\*.java grid\*.java logging\*.java Main.java`
4. Run the program:
    `java -cp out MarsRover2025.Main`

## Sample Output
Enter grid width and height (e.g. 10 10):
10 10
Enter obstacle count:
2
Enter obstacle x y:
3 4
Enter obstacle x y:
5 7
Enter starting X Y and Direction (N,S,E,W) e.g. 0 0 N:
0 0 N
Enter command string (e.g. MMRMLM) or 'batch' to run sample or 'exit' to quit:
MMRMLM
Rover at (0,1) facing North. No Obstacles detected
Rover at (0,2) facing North. No Obstacles detected
Rover at (0,2) facing East. No Obstacles detected
Rover at (1,2) facing East. No Obstacles detected
Rover at (1,2) facing North. No Obstacles detected
Rover at (1,3) facing North. No Obstacles detected
Type commands, 'batch' or 'exit':
exit