package com.calculator;

public class Calculator {
    private int frst;
    private int scnd;
    public Calculator(int x,int y){
        this.frst=x;
        this.scnd=y;
    }
    public void add(){
        System.out.println("The sum is " + (this.frst+this.scnd));
    }
}
