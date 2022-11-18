package TestNgAnnotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnTestNg {
	@Test()
	public void loginTest()
	{
		System.out.println("LoginTest()");
		Assert.assertTrue(true);
	}

	@Test(dependsOnMethods ={"loginTest"})
	public void CreateAccountTest()
	{
		System.out.println("CreateAccountTest()");
		Assert.assertTrue(true);
	}



	@Test(dependsOnMethods ={"loginTest","CreateAccountTest"})
	public void LogoutTest()
	{
		System.out.println("LogoutTest()");
		Assert.assertTrue(true);
	}

}
