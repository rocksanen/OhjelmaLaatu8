import org.example.TimeUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeUtilsTest {

    @ParameterizedTest(name="Seconds {0} to time {1}")
    @CsvSource({ "0, 00:00:00", "3665, 01:01:05", "7200, 02:00:00", "3601, 01:00:01", "86399, 23:59:59" })
    public void testSecToTime(int seconds, String expectedTime) {
        String message = "Conversion failed for seconds: " + seconds;
        String result = TimeUtils.secToTime(seconds);
        assertEquals(expectedTime, result, message);
    }

    @ParameterizedTest(name="Seconds {0} to time {1}")
    @CsvSource({ "-1, -1", "86400, -1" })
    public void testSecToTimeInvalidInput(int seconds, String expectedTime) {
        String message = "Invalid input not handled correctly for seconds: " + seconds;
        String result = TimeUtils.secToTime(seconds);
        assertEquals(expectedTime, result, message);
    }
}
