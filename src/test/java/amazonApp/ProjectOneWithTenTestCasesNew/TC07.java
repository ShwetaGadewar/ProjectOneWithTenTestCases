package amazonApp.ProjectOneWithTenTestCasesNew;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import utility.LoginAndQuit;

public class TC07 extends LoginAndQuit {

	@Test
	public void Verify_product_details() throws InterruptedException {
		Home_Page a1=new Home_Page(driver);
		a1.accountandlist(driver);
		a1.signin_button();
		
		Valid_Cred_SignIn_Page a2=new Valid_Cred_SignIn_Page(driver);
		a2.un();
		a2.continue_button();
		a2.pass();
		a2.sign_button();
		
		a1.searchProduct();
		
		Search_Result_Page a3=new Search_Result_Page(driver);
		a3.selectProduct();
		
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		String parentId = iterator.next();
		String childId = iterator.next();
		driver.switchTo().window(childId);
		
		Product_Page productPage = new Product_Page(driver); 
		boolean price = productPage.checkProductPrice();
		boolean reviews = productPage.checkCustomerReviews();
		boolean description  = productPage.checkProductDescription();
		if(price == true) {
			System.out.println("Product price is present!");
		}
		else {
			System.out.println("Product price is not present!");
		}
		
		if(reviews == true) {
			System.out.println("Product reviews is present!");
		}
		else {
			System.out.println("Product reviews is not present!");
		}
		
		if(description == true) {
			System.out.println("Product description is present!");
		}
		else {
			System.out.println("Product description is not present!");
		}
		
	}
}
