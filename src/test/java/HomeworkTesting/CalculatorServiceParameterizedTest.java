package HomeworkTesting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceParameterizedTest {

    CalculatorService service = new CalculatorService();

    public static List<Arguments> parameter() {
        return List.of(
                Arguments.of(1, 2),
                Arguments.of(-1, -2),
                Arguments.of(-1, 2),
                Arguments.of(1, -2),
                Arguments.of(1, 1));
    }

    @ParameterizedTest
    @MethodSource("parameter")
    void testComputing(int a, int b) {
        assertEquals(a + b, service.plus(a, b));
        assertEquals(a - b, service.minus(a, b));
        assertEquals(a * b, service.multiply(a, b));
        assertEquals((double) a / b, service.divide(a, b));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> service.divide(2, 0));
    }
}