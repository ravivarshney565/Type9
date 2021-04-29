import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDemo2 {

	@Test(dataProvider="loginData")
	public void testLogin(String username, String password)
	
	{
		System.out.println("User having username "+username+" and password:" +password+"got logged in");
	}

	@DataProvider(name="loginData")
	public String[][] loginRelatedData()
	
	{
		String[][] str = {{"AdminUserName", "Apassword"}, {"TeacherUserName", "Tpassword"},{"StudentUserName", "Spassword"}};
		return str;
	}
}
