package amazonApp.ProjectOneWithTenTestCasesNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile_page {

	@FindBy(id="nav-link-accountList")
	WebElement accountandlist;
	
	public void accountandlist(WebDriver driver) {
		Actions s1=new Actions(driver);
		s1.moveToElement(accountandlist).perform();	
	}
	@FindBy(xpath="//span[@data-testid='manage-profiles-button']")
	WebElement managepfrofile_button;
	
	public void manageprofile() {
		managepfrofile_button.click();
	}
	
	@FindBy(xpath="//a[@class='sc-hBxehG sc-dmctIk jPpkrn fbRspv']")
	WebElement view_profile;
	
	public void View_profile_button() throws InterruptedException {
		Thread.sleep(2000);
		view_profile.click();
	}
	@FindBy(xpath="(//div[@class='accordion-trigger-content desktop'])[1]")
	WebElement Preferred_department;
	
	public void Preferred_department() {
		Preferred_department.click();
	}

	
	@FindBy(xpath="(//button[@class='attribute-action'])[1]")
	WebElement Add1;
	
	public void Add1Preferred_department_button() {
		Add1.click();
	}
	
	@FindBy(xpath="(//div[@class='options-list three-column-grid']/button)[1]")
	WebElement Women;
	
	public void Women_button(WebDriver driver) {
		Actions s2=new Actions(driver);
		s2.moveToElement(Women).perform();
		Women.click();
	}
	
	@FindBy(xpath="(//input[@class='a-button-input'])[6]")
	WebElement Save;
	
	public void Save_button(WebDriver driver) {
		
		Actions s3=new Actions(driver);
		s3.moveToElement(Save).perform();
	Save.click();
	}
	
	
	
	@FindBy(xpath="(//div[@class='accordion-trigger-content desktop'])[2]")
	WebElement Heightandweight;
	
	public void Heightandweight() throws InterruptedException {
		Thread.sleep(2000);
		Heightandweight.click();
	}
	

	@FindBy(xpath="(//button[@class='attribute-action'])[2]")
	WebElement Add2;
	
	public void Add2Heightandweight() {
		Add2.click();
	}
	
	@FindBy(xpath="(//input[@class='number-input-box'])[1]")
	WebElement Height;
	
	public void Height_data() {
		Height.sendKeys("162");
	}
	@FindBy(xpath="(//input[@class='number-input-box'])[2]")
	WebElement weight;
	
	public void weight_data() {
		weight.sendKeys("50");;
	}
	@FindBy(xpath="(//input[@class='a-button-input'])[6]")
	WebElement Save2;
	
	public void Save2_button() {
		Save2.click();
	}
	@FindBy(linkText="Age group")
	WebElement Age_group;
	
	public void Age_group() {
		Age_group.click();
	}
	
	@FindBy(xpath="(//button[@class='attribute-action'])[3]")
	WebElement Add3;
	
	public void Add3Age_group() {
		Add3.click();
	}
	@FindBy(linkText="30-34")
	WebElement Age_group_data;
	
	public void Age_group_data() {
		Age_group_data.click();
	}
	
	@FindBy(xpath="(//input[@class='a-button-input'])[6]")
	WebElement Save3;
	
	public void Save3_button() {
		Save3.click();
	}
	
	public Profile_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
