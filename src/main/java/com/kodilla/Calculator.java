package com.kodilla;

public class Calculator {
    int a;
    int b;

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int add(){
        return(a+b);
    }

    public int substract(){
        return(a-b);
    }

    public static void main(String args[]){
        Calculator calculator = new Calculator(3,2);
        System.out.println(calculator.add());
        System.out.println(calculator.substract());

    }

}
