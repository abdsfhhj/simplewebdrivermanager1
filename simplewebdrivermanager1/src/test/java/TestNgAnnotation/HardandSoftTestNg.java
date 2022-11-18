package TestNgAnnotation;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardandSoftTestNg {
	@Test()
	public void Test1()
	{
		System.out.println("hard soft");
		Assert.assertTrue(true);
		System.out.println("statement after hardAssert() pass");

		Assert.assertTrue(false);

		System.out.println("statement after hardAssert() fail");




	}
	@Test
	public void test2() {
		System.out.println("test2() ");

		SoftAssert softAssert = new SoftAssert();
		System.out.println("softAssert()   ");
		softAssert.assertTrue(true);
		System.out.println("statement after softAssert() pass   ");

		softAssert.assertTrue(false);
		System.out.println("statement after softAssert() fail   ");

		softAssert.assertAll();//exception error

	}
}
