package amazonApp.ProjectOneWithTenTestCasesNew;



import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import utility.LoginAndQuit;

public class TC01 extends LoginAndQuit {
	@Test

	public void Registration() throws InterruptedException, EncryptedDocumentException, IOException {

		Home_Page a1=new Home_Page(driver);
		a1.accountandlist(driver);
		a1.signin_button();
		
		SignIn_page a2=new SignIn_page(driver);
		a2.un();
		a2.continue_button();
		
		Create_Account_Page a3=new Create_Account_Page(driver);
		Thread.sleep(2000);
		
		a3.proccedtocreateaccount();
		a3.cutomer_name();
		a3.cutomer_pass();
		a3.verify_mobileno();
	
		
		
		
		
	}
}