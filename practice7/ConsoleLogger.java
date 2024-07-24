package practice7;

import java.time.LocalDateTime;

public class ConsoleLogger implements Loggable {
    @Override
    public void log(String message) {
        System.out.printf("%s:\t%s\n", LocalDateTime.now(), message);
    }
}
