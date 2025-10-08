package com.calculator;

import org.junit.jupiter.api.Test;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testOperation() {
        Scanner sc = new Scanner("+");
        char operation = copyResolveOperation(sc);
        assertEquals('+', operation);
    }

    @Test
    void testOperationInvalidThenValidInput() {
        Scanner sc = new Scanner("0 \n *");
        char operation = copyResolveOperation(sc);
        assertEquals('*', operation);
    }

    @Test
    void testFirstNumber() {
        Scanner sc = new Scanner("14");
        int result = copyResolveFirstNumber(sc);
        assertEquals(14, result);
    }

    @Test
    void testFirstNumberInvalidThenValidInput() {
        Scanner sc = new Scanner("a \n 10");
        int result = copyResolveFirstNumber(sc);
        assertEquals(10, result);
    }

    @Test
    void testSecondNumber() {
        Scanner sc = new Scanner("92");
        int result = copyResolveSecondNumber(sc);
        assertEquals(92, result);
    }

    @Test
    void testSecondNumberInvalidThenValidInput() {
        Scanner sc = new Scanner("a \n 111");
        int result = copyResolveSecondNumber(sc);
        assertEquals(111, result);
    }



    private char copyResolveOperation(Scanner s) {
        String operands = "+-*/";
        System.out.print("Please choose a basic operation ( +, -, *, / ): ");
        char operation = s.next().charAt(0);
        while (!operands.contains(String.valueOf(operation))) {
            System.out.print("Please choose a symbol as shown in the brackets ( +, -, *, / ): ");
            operation = s.next().charAt(0);
        }
        return operation;
    }
    private int copyResolveFirstNumber(Scanner s) {
        System.out.print("Please enter a number: ");
        while (!s.hasNextInt()){
            s.next();
            System.out.print("That's not a number! Input a number: ");
        }
        return s.nextInt();
    }
    private int copyResolveSecondNumber(Scanner s) {
        System.out.print("Please enter another number: ");
        while (!s.hasNextInt()){
            s.next();
            System.out.print("That's not a number! Input a number: ");
        }
        return s.nextInt();
    }
}
