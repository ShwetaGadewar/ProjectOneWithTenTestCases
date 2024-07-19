package amazonApp.ProjectOneWithTenTestCasesNew;

import org.testng.annotations.Test;

import utility.LoginAndQuit;

public class TC04 extends LoginAndQuit{
	@Test

	public void Manage_Proile() throws InterruptedException {
	Home_Page a1=new Home_Page(driver);
	a1.accountandlist(driver);
	a1.signin_button();
	
	Valid_Cred_SignIn_Page a2=new Valid_Cred_SignIn_Page(driver);
	a2.un();
	a2.continue_button();
	a2.pass();
	a2.sign_button();
	
	Profile_page a3=new Profile_page(driver);
	a3.accountandlist(driver);
	a3.manageprofile();
	a3.View_profile_button();
	a3.Preferred_department();
	a3.Add1Preferred_department_button();
	a3.Women_button(driver);
	a3.Save_button(driver);
//	a3.Heightandweight();
//	a3.Add2Heightandweight();
//	a3.Height_data();
//	a3.weight_data();
//	a3.Save2_button();
//	a3.Age_group();
//	a3.Add3Age_group();
//	a3.Save3_button();
	
	
	
}
}