package day8;

import org.testng.annotations.Test;

public class Order_of_Execution {

	@Test(priority = 0)
	public void Start() {
		System.out.println("Click Start");

	}

	@Test(priority = 1)
	public void First() {
		System.out.println("Run Eclipse IDE");

	}

	@Test(priority = 2)
	public void Second() {
		System.out.println("Create a Java Project");

	}

	@Test(priority = 3)
	public void Third() {
		System.out.println("Create a Package");

	}

	@Test(priority = 4)
	public void Fourth() {
		System.out.println("Create a Class");

	}

}
