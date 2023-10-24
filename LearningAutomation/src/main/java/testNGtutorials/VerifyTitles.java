package testNGtutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitles {

	@Test
	public void Verifytitlepage() {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://learn-automation.com/");

		// Actual Title
		String mytitle = driver.getTitle();
		System.out.println("Title of the Page is :" + mytitle);

		// Expected Title
		//String expectedtitle = "Automation - Selenium WebDriver tutorial Step by";

		//Assert.assertEquals(mytitle, expectedtitle);
		
		Assert.assertTrue(mytitle.contains("Selenium WebDriver tutorial"));
		System.out.println("Test is completed--Page is Verified");

	}

}
