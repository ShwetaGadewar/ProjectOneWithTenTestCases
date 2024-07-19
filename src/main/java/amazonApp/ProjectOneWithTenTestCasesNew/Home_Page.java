package amazonApp.ProjectOneWithTenTestCasesNew;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	 WebDriver driver;
	
	@FindBy(id="nav-link-accountList")
	WebElement accountandlist;
	
	public void accountandlist(WebDriver driver) {
		Actions s1=new Actions(driver);
		s1.moveToElement(accountandlist).perform();	
		//accountandlist.click();
	
	}
	
	@FindBy(xpath = "(//span[@class='nav-action-inner'])[1]")
	WebElement signin;

	public void signin_button() throws InterruptedException {
		Thread.sleep(4000);
		signin.click();
	}
	
	@FindBy(id = "twotabsearchtextbox")
	WebElement searchTextBox;

	public void searchProduct() {
		searchTextBox.sendKeys("shoe", Keys.ENTER);
	}

	
	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
