package HomeworkTesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    CalculatorService service = new CalculatorService();

    @Test
    void testPlusTwoPositiveNumbers() {
        var actual1 = service.plus(1, 2);
        assertEquals(3, actual1);
    }

    @Test
    void testPlusTwoNegativeNumbers() {
        var actual2 = service.plus(-1, -2);
        assertEquals(-3, actual2);
    }

    @Test
    void testPlusFirstPositiveAndSecondNegativeNumber() {
        var actual3 = service.plus(1, -2);
        assertEquals(-1, actual3);
    }

    @Test
    void testPlusFirstNegativeAndSecondPositiveNumber() {
        var actual4 = service.plus(-1, 2);
        assertEquals(1, actual4);
    }

    @Test
    void testPlusNumbersWithZero() {
        var actual5 = service.plus(1, 0);
        assertEquals(1, actual5);
    }

    @Test
    void testMinusTwoPositiveNumbers() {
        var actual1 = service.minus(1, 2);
        assertEquals(-1, actual1);
    }

    @Test
    void testMinusTwoNegativeNumbers() {
        var actual2 = service.minus(-1, -2);
        assertEquals(1, actual2);
    }

    @Test
    void testMinusFirstPositiveAndSecondNegativeNumber() {
        var actual3 = service.minus(1, -2);
        assertEquals(3, actual3);
    }

    @Test
    void testMinusFirstNegativeAndSecondPositiveNumber() {
        var actual4 = service.minus(-1, 2);
        assertEquals(-3, actual4);
    }

    @Test
    void testMinusNumbersWithZero() {
        var actual5 = service.minus(1, 0);
        assertEquals(1, actual5);
    }

    @Test
    void testMultiplyTwoPositiveNumbers() {
        var actual1 = service.multiply(1, 2);
        assertEquals(2, actual1);
    }

    @Test
    void testMultiplyTwoNegativeNumbers() {
        var actual2 = service.multiply(-1, -2);
        assertEquals(2, actual2);
    }

    @Test
    void testMultiplyFirstPositiveAndSecondNegativeNumber() {
        var actual3 = service.multiply(1, -2);
        assertEquals(-2, actual3);
    }

    @Test
    void testMultiplyFirstNegativeAndSecondPositiveNumber() {
        var actual4 = service.multiply(-1, 2);
        assertEquals(-2, actual4);
    }

    @Test
    void testMultiplyNumbersWithZero() {
        var actual5 = service.multiply(1, 0);
        assertEquals(0, actual5);
    }

    @Test
    void testDivideTwoPositiveNumbers() {
        var actual1 = service.divide(1, 2);
        assertEquals(0.5, actual1);
    }

    @Test
    void testDivideTwoNegativeNumbers() {
        var actual2 = service.divide(-4, -2);
        assertEquals(2, actual2);
    }

    @Test
    void testDivideFirstPositiveAndSecondNegativeNumber() {
        var actual3 = service.divide(3, -2);
        assertEquals(-1.5, actual3);
    }

    @Test
    void testDivideFirstNegativeAndSecondPositiveNumber() {
        var actual4 = service.divide(-6, 3);
        assertEquals(-2, actual4);
    }

    @Test
    void testDivideZeroPerNumber() {
        var actual5 = service.divide(0, 1);
        assertEquals(0, actual5);
    }

    @Test
    void testDivideNumbersToZeroWithException() {
        assertThrows(IllegalArgumentException.class, () -> service.divide(2, 0));
    }
}