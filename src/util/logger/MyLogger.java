package util.logger;


import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyLogger extends MyLoggerLevel implements ILogger {
    private MyLogger() {
        ConsoleHandler handler = new ConsoleHandler();

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

    }

    @Override
    public void info(String message) {

    }

    @Override
    public void warn(String message) {

    }

    @Override
    public void error(String message) {

    }
}


interface ILogger{
    void debug(String message);
    void info(String message);
    void warn(String message);
    void error(String message);

}