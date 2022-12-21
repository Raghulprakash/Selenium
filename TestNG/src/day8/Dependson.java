package day8;

import org.testng.annotations.Test;

public class Dependson {
	int a = 5;
	int b = 5;
	int c, d, e;

	@Test(enabled = true)
	public void Addition() {
		c = a + b;
		System.out.println("Addition:" + c);

	}

	@Test(dependsOnMethods = "Addition")
	public void Multiplication() {
		d = c * a;
		System.out.println("Multiplication:" + d);

	}

	@Test(dependsOnMethods = "Multiplication")
	public void Subtraction() {
		e = d - (a * b);
		System.out.println("Subtraction:" + e);

	}
}
