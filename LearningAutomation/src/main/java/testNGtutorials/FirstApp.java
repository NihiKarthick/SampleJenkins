package testNGtutorials;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstApp {
	
	@Test
	public void launchapplication() {
		
		Assert.assertEquals(0, 15);
		System.out.println("Launching the Application");
	}
	
	@Test(dependsOnMethods = "launchapplication")
	public void Login() {
		System.out.println("Login into the Application");
	}
	
	@Test(dependsOnMethods = "Login")
	public void Logout() {
		System.out.println("Logout of the Application");
	}

}
