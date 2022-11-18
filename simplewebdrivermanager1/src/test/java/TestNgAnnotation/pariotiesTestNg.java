package TestNgAnnotation;




import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class pariotiesTestNg {
	@Test
	@Parameters({"username","password"})
	public void test1(@Optional("kishor")String username,@Optional("@123")String password )
	{
		System.out.println("User name is :"+username);
		System.out.println("Password is:"+password);

	}
	
	
	
}
