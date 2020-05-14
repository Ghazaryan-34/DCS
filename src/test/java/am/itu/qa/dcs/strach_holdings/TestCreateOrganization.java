package am.itu.qa.dcs.strach_holdings;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.dcs.TestDCSHomePage;
import am.itu.qa.dcs.home.DCSHomePage;

public class TestCreateOrganization extends TestDCSHomePage{
	@Test
	public void createOrganization() {
		DCSHomePage home = new DCSHomePage(dcs);
		DCSStrachHoldings strach_holdings = home.selectSuperAdminRole(dcs);
		String new_org = "TestOrganization";
		final String NEW_ORG_XPATH = "//span[text()='%s']";
		strach_holdings.creteOrganiztion(new_org);
		
		Assert.assertTrue(dcs.findElement(By.xpath(String.format(NEW_ORG_XPATH,new_org))).isDisplayed());
	}
}
