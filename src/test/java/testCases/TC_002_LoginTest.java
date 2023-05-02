package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass  {
	
	@Test
	public void test_login()
	{
		logger.info("**** Login Test Started******");
		
		try
		{
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.ClickLogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.setemail(rb.getString("email")); ///valid data, get it from config.properties
		lp.setpassword(rb.getString("password"));
		lp.clicklogin();
		
		MyAccountPage myacc = new MyAccountPage(driver);
		boolean targetpage=myacc.isMyAccountMsgdisplayed();
		Assert.assertEquals(targetpage,true);
		}
		catch(Exception e) {
			Assert.fail();
		}
		
		logger.info("******* Login Test Finished ********");
	}

}
