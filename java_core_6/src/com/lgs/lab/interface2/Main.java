package com.lgs.lab.interface2;

public class Main {

	public static void main(String[] args) 
	{
		MyCalculator m = new MyCalculator();
		
		double a = 3;
		double b = 12;
		System.out.println(m.plus(a, b));
		System.out.println(m.minus(a, b));
		System.out.println(m.multiply(a, b));
		System.out.println(m.divide(a, b));
	}

}
