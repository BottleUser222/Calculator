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
            throw new ArithmeticException("The sum of the given numbers reached an overflow!");
        }
        return firstNumber+secondNumber;
    }
    public int subtract(){
        if (checkSubtractionOverflow(firstNumber, secondNumber)) {
            throw new ArithmeticException("The subtraction of the given numbers reached an overflow!");
        }
        return  firstNumber-secondNumber;
    }
    public int multiply(){
        if (checkMultiplicationOverflow(firstNumber, secondNumber)) {
            throw new ArithmeticException("The product of the given numbers reached an overflow!");
        }
        return  firstNumber*secondNumber;
    }
    public int divide(){
        if(secondNumber==0){
            throw new ArithmeticException("You cannot divide by zero!");
        }
        return  firstNumber/secondNumber;
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
