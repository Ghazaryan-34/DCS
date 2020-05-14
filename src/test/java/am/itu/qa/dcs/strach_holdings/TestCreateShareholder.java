package am.itu.qa.dcs.strach_holdings;
// testNG path = am.itu.qa.dcs.strach_holdings.TestCreateShareholder

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.dcs.TestDCSHomePage;
import am.itu.qa.dcs.home.DCSHomePage;

public class TestCreateShareholder extends TestDCSHomePage {

	@Test
	public void invalidPercentage() {
		DCSHomePage home = new DCSHomePage(dcs);
		DCSStrachHoldings strach_holdings = home.selectSuperAdminRole(dcs);
		String f_name = "Invalid";
		String l_name = "Percent";
		String percent = "000005";
		strach_holdings.creatShareholder(f_name,l_name,percent);
		final String SHAREHOLDER_XPATH = "//label[@title='%s %s']";
		
		Assert.assertTrue(dcs.findElement(By.xpath(String.format(SHAREHOLDER_XPATH, f_name, l_name))).isDisplayed());
	}
}
