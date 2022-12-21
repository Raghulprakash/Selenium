package day9;

import org.testng.annotations.Test;

public class Calculator_function {
	int a = 10;
	int b = 5;
	int c, d, e, f, g, h;

	@Test(groups= {"Firstoperation"})
	public void Add() {
		c = a + b;
		System.out.println("Addition:" + c);

	}

	@Test(groups= {"Firstoperation"})
	public void Subtract() {
		d = a - b;
		System.out.println("Subtraction:" + d);
	}

	@Test(groups= {"Secondoperation"})
	public void Multipli() {
		e = a * b;
		System.out.println("Multiplication:" + e);

	}

	@Test(groups= {"Secondoperation"})
	public void Divide() {
		f = a / b;
		System.out.println("Division:" + f);

	}

	@Test(groups= {"Thirdoperation"})
	public void Modulo() {
		g = a % b;
		System.out.println("Modulo operation:" + g);

	}
	@Test(groups= {"Thirdoperation"})
	public void MultipleFunction() {
		h = (a+b)*(a-g)/b;
		System.out.println("Multiple Function:" + h);

	}

}
