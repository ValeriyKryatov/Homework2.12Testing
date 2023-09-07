package HomeworkTesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    CalculatorService service = new CalculatorService();

    @Test
    void testPlusTwoPositiveNumbersShouldReturnPositiveNumber() {
        var actual1 = service.plus(1, 2);
        assertEquals(3, actual1);
    }

    @Test
    void testPlusTwoNegativeNumbersShouldReturnNegativeNumber() {
        var actual2 = service.plus(-1, -2);
        assertEquals(-3, actual2);
    }

    @Test
    void testPlusFirstPositiveAndSecondNegativeNumberShouldReturnNegativeNumber() {
        var actual3 = service.plus(1, -2);
        assertEquals(-1, actual3);
    }

    @Test
    void testPlusFirstNegativeAndSecondPositiveNumberShouldReturnPositiveNumber() {
        var actual4 = service.plus(-1, 2);
        assertEquals(1, actual4);
    }

    @Test
    void testPlusNumbersWithZeroShouldReturnPositiveNumber() {
        var actual5 = service.plus(1, 0);
        assertEquals(1, actual5);
    }

    @Test
    void testMinusTwoPositiveNumbersShouldReturnNegativeNumber() {
        var actual1 = service.minus(1, 2);
        assertEquals(-1, actual1);
    }

    @Test
    void testMinusTwoNegativeNumbersShouldReturnPositiveNumber() {
        var actual2 = service.minus(-1, -2);
        assertEquals(1, actual2);
    }

    @Test
    void testMinusFirstPositiveAndSecondNegativeNumberShouldReturnPositiveNumber() {
        var actual3 = service.minus(1, -2);
        assertEquals(3, actual3);
    }

    @Test
    void testMinusFirstNegativeAndSecondPositiveNumberShouldReturnNegativeNumber() {
        var actual4 = service.minus(-1, 2);
        assertEquals(-3, actual4);
    }

    @Test
    void testMinusNumbersWithZeroShouldReturnPositiveNumber() {
        var actual5 = service.minus(1, 0);
        assertEquals(1, actual5);
    }

    @Test
    void testMultiplyTwoPositiveNumbersShouldReturnPositiveNumber() {
        var actual1 = service.multiply(1, 2);
        assertEquals(2, actual1);
    }

    @Test
    void testMultiplyTwoNegativeNumbersShouldReturnPositiveNumber() {
        var actual2 = service.multiply(-1, -2);
        assertEquals(2, actual2);
    }

    @Test
    void testMultiplyFirstPositiveAndSecondNegativeNumberShouldReturnNegativeNumber() {
        var actual3 = service.multiply(1, -2);
        assertEquals(-2, actual3);
    }

    @Test
    void testMultiplyFirstNegativeAndSecondPositiveNumberShouldReturnNegativeNumber() {
        var actual4 = service.multiply(-1, 2);
        assertEquals(-2, actual4);
    }

    @Test
    void testMultiplyNumbersWithZeroShouldReturnZero() {
        var actual5 = service.multiply(1, 0);
        assertEquals(0, actual5);
    }

    @Test
    void testDivideTwoPositiveNumbersShouldReturnPositiveNumber() {
        var actual1 = service.divide(1, 2);
        assertEquals(0.5, actual1);
    }

    @Test
    void testDivideTwoNegativeNumbersShouldReturnPositiveNumber() {
        var actual2 = service.divide(-4, -2);
        assertEquals(2, actual2);
    }

    @Test
    void testDivideFirstPositiveAndSecondNegativeNumberShouldReturnNegativeNumber() {
        var actual3 = service.divide(3, -2);
        assertEquals(-1.5, actual3);
    }

    @Test
    void testDivideFirstNegativeAndSecondPositiveNumberShouldReturnNegativeNumber() {
        var actual4 = service.divide(-6, 3);
        assertEquals(-2, actual4);
    }

    @Test
    void testDivideZeroPerNumberShouldReturnZero() {
        var actual5 = service.divide(0, 1);
        assertEquals(0, actual5);
    }

    @Test
    void testDivideNumbersToShouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> service.divide(2, 0));
    }
}