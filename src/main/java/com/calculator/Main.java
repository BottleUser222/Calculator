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
            int num1 = input.nextInt();
            System.out.print("Please enter another number: ");
            while (!input.hasNextInt()){
                System.out.println("That's not a number! Input a number: ");
                input.next();
            }
            int num2 = input.nextInt();
            Calculator calc = new Calculator(num1,num2);
            for (int i=0;i<=num1;i++){
                if (num2==2147483647 || num1==2147483647 || (num2+i==2147483647 && i<num1)){
                    System.out.println("Your number is too large!");
                    break;
                }
                else if(i==num1 && i+num2!=2147483647){
                    calc.add();
                }
            }
        }
    }
