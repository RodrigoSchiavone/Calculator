package com.calculator.calculator;

public class Calculator {
    private double result;

    public void setResult(double result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    public void add(double value){
        result += value;
    }

    public void subtract(double value){
        result -=value;
    }

    public void divide(double value){
        if (value != 0){
            result /=value;
        }else{
            throw new ArithmeticException("Divisão por zero");
        }
    }

    public void multiply(double value){
        result *= value;
    }

}
