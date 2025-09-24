package com.calculator;

public class Calculator {
    int x;
    int y;
    Calculator(int x,int y){
        this.x=x;
        this.y=y;
    }
    void add(){
        System.out.println("The sum is " + (this.x+this.y));
    }
}
