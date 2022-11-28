import java.util.logging.Logger;

public class FileLogger extends BaseLogger {
    public void log(String message) {
        System.out.println("Defoult FileBaseLogger: " + message);
    }
}