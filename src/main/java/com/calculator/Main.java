package com.calculator;

import java.util.Scanner;

public class Main {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter a number: ");
            while (!input.hasNextInt()){
                System.out.println("That's not a number! Input a number: ");
                input.next();
            }
            long num1 = input.nextInt();
            System.out.print("Please enter another number: ");
            while (!input.hasNextInt()){
                System.out.println("That's not a number! Input a number: ");
                input.next();
            }
            long num2 = input.nextInt();
            Calculator calc = new Calculator(num1,num2);
            if (num1+num2>=2147483647) System.out.println("Your number is too large!");
            else calc.add();
        }
    }
