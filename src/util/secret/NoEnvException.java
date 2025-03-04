package util.secret;

public class NoEnvException extends Exception {
    public NoEnvException(String key) {
        super("not exist env %s".formatted(key));
    }
}