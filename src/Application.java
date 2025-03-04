import util.logger.MyLogger;
import util.logger.MyLoggerLevel;

public class Application {
    public static void main(String[] args) {
        MyLogger logger = MyLogger.getLogger();
        logger.setLevel(MyLoggerLevel.DEBUG);
        logger.debug("hello");
    }
}
