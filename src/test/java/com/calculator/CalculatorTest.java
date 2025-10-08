package com.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAddition() {
        Calculator calc = new Calculator(2, 3);
        assertEquals("The sum is 5", calc.add());
    }
    @Test
    void testAdditionOverflow() {
        Calculator calc = new Calculator(2000000000, 2000000000);
        assertEquals("The sum of the given numbers reached an overflow!", calc.add());
    }
    @Test
    void testaAdditionNegativeInteger() {
        Calculator calc = new Calculator(499,-500);
        assertEquals("The sum is -1", calc.add());
    }

    @Test
    void testSubtraction() {
        Calculator calc = new Calculator(2, 3);
        assertEquals("The difference is -1", calc.subtract());
    }
    @Test
    void testSubtractionOverflow() {
        Calculator calc = new Calculator(-2000000000, 2000000000);
        assertEquals("The difference of the given numbers reached an overflow!", calc.subtract());
    }
    @Test
    void testSubtractionNegativeInteger() {
        Calculator calc = new Calculator(722,-98);
        assertEquals("The difference is 820", calc.subtract());
    }

    @Test
    void testMultiplication() {
        Calculator calc = new Calculator(2, 3);
        assertEquals("The product is 6", calc.multiply());
    }
    @Test
    void testMultiplicationOverflow() {
        Calculator calc = new Calculator(2000000000, 2000000000);
        assertEquals("The product of the given numbers reached an overflow!", calc.multiply());
    }
    @Test
    void testMultiplicationNegativeInteger() {
        Calculator calc = new Calculator(-982,14);
        assertEquals("The product is -13748", calc.multiply());
    }

    @Test
    void testDivision() {
        Calculator calc = new Calculator(6, 2);
        assertEquals("The quotient is 3", calc.divide());
    }
    @Test
    void testDivisionWithZero() {
        Calculator calc2 = new Calculator(100, 0);
        assertEquals("The quotient of the given numbers reached an overflow!", calc2.divide());
    }
    @Test
    void testDivisionNegativeInteger() {
        Calculator calc3 = new Calculator(1158,-3);
        assertEquals("The quotient is -386", calc3.divide());
    }
}