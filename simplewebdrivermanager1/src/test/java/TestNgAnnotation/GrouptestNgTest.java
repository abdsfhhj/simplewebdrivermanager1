package TestNgAnnotation;

import org.testng.annotations.Test;

public class GrouptestNgTest {
	@Test(groups = {"smoke"})
	public void loginTest()
	{
		System.out.println("LoginTest()");
	}

	@Test(groups = {"regression"})
	public void register()
	{
		System.out.println("regration group Test()");
	}


	@Test(groups = {"sanity"})
	public void CreateAccountTest()
	{
		System.out.println("CreateAccountTest()");
	}




}
