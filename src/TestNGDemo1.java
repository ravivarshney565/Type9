import org.testng.annotations.Test;

public class TestNGDemo1 {

	@Test (priority=1)
	public void testRegister()
	
	{
		System.out.println("Inside the registration test");
	}
	
	@Test (priority=2)
	public void testlogin()
	{
		System.out.println("Inside the test login");
	}
	
	@Test (priority=3)
	public void testHomePage()
	
	{
		System.out.println("Inside the test homepage");
	}

}
