package com.example.demo;
import java.util.Scanner;

public class DemoApplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
		Calculator calc = new Calculator();
		double numerator = sc.nextDouble();
		double denominator = sc.nextDouble();

		System.out.println(calc.Mult(numerator,denominator));
		System.out.println(calc.Sub(numerator,denominator));
		
	}

}
