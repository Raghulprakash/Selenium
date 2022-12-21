package day8;

import org.testng.annotations.Test;

public class Skip_Test {
	int a = 2;
	int b = 2;
	int c, d, e, f, g;

	@Test(priority = 0)
	public void Add() {
		c = a + b;
		System.out.println("Addition:" + c);

	}

	@Test(priority = 3)
	public void Divide() {
		f = a / b;
		System.out.println("Division:" + f);

	}

	@Test(priority = 4, enabled = false)
	public void Modulo() {
		g = a % b;
		System.out.println("Modulo operation:" + g);

	}

	@Test(priority = 2)
	public void Multipli() {
		e = a * b;
		System.out.println("Multiplication:" + e);

	}

	@Test(priority = 1)
	public void Subtract() {
		d = a - b;
		System.out.println("Subtraction:" + d);
	}
}
