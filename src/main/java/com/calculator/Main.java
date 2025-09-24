package com.calculator;

import java.util.Scanner;

import static javax.management.Query.plus;

public class Main {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter a number: ");
            while (!input.hasNextInt()){
                System.out.println("That's not a number! Input a number: ");
                input.next();
            }
            int num1 = input.nextInt();
            System.out.print("Please enter another number: ");
            while (!input.hasNextInt()){
                System.out.println("That's not a number! Input a number: ");
                input.next();
            }
            int num2 = input.nextInt();
            Calculator calc = new Calculator(num1,num2);
            if (num1==2147483647 || num2==2147483647) System.out.println("One of the numbers you entered is too large!");
            else calc.add();
        }
    }
