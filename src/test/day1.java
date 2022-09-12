package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 
{
	@Parameters({"URL"})
	@Test
	public void ploan(String urlname)
	{
		System.out.println("PLoan");
		System.out.println(urlname );
	}
	
	
@BeforeTest
public void prerequiste()
{
	System.out.println("I will execute first");
}
}
