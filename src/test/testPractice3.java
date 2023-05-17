package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testPractice3 {
	@BeforeClass
	public void bfClass() {
		
		System.out.println("before executing  all method in class******************");
	}
	@Parameters({"URL","APIKey/username"})
	@Test
	public void webLoginCarLoan(String urlname,String key) {
		
		System.out.println("webLoginCar");
		System.out.println(urlname);
		System.out.println(key);

	}
	@BeforeMethod
	public void beforeEvery() {
		
		System.out.println("I will execute before every test method in testPractice3 class");
	}
	@AfterMethod
	public void afterEvery() {
		
		System.out.println("I will execute after every test method in testPractice3 class");
	}
	@AfterClass
	public void afClass() {
		
		System.out.println(" after executing all test method in class******************");
	}
	@Test(groups= {"Smoke"})
	public void mobileLoginCarLoan() {
		
		System.out.println("moblieLoginCar");
	}
	@Test(enabled=false)
	public void mobileSignInCarLoan() {
		
		System.out.println("mobileSignIn");
	}
	@BeforeSuite
	public void bfSuite()
	{
		System.out.println("I am the no 1");

	}
	@Test(dataProvider= "getData")
	public void mobileSignoutLoan(String username, String password) {
		
		System.out.println("mobileSignout");
		System.out.println(username);
		System.out.println(password);

	}
	@Test(dependsOnMethods= {"webLoginCarLoan","mobileSignoutLoan"})
	public void apiLoginCarLoan() {
		
		System.out.println("apiLoginCar");
	}
	@DataProvider
	public Object[][] getData()
	{
		//1st combination-- username password - good credit history row
		//2 nd - username password - no credit history
		//3 rd - fraudelent credit history
		Object[][] data = new Object[3][2];
	//1 st set
		data[0][0]= "firstusername";
		data[0][1]= "firstpassword";
		//2nd set
		data[1][0]= "secondusername";
		data[1][1]= "secondpassword";
		//3rd set
		data[2][0]= "thirdusername";
		data[2][1]= "thirdpassword";
		return data;
		
		
		
		
	}

}
