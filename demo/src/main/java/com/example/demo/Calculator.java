package com.example.demo;

public class Calculator {
    
    double numerator, denominator;

    public double Sum(double numerator, double denominator){
        return numerator + denominator;
    }

    public double Sub (double numerator, double denominator){
        return numerator + denominator;
    }

    public double Div (double numerator, double denominator){
        return numerator / denominator;
    }

    public double Mult (double numerator, double denominator){
        return numerator * denominator;
    }

    public double Pot (double numerator, double denominator){
        return Math.pow(numerator,denominator);
    }


}
