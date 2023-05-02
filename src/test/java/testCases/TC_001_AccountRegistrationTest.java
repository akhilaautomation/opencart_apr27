package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistration;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass{
	
	
	
	@Test
	void test_account_Registration() throws InterruptedException
	{
		logger.info("********* Sarted testing TC_001_AccountRegistrationTest ********" );
		
		try {
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on my account link");
		hp.clickRegister();
		logger.info("Clicked on register link");
		AccountRegistration accpg = new AccountRegistration(driver);
		accpg.setfirstname(randomeString());
		accpg.setlastname(randomeString());
		accpg.setemail(randomeString()+"@gmail.com");
		accpg.setTelePhoneNummber(randomeNumber());
		String password = randomAlphaNumeric();
		accpg.setpassword(password);
		accpg.setConfirmpassword(password);
		Thread.sleep(3000);
		accpg.checkpolicy();
		logger.info("Clicked on continue button");
		
		accpg.continuebutton();
		logger.info("Clicked on continue button");
		String confmsg =accpg.confirmationmessage();
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		}
		catch(Exception e) 
		{
			logger.error("Test Failed");
			Assert.fail();
		}
		logger.info("********* Completed testing TC_001_AccountRegistrationTest ********" );
}
}
