package amazonApp.ProjectOneWithTenTestCasesNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Search_Result_Page {
	WebDriver driver;
	
	@FindBy(xpath = "(//a[@data-routing='off']/span[@class='a-size-base a-color-base'])[6]")
	WebElement WomensSportsOutdoorShoes;
	
	public void selectCategory() {
		WomensSportsOutdoorShoes.click();
	}
	
	@FindBy(xpath = "//h2[normalize-space()='Results for you']")
	WebElement resultsForYou;
	
	public boolean assertTC05() {
		return resultsForYou.isDisplayed();
	}
	@FindBy(xpath = "//span[normalize-space()='Mens Sx0675g Walking Shoe']")
	WebElement selectShoe;
	
	public void selectProduct() {
		selectShoe.click();
	}
	
	@FindBy(name = "s")
	WebElement sort;
	
	public void selectRelevance() {
		Select selectRelevance = new Select(sort);
		selectRelevance.selectByValue("date-desc-rank");
	}
	
	public void selectPrice() {
		Select selectPrice = new Select(sort);
		selectPrice.selectByVisibleText("Price: Low to High"); 
	}
	
	public void selectRating() {
		Select selectRating = new Select(sort);
		selectRating.selectByVisibleText("Avg. Customer Review"); 
	}
	
	public Search_Result_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	
}
