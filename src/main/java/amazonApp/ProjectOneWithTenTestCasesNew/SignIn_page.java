package amazonApp.ProjectOneWithTenTestCasesNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SignIn_page {
	
	WebDriver driver;
	@FindBy(name = "email")
	WebElement Mobileno;

	@FindBy(id = "continue")
	WebElement conti;
	

	public void un() {
		Mobileno.sendKeys("8830618282");
		}

	public void continue_button() {
		conti.click();
	}

	public SignIn_page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}

	
}
