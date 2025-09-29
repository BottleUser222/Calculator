package com.calculator;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    public Calculator(int x,int y){
        this.firstNumber=x;
        this.secondNumber=y;
    }
    public void add(){
        if ((firstNumber>0 && secondNumber>0 && firstNumber+secondNumber<0) ||
        (firstNumber<0 && secondNumber<0 && firstNumber+secondNumber>0))
        System.out.println("The sum of the given numbers reached an overflow!");

        else System.out.println("The sum is " + (this.firstNumber+this.secondNumber));
    }
    public void subtract(){
        if ((firstNumber>0 && secondNumber<0 && firstNumber-secondNumber<0) ||
        (firstNumber<0 && secondNumber>0 && firstNumber-secondNumber>0))
        System.out.println("The difference of the given numbers reached an overflow!");

        else System.out.println("The difference is " + (this.firstNumber-this.secondNumber));
    }
    public void multiply(){
        if (Math.abs(firstNumber*secondNumber)<firstNumber || Math.abs(firstNumber*secondNumber)<secondNumber)
        System.out.println("The product of the given numbers reached an overflow!");

        else System.out.println("The product is " + (this.firstNumber*this.secondNumber));
    }
    public void divide(){
        if (secondNumber==0) System.out.println("You cannot divide by zero!");

        else System.out.println("The quotient is " + (firstNumber/secondNumber));
    }

}
