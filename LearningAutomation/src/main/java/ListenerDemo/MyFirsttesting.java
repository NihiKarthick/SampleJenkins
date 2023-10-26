package ListenerDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class MyFirsttesting {

	@Test(priority = 1)
	public void launchingbrowser() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.guru99.com/gecko-marionette-driver-selenium.html");
		System.out.println(driver.getTitle());
		driver.quit();
	}

	@Test(priority = 2)
	public void OpeningEdgebrowser() {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.guru99.com/gecko-marionette-driver-selenium.html");
		Assert.assertTrue(false);
		System.out.println(driver.getTitle());
		driver.quit();
	}
}