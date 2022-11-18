package TestNgAnnotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTestNg {

	
		@Test()
		public void Test1()
		{
			System.out.println("test1()method");
			Assert.assertTrue(true);

		}
		@Test()
		public void Test2()
		{
			System.out.println("test2()method");
			Assert.assertTrue(false, "Expecting true but condition false");

		}
		@Test()
		public void Test3()
		{
			System.out.println("test3()method");
			String s1 = "kishor";
			String s2 = "kishor";
			Assert.assertEquals(s1, s2);
		}

		@Test()
		public void Test4()
		{
			System.out.println("test3()method");
			String s1 = "Kishor";
			String s2 = "kishor";
			Assert.assertEquals(s1, s2,"s1 and s2 are not matching");



		}
		@Test
		public void test5() {
			System.out.println("test5()");

			//Assert.assertFalse(true,"Expecting false condition but gets true");

			Assert.assertFalse(true);
		}

		@Test
		public void test6() {
			System.out.println("test6() ");
			//Assert.assertFalse(false, "Expecting true but gets false condition");
			Assert.assertFalse(false);
		}

	

	}


