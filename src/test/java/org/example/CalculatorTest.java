package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    // This is a test for add method with two values and expected result
    public void testAdd() {
        int result = calculator.add(2, 3);
        assertEquals(5, result, "2 + 3 should equal 5");
    }

    @Test
    // This is a test for subtract method with two values and expected result
    public void testSubtract() {
        int result = calculator.subtract(2, 3);
        assertEquals(-1, result, "2 - 3 should equal -1");
    }

    @Test
    // This is a test for multiply method with two values and expected result
    public void testMultiply() {
        int result = calculator.multiply(2, 3);
        assertEquals(6, result, "2 * 3 should equal 6");
    }
    @Test
    // This is a test for divide method with two values and expected result
    public void testDivide() {
        int result = calculator.divide(10, 5);
        assertEquals(2, result, "10 / 5 should equal 2");
    }

    @Test
    // This is a test for divide by zero with expected error message displayed
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0), "Division by zero should throw IllegalArgumentException");
    }
}