package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testPractice {
	
	//TODO Auto generated method
	@AfterSuite
	public void afSuite()
	{
		System.out.println("I am  no 1 from last");

	}
	@AfterTest
	public void lastExecution()
	{
		System.out.println("I will execute last");
	}
	@Test
	public void Demo()
	{
		System.out.println("hello");//automation
		Assert.assertTrue(false);

	}
	@Test
	public void SecondTest()
	{
		System.out.println("bye");//automation
	}

}
