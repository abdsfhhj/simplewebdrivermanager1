package practies;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;





public class TestNg {


	@Test
	
	public void test1()
	{
		System.out.println("handsoftHard");
		Assert.assertTrue(true);
		System.out.println("statment hands soft pass");
		Assert.assertTrue(false);
		System.out.println("statment hands soft fail");
		
	}
	@Test
	public void test2()
	{
		System.out.println("Test2 method");
		SoftAssert softAssert= new SoftAssert();
		System.out.println("handsoftHard");
		Assert.assertTrue(true);
		System.out.println("statment hands softAssert() pass");
		Assert.assertTrue(false);
		System.out.println("statment hands softAssert() fail");
		softAssert.assertAll();
		
	}
}




