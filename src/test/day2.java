package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day2 {
	@Test
	public void loan()
	{
		System.out.println("Loan");
	}
	@AfterTest
	public void after()
	{
		System.out.println("i will execute last");
	}

}
