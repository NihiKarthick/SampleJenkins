package testNGtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyErrormessage {

	@Test
	public void Verifyerrormsg() throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=AVQVeyxIcq3Iw7T9XzUrsPGVJ46tQkFebDx5orLGYp5VCgfaFXUOHg-oGNoyRnEeCb1yQ4NQFoUG5w&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1074634180%3A1698145470280823&theme=glif");
		driver.findElement(By.xpath("//*[@id=\'identifierNext\']/div/button/span")).click();

		Thread.sleep(2000);

		// String
		// actualerror=driver.findElement(By.xpath("//*[@id=\'yDmH0d\']/c-wiz/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[2]/div[2]/div/text()")).getText();

		String actualerror = driver.findElement(By.xpath(
				"//*[@id=\'yDmH0d\']/c-wiz/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[2]/div[2]/div/text()"))
				.getAttribute("innerHTML");
		Assert.assertTrue(actualerror.contains("Enter an email or phone number"));

		System.out.println("Test is completed--Verified Error");
		driver.quit();

	}
}
