package com.calculator;

public class Calculator {

    private int firstNumber;
    private int secondNumber;
    public Calculator(int firstNumber,int secondNumber) {
        this.firstNumber=firstNumber;
        this.secondNumber=secondNumber;
    }
    public int add(){
        if (checkAdditionOverflow(firstNumber, secondNumber)) {
            System.out.println("The sum of the given numbers reached an overflow!");
            return -1;
        }
        else System.out.println("The sum is " + (firstNumber+secondNumber));
        return  firstNumber+secondNumber;
    }
    public int subtract(){
        if (checkSubtractionOverflow(firstNumber, secondNumber)) {
            System.out.println("The difference of the given numbers reached an overflow!");
            return -1;
        }
        else System.out.println("The difference is " + (firstNumber-secondNumber));
        return  firstNumber-secondNumber;
    }
    public int multiply(){
        if (checkMultiplicationOverflow(firstNumber, secondNumber)) {
            System.out.println("The product of the given numbers reached an overflow!");
            return -1;
        }
        else System.out.println("The product is " + (firstNumber*secondNumber));
        return  firstNumber*secondNumber;
    }
    public int divide(){
        if (secondNumber==0) {
            System.out.println("You cannot divide by zero!");
            return -1;
        }
        else System.out.println("The quotient is " + (firstNumber/secondNumber));
        return firstNumber/secondNumber;
    }



    private boolean checkAdditionOverflow (int a, int b){
        return ((a>0 && b>0 && a+b<0) || (a<0 && b<0 && a+b>0));
    }
    private boolean checkSubtractionOverflow (int a, int b){
        return ((a>0 && b<0 && a-b<0) || (a<0 && b>0 && a-b>0));
    }
    private boolean checkMultiplicationOverflow (int a, int b){
        return ((a>0 && b>0 && a*b<0) || (a<0 && b<0 && a*b<0) || (a<0 && b>0 && a*b>0) || (a>0 && b<0 && a*b>0));
    }
}
