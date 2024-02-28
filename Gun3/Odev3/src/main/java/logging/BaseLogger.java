package logging;

public abstract class BaseLogger implements Logger
{
    public void logMessage(String message)
    {
        System.out.println("Logged to console: " + message);
        log(message);
    }
}