package MarsRover2025.application;

import MarsRover2025.commands.Command;
import MarsRover2025.commands.CommandFactory;
import MarsRover2025.core.Direction;
import MarsRover2025.core.Position;
import MarsRover2025.core.Rover;
import MarsRover2025.grid.Grid;
import MarsRover2025.logging.AppLogger;
import MarsRover2025.exceptions.*;

import java.util.Scanner;
import java.util.logging.Level;

public class RoverSimulation {
    private final AppLogger logger = AppLogger.getLogger();

    public void run() {
        logger.info("Starting Mars Rover Simulation");
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter grid width and height (e.g. 10 10):");
            int w = sc.nextInt();
            int h = sc.nextInt();
            sc.nextLine();
            Grid grid = new Grid(w, h);

            System.out.println("Enter obstacle count:"); 
            int obs = sc.nextInt(); sc.nextLine();
            for (int i = 0; i < obs; i++) {
                System.out.println("Enter obstacle x y:"); 
                int ox = sc.nextInt();
                int oy = sc.nextInt();
                sc.nextLine();
                grid.addObstacle(ox, oy);
            }

            System.out.println("Enter starting X Y and Direction (N,S,E,W) e.g. 0 0 N:"); 
            int sx = sc.nextInt();
            int sy = sc.nextInt();
            String dir = sc.next();
            sc.nextLine();
            Position start = new Position(sx, sy);
            Direction d = Direction.fromString(dir);

            Rover rover = new Rover(start, d, grid);

            System.out.println("Enter command string (e.g. MMRMLM) or 'batch' to run sample or 'exit' to quit:"); 
            while (true) {
                String line = sc.nextLine().trim();
                if (line.equalsIgnoreCase("exit")) break;
                if (line.equalsIgnoreCase("batch")) {
                    // sample sequence
                    String sample = "MMRMLM";
                    System.out.println("Running sample: " + sample);
                    executeCommands(rover, sample);
                } else {
                    executeCommands(rover, line);
                }
                System.out.println("Type commands, 'batch' or 'exit':");
            }

        } catch (Exception ex) {
            logger.log(Level.SEVERE, "Unhandled error in simulation: " + ex.getMessage(), ex);
            System.out.println("Error: " + ex.getMessage());
        }

        logger.info("Shutting down simulation");
    }

    private void executeCommands(Rover rover, String commandString) {
        CommandFactory factory = new CommandFactory();
        for (char c : commandString.toCharArray()) {
            try {
                Command cmd = factory.getCommand(c);
                cmd.execute(rover);
                System.out.println(rover.getStatusReport().shortReport());
            } catch (IllegalArgumentException iae) {
                System.out.println("Invalid command: " + c);
            } catch (ObstacleDetectedException ode) {
                System.out.println("Obstacle detected: " + ode.getMessage());
            } catch (OutOfBoundsException oob) {
                System.out.println("Out of bounds: " + oob.getMessage());
            } catch (Exception e) {
                System.out.println("Command failed: " + e.getMessage());
            }
        }
    }
}
