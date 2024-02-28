package logging;

public class DatabaseLogger extends BaseLogger {
    @java.lang.Override
    public void log(String message) {
        System.out.println("Logged to database: " + message);
    }
}
