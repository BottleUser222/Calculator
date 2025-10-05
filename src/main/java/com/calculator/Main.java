package com.calculator;

import java.util.Scanner;

public class Main {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            char operation = resolveOperation(input);
            Calculator calc = new Calculator(resolveFirstNumber(input),resolveSecondNumber(input));

            switch (operation){
                case '+':
                   calc.add();
                    break;
                case '-':
                    calc.subtract();
                    break;
                case '*':
                    calc.multiply();
                    break;
                case '/':
                    calc.divide();
                    break;
            }
        }



        private static char resolveOperation(Scanner s){
            String operands = "+-*/";
            System.out.print("Please choose a basic operation ( +, -, *, / ): ");
            char operation = s.next().charAt(0);
            while (!operands.contains(String.valueOf(operation))) {
                System.out.print("Please choose a symbol as shown in the brackets ( +, -, *, / ): ");
                operation = s.next().charAt(0);
            }
            return operation;
        }
        private static int resolveFirstNumber(Scanner s){
            System.out.print("Please enter a number: ");
            while (!s.hasNextInt()){
                s.next();
                System.out.print("That's not a number! Input a number: ");
            }
            return s.nextInt();
        }
        private static int resolveSecondNumber(Scanner s){
            System.out.print("Please enter another number: ");
            while (!s.hasNextInt()){
                s.next();
                System.out.print("That's not a number! Input a number: ");
            }
            return s.nextInt();
        }
    }
