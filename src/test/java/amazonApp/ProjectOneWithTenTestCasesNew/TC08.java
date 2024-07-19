package amazonApp.ProjectOneWithTenTestCasesNew;

import org.testng.annotations.Test;

import utility.LoginAndQuit;

public class TC08 extends LoginAndQuit {
	@Test
	public void Sorting_product_details() throws InterruptedException {
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
	a3.selectRelevance();
	Thread.sleep(2000);
	driver.navigate().refresh();
	
	a3.selectPrice();
	Thread.sleep(2000);
	driver.navigate().refresh();
	
	a3.selectRating();
	Thread.sleep(20000);
	driver.navigate().refresh();

	
	
}
}