package com.calculator;

import java.util.Scanner;

public class Main {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            String operands = "+-*/";
            System.out.print("Please choose a basic operation ( +, -, *, / ): ");
            char operation = input.next().charAt(0);
            while (!operands.contains(String.valueOf(operation))) {
                System.out.print("Please choose a symbol as shown in the brackets ( +, -, *, / ): ");
                operation = input.next().charAt(0);
            }
            System.out.print("Please enter a number: ");
            while (!input.hasNextInt()){
                input.next();
                System.out.print("That's not a number! Input a number: ");
            }
            int num1 = input.nextInt();
            System.out.print("Please enter another number: ");
            while (!input.hasNextInt()){
                input.next();
                System.out.print("That's not a number! Input a number: ");
            }
            int num2 = input.nextInt();
            Calculator calc = new Calculator(num1,num2);

            if (operation=='+') calc.add();
            if (operation=='-') calc.subtract();
            if (operation=='*') calc.multiply();
            else calc.divide();
        }
    }
