package com.calculator;

public class Calculator {

    private int firstNumber;
    private int secondNumber;
    public Calculator(int firstNumber,int secondNumber) {
        this.firstNumber=firstNumber;
        this.secondNumber=secondNumber;
    }
    public String add(){
        try{
            int sum=Math.addExact(firstNumber,secondNumber);
            return "The sum is "+sum;
        }
        catch(Exception e){
            return "The sum of the given numbers reached an overflow!";
        }
    }
    public String subtract(){
        try{
            int diff = Math.subtractExact(firstNumber,secondNumber);
            return "The difference is "+diff;
        }
        catch(Exception e){
            return "The difference of the given numbers reached an overflow!";
        }
    }
    public String multiply(){
        try{
            int prod=Math.multiplyExact(firstNumber,secondNumber);
            return "The product is " +prod;
        }
        catch(Exception e){
            return "The product of the given numbers reached an overflow!";
        }
    }
    public String divide(){
        try{
            int quot=Math.divideExact(firstNumber,secondNumber);
            return "The quotient is "+quot;
        }
        catch(Exception e){
            return "The quotient of the given numbers reached an overflow!";
        }
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
