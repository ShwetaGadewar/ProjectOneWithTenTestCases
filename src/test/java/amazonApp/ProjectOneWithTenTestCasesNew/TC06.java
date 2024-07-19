package amazonApp.ProjectOneWithTenTestCasesNew;

import org.testng.annotations.Test;

import utility.LoginAndQuit;

public class TC06 extends LoginAndQuit {
@Test
	public void Filtertheproduct() throws InterruptedException {

		Home_Page a1=new Home_Page(driver);
		a1.accountandlist(driver);
		a1.signin_button();
		
		Valid_Cred_SignIn_Page a2=new Valid_Cred_SignIn_Page(driver);
		a2.un();
		a2.continue_button();
		a2.pass();
		a2.sign_button();
		
		a1.searchProduct();
		
		Search_Result_Page a3 = new Search_Result_Page(driver);
		a3.selectCategory();
}
}