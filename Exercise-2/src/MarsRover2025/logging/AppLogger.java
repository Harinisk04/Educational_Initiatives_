package MarsRover2025.logging;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class AppLogger {
    private static final Logger logger = Logger.getLogger("MarsRover2025");
    static {
        logger.setUseParentHandlers(false);
        ConsoleHandler ch = new ConsoleHandler();
        ch.setFormatter(new SimpleFormatter());
        logger.addHandler(ch);
        logger.setLevel(Level.INFO);
    }

    public static AppLogger getLogger() {
        return new AppLogger();
    }

    public void info(String msg) { logger.info(msg); }
    public void fine(String msg) { logger.fine(msg); }
    public void warning(String msg) { logger.warning(msg); }
    public void severe(String msg) { logger.severe(msg); }
    public void log(Level lvl, String msg, Throwable t) { logger.log(lvl, msg, t); }
}
