package TestNgAnnotation;

import org.testng.annotations.Test;

public class DisableTestNg {
	@Test(enabled= true)
	public void Test1()
	{
		System.out.println("test1()method");
	}
	@Test(enabled = false)
	public void Test2()
	{
		System.out.println("test2()method");
	}
	@Test( )
	public void Test3()
	{
		System.out.println("test3()method");
	}

}
