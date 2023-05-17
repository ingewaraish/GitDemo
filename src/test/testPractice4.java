package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testPractice4 {
	@Parameters({"URL"})

	@Test
	public void webLoginHomeLoan(String urlname) {
		
		System.out.println("webLoginHomePersonalLoan");
		System.out.println(urlname);

	}
	@Test(groups= {"Smoke"})
	public void mobileLoginHomeLoan() {
		
		System.out.println("moblieLoginHome");
	}
	@Test
	public void apiLoginHomeLoan() {
		
		System.out.println("apiLoginHome");
	}

}
