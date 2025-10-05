package com.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void additionTest() {
        Calculator calc = new Calculator(2,3);
        assertEquals(5, calc.add());
        Calculator calc2 = new Calculator(2000000000,2000000000);
        assertEquals(-1, calc2.add());
        Calculator calc3 = new Calculator(499,-500);
        assertEquals(-1, calc3.add());
    }

    @Test
    void subtractionTest() {
        Calculator calc = new Calculator(2,3);
        assertEquals(-1, calc.subtract());
        Calculator calc2 = new Calculator(-2000000000,2000000000);
        assertEquals(-1, calc2.subtract());
        Calculator calc3 = new Calculator(722,-98);
        assertEquals(820, calc3.subtract());
    }

    @Test
    void multiplicationTest() {
        Calculator calc = new Calculator(2,3);
        assertEquals(6, calc.multiply());
        Calculator calc2 = new Calculator(2000000000,2000000000);
        assertEquals(-1, calc2.multiply());
        Calculator calc3 = new Calculator(-982,14);
        assertEquals(-13748, calc3.multiply());
    }

    @Test
    void divisionTest() {
        Calculator calc = new Calculator(6,2);
        assertEquals(3, calc.divide());
        Calculator calc2 = new Calculator(100,0);
        assertEquals(-1, calc2.divide());
        Calculator calc3 = new Calculator(1158,-3);
        assertEquals(-386, calc3.divide());
    }
}