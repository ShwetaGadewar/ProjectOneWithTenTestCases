package amazonApp.ProjectOneWithTenTestCasesNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Valid_Cred_SignIn_Page {
	WebDriver driver;
	@FindBy(name = "email")
	WebElement Mobileno;

	@FindBy(id = "continue")
	WebElement conti;
	
	
	@FindBy(id = "ap_password")
	WebElement password;

	@FindBy(id = "signInSubmit")
	WebElement signin;
	
	public void un() {
		Mobileno.sendKeys("9175943311");
		}

	public void continue_button() {
		conti.click();
	}
	public void pass() {
                                                                                         password.sendKeys("Used4test!2");
}

public void sign_button() {
signin.click();
}
public Valid_Cred_SignIn_Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
