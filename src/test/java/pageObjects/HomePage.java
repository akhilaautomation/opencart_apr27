package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
 public HomePage(WebDriver driver)
 {
	 super(driver);
 }
 
 //locate and identify elements
 
 @FindBy(xpath="//span[normalize-space()='My Account']")
 WebElement MyAccountLnk;
 
 @FindBy(xpath="//a[normalize-space()='Register']")
 WebElement RegisterLnk;
 
 @FindBy(linkText="Login")
 WebElement Loginlnk;
 
 // Action Methods
 
 public void clickMyAccount()
 {
	 MyAccountLnk.click();
 }
 
 public void clickRegister()
 {
	 RegisterLnk.click();
 }
 
public void ClickLogin()
{
	Loginlnk.click();
}
 
}
