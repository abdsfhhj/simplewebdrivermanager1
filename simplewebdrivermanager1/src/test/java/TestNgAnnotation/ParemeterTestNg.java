package TestNgAnnotation;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParemeterTestNg {
	@Test
	@Parameters({"user","pass"})
	public void loginTest(@Optional("kishor")String username, @Optional("kishor@123")String password)
	{
		System.out.println("username is:" + username);
		System.out.println("pass is:" + password);
       }
	
	

}
