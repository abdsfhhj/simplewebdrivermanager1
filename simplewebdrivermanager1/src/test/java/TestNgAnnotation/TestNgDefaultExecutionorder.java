package TestNgAnnotation;

import org.testng.annotations.Test;

public class TestNgDefaultExecutionorder {
	@Test()
	public void LoginTest()
	{
		System.out.println("LoginTest()");
	}

	@Test()
	public void CreateAccountTest()
	{
		System.out.println("CreateAccountupdate()");
	}

	@Test()
	public void UpdateAccountTest()
	{
		System.out.println("UpdateAccountTest()");
	}

	@Test()
	public void LogoutTest()
	{
		System.out.println("LogoutTest()");
	}//asanding order of excution
}
