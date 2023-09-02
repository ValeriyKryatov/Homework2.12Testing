package HomeworkTesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
    CalculatorService service = new CalculatorService();
    @Test
    void testPlus() {
        var actual1 = service.plus(1, 2);
        assertEquals(3, actual1);

        var actual2 = service.plus(-1, -2);
        assertEquals(-3, actual2);

        var actual3 = service.plus(1, -2);
        assertEquals(-1, actual3);

        var actual4 = service.plus(-1, 2);
        assertEquals(1, actual4);

        var actual5 = service.plus(1, 0);
        assertEquals(1, actual5);
    }

    @Test
    void testMinus() {
        var actual1 = service.minus(1, 2);
        assertEquals(-1, actual1);

        var actual2 = service.minus(-1, -2);
        assertEquals(1, actual2);

        var actual3 = service.minus(1, -2);
        assertEquals(3, actual3);

        var actual4 = service.minus(-1, 2);
        assertEquals(-3, actual4);

        var actual5 = service.minus(1, 0);
        assertEquals(1, actual5);
    }

    @Test
    void testMultiply() {
        var actual1 = service.multiply(1, 2);
        assertEquals(2, actual1);

        var actual2 = service.multiply(-1, -2);
        assertEquals(2, actual2);

        var actual3 = service.multiply(1, -2);
        assertEquals(-2, actual3);

        var actual4 = service.multiply(-1, 2);
        assertEquals(-2, actual4);

        var actual5 = service.multiply(1, 0);
        assertEquals(0, actual5);
    }

    @Test
    void testDivide() {
        var actual1 = service.divide(1, 2);
        assertEquals(0.5, actual1);

        var actual2 = service.divide(-4, -2);
        assertEquals(2, actual2);

        var actual3 = service.divide(3, -2);
        assertEquals(-1.5, actual3);

        var actual4 = service.divide(-6, 3);
        assertEquals(-2, actual4);

        var actual5 = service.divide(0, 1);
        assertEquals(0, actual5);

        assertThrows(IllegalArgumentException.class, () -> service.divide(2, 0));
    }
}