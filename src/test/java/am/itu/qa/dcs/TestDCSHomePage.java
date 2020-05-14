package am.itu.qa.dcs;
// testNG path = am.itu.qa.dcs.TestDCSHomePage

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import am.itu.qa.dcs.base.TestDCSBase;
import am.itu.qa.dcs.base.DCSUnsafePage;
import am.itu.qa.dcs.data.ReadExcel;
import am.itu.qa.dcs.home.DCSHomePage;
import am.itu.qa.dcs.login.DCSLoginPage;

public class TestDCSHomePage extends TestDCSBase {

	@BeforeClass
	public void loginAtFirst() throws IOException{
		
		String userEmail = ReadExcel.validUser().elementAt(0);
		String userPassword = ReadExcel.validUser().elementAt(1); 
		
		DCSUnsafePage unsafe = new DCSUnsafePage(dcs);
		DCSLoginPage login = unsafe.continueUnsafe(dcs);
		DCSHomePage home = login.navigateToMyProfile(dcs, userEmail, userPassword);
		System.out.println("<<<<<<<<<<< User : Vick Kaghramanyan (class TestDCSHomePage)");
		
		home.waitForElement(5, By.xpath(home.ROLE_SELECTOR_XPATH));
	}
	@Test
	public void homePageStructure(){
		
		DCSHomePage home = new DCSHomePage(dcs);
		home.waitForElement(3, By.xpath(home.ROLE_SELECTOR_XPATH));
		Assert.assertTrue(home.roleSelectorIsDisplayed());
		System.out.println("<<<<<<<<<<< Role Selector displayed (class TestDCSHomePage)");
	}

}
