package util.logger;


import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;

public class MyLogger implements ILogger {
    private MyLogger() {
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(MyLoggerLevel.DEBUG.level);
        logger = Logger.getLogger(MyLogger.class.getName());
        logger.addHandler(handler);
        logger.setLevel(MyLoggerLevel.DEBUG.level);
        logger.setUseParentHandlers(false);
    }
    private final Logger logger;
    private static MyLogger instance;

    public static MyLogger getLogger() {
        if (instance == null) {
            instance = new MyLogger();
        }
        return instance;
    }


    public void setLevel(MyLoggerLevel level){
        this.logger.setLevel(level.level);
    }

    @Override
    public void debug(String message) {
        this.logger.fine(message);
    }

    @Override
    public void info(String message) {
        this.logger.info(message);
    }

    @Override
    public void warn(String message) {
        this.logger.warning(message);
    }

    @Override
    public void error(String message) {
        this.logger.severe(message);
    }
}


interface ILogger{
    void debug(String message);
    void info(String message);
    void warn(String message);
    void error(String message);

}