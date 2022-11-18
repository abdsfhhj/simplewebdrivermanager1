package TestNgAnnotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependancyandprioritiesTestNg {
	@Test(priority = 1)
	public void Test1()
	{
		System.out.println("test1()");
		Assert.assertTrue(false);
	}

	@Test(priority =2)
	public void Test2()
	{
		System.out.println("test2()");
		Assert.assertTrue(true);
	}

	@Test(priority =3)
	public void Test3()
	{
		System.out.println("test3()");
		Assert.assertTrue(false);
	}


	@Test(priority =4)
	public void Test4()
	{
		System.out.println("test4()");
		Assert.assertTrue(true);
	}

}
