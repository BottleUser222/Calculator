package com.calculator;

public class Calculator {

    private int firstNumber;
    private int secondNumber;
    public Calculator(int x,int y){
        this.firstNumber=x;
        this.secondNumber=y;
    }
    public void add(){
        if (checkAdditionOverflow(firstNumber, secondNumber)) {
            System.out.println("The sum of the given numbers reached an overflow!");
        }
        else System.out.println("The sum is " + (this.firstNumber+this.secondNumber));
    }
    public void subtract(){
        if (checkSubtractionOverflow(firstNumber, secondNumber)) {
            System.out.println("The difference of the given numbers reached an overflow!");
        }
        else System.out.println("The difference is " + (this.firstNumber-this.secondNumber));
    }
    public void multiply(){
        if (checkMultiplicationOverflow(firstNumber, secondNumber)) {
            System.out.println("The product of the given numbers reached an overflow!");
        }
        else System.out.println("The product is " + (this.firstNumber*this.secondNumber));
    }
    public void divide(){
        if (secondNumber==0) {
            System.out.println("You cannot divide by zero!");
        }
        else System.out.println("The quotient is " + (firstNumber/secondNumber));
    }
    private boolean checkAdditionOverflow (int a, int b){
        if ((a > 0 && b > 0 && a + b < 0) || (a < 0 && b < 0 && a + b > 0)) {
            return true;
        }
        else return false;
    }
    private boolean checkSubtractionOverflow (int a, int b){
        if ((a > 0 && b < 0 && a - b < 0) || (a<0 && b>0 && a-b>0)){
            return true;
        }
        else return false;
    }
    private boolean checkMultiplicationOverflow (int a, int b){
        if((a>0 && b>0 && a*b<0) || (a<0 && b<0 && a*b<0) || (a<0 && b>0 && a*b>0) || (a>0 && b<0 && a*b>0)){
            return true;
        }
        else return false;
    }
}
