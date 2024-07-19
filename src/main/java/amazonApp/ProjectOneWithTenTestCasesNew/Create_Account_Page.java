package amazonApp.ProjectOneWithTenTestCasesNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Account_Page {
	WebDriver driver;
	
	@FindBy(id = "createAccount")
	WebElement createaccount;

	public void createaccount() {
		createaccount.click();
	}

	@FindBy(xpath = "//input[@class='a-button-input']")
	WebElement proccedtocreateaccount;

	public void proccedtocreateaccount() {
		proccedtocreateaccount.click();
	}

	@FindBy(id = "ap_phone_number")
	WebElement addnewmobileno;

	public void addnewmobileno() {
		addnewmobileno.sendKeys("8830618282");
	}

	@FindBy(id = "ap_customer_name")
	WebElement cutomer_name;

	public void cutomer_name() {
		cutomer_name.sendKeys("Shweta");
	}

	@FindBy(id = "ap_password")
	WebElement cutomer_pass;

	public void cutomer_pass() {
		cutomer_pass.sendKeys("Shweta@1234");
	}

	@FindBy(id = "continue")
	WebElement verify_mobileno;

	public void verify_mobileno() {
		verify_mobileno.click();
	}

	@FindBy(id = "auth-pv-enter-code")
	WebElement otp;

	public void otp() {
		otp.sendKeys("");
	}

	@FindBy(id = "auth-verify-button")
	WebElement createyouramazonaccount;

	public void createyouramazonaccount() {
		createyouramazonaccount.click();
	}
	

	public Create_Account_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}

}
