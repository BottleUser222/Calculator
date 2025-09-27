package com.calculator;

public class Calculator {
    private long frst;
    private long scnd;
    public Calculator(long x,long y){
        this.frst=x;
        this.scnd=y;
    }
    public void add(){
        System.out.println("The sum is " + (this.frst+this.scnd));
    }
}
