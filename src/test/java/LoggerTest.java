import org.junit.jupiter.api.Test;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.example.Logger;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoggerTest {

    @Test
    public void testLogMessageInfo() {
        Logger.logMessage("Test info message", "INFO");
        String lastLine = readLastLine(Logger.FILE_NAME);
        assertTrue(lastLine.contains("INFO"));
        assertTrue(lastLine.contains("Test info message"));
    }

    @Test
    public void testLogMessageWarning() {
        Logger.logMessage("Test warning message", "WARNING");
        String lastLine = readLastLine(Logger.FILE_NAME);
        assertTrue(lastLine.contains("WARNING"));
        assertTrue(lastLine.contains("Test warning message"));
    }

    private String readLastLine(String filename) {
        String lastLine = "";
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                lastLine = line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lastLine;
    }
}