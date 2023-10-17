package com.example.demo;

public class Calculator {
    
    double numerator, denominator, result;

    public double Sum(double numerator, double denominator){
        result = numerator + denominator;
        return result;
    }

    public double Sub (double numerator, double denominator){
        result = numerator - denominator;
        return result;
    }

    public double Div (double numerator, double denominator){
        if(denominator == 0){
            throw new IllegalArgumentException("Cannot div by 0.\n");
        } else {
        result = numerator / denominator;
        return result;
        }
    }
    

    public double Mult (double numerator, double denominator){
        result = numerator * denominator;
        return result;
    }

    public double Pot (double numerator, double denominator){
        result = Math.pow(numerator,denominator);
        return result;
    }


}
