package testNGtutorials;


import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirsttestNGscript {

	@Test(priority = 1,description = "This test case will verify for the login application")
	public void firstloginapplication() {
		
		System.out.println("Log in Application");
		//Assert.assertEquals(0, 14);
	}
	
	@Test(priority = 2,description = "This test case will add certain Items into the basket")
	public void selectItems() {
		
		System.out.println("select the Items");
	}
	
	@Test(priority = 3,description = "This test case will perform checkout operations")
	public void checkout()  {
		
		System.out.println("Checkout for the Item");
	}
}
