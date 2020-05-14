package am.itu.qa.dcs;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.dcs.home.DCSHomePage;
import am.itu.qa.dcs.login.DCSLoginPage;

public class TestDCSLogout extends TestDCSHomePage{
	@Test
	public void logoutTest() {
		DCSHomePage home = new DCSHomePage(dcs);
		
		Assert.assertTrue(home.logout_container.isDisplayed());
		
		DCSLoginPage login = home.logoutUser(dcs);
		Assert.assertTrue(login.email.isDisplayed());
	}
}
