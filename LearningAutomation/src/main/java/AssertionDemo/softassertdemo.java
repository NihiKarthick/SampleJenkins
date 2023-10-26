package AssertionDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassertdemo {

	@Test
	public void Softtest1() {
		SoftAssert assertion = new SoftAssert();
		System.out.println("********Softtest1 is started*******");
		Assert.assertEquals(242, 200);
		System.out.println("****Hard Assert success*****");
		System.out.println("*****Softest1 is executed Successfully******");
		assertion.assertAll();
	}

	@Test
	public void Softtest2() {

		System.out.println("********Softtest2 is started*******");
		Assert.assertEquals(242, 200);
		System.out.println("****Hard Assert success*****");
		System.out.println("*****Softest2 is executed Successfully******");

	}

}
