package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AccountRegistration extends BasePage {
	
	public AccountRegistration(WebDriver driver) 
	{
		super(driver);
		
	}
	
	//Element locators
	
	@FindBy(name="firstname")WebElement txtfirstname;
	
	@FindBy(name="lastname")WebElement txtlastname;
	
	@FindBy(name="email")WebElement txtemail;
	@FindBy(name="telephone")WebElement txtphone;
	
	@FindBy(name="password") WebElement txtpassword;
	@FindBy(name="confirm") WebElement txtConfrmpassword;
	
	
	@FindBy(xpath="//input[@name='agree']") WebElement chkdPolicy;
	
	@FindBy(xpath="//input[@value='Continue']") WebElement btnContinue;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")WebElement COnfirmationMsg;
	
	
	//Action Methods
	
	public void setfirstname(String fname)
	{
		txtfirstname.sendKeys(fname);
	}
	
	public void setlastname(String lname)
	{
		txtlastname.sendKeys(lname);
	}
	
	public void setemail(String email)
	{
		txtemail.sendKeys(email);
	}
	
	public void setTelePhoneNummber(String Phonenumber)
	{
		txtphone.sendKeys(Phonenumber);
	}
	
	 public void setpassword(String password)
	 {
		 txtpassword.sendKeys(password);
	 }
	 public void setConfirmpassword(String password)
	 {
		 txtConfrmpassword.sendKeys(password);
	 }
	 
	 public void checkpolicy()
	 {
		 chkdPolicy.click();
	 }
	 public void continuebutton()
	 {
		 btnContinue.click();
	 }
	public String confirmationmessage()
	{
		try {
			return (COnfirmationMsg.getText());
		}
		catch(Exception e)
		{
			return (e.getMessage());
		}
	}
	

}
