package am.itu.qa.dcs.strach_holdings;
//testNG path = am.itu.qa.dcs.strach_holdings.TestDCSStrachHoldings

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.dcs.TestDCSHomePage;
import am.itu.qa.dcs.home.DCSHomePage;

public class TestDCSStrachHoldings extends TestDCSHomePage{ 	
	@Test
	public void strachHoldingsPageStructure() {	
		DCSHomePage home = new DCSHomePage(dcs);
		DCSStrachHoldings strach_holdings = home.selectSuperAdminRole(dcs);
/////// Assert that all elements are exist on page "Strach Holdings" ///////////
		Assert.assertTrue(strach_holdings.dcs_logo.isDisplayed());
		System.out.println("<<<<<<<<<<< DCS logo displayed (class TestDCSStrachHoldings)");
		
		Assert.assertTrue(strach_holdings.strach_holdings_element.isDisplayed());
		System.out.println("<<<<<<<<<<< Strach Holdings displayed (class TestDCSStrachHoldings)");
		
		Assert.assertTrue(strach_holdings.assessment_tools.isDisplayed());
		System.out.println("<<<<<<<<<<< Assessment Tools displayed (class TestDCSStrachHoldings)");
		
		Assert.assertTrue(strach_holdings.database.isDisplayed());
		System.out.println("<<<<<<<<<<< Database displayed (class TestDCSStrachHoldings)");
		
		Assert.assertTrue(strach_holdings.manage.isDisplayed());
		System.out.println("<<<<<<<<<<< Manage displayed (class TestDCSStrachHoldings)");
		
		Assert.assertTrue(strach_holdings.logout.isDisplayed());
		System.out.println("<<<<<<<<<<< Logout Block displayed (class TestDCSStrachHoldings)");
		
		Assert.assertTrue(strach_holdings.create_organization.isDisplayed());
		System.out.println("<<<<<<<<<<< Create Organization button displayed (class TestDCSStrachHoldings)");
		
		Assert.assertTrue(strach_holdings.create_shareholder.isDisplayed());
		System.out.println("<<<<<<<<<<< Create Shareholder button displayed (class TestDCSStrachHoldings)");
		
		Assert.assertTrue(strach_holdings.common_wealth.isDisplayed());
		System.out.println("<<<<<<<<<<< Commonwealth displayed (class TestDCSStrachHoldings)");
		
		Assert.assertTrue(strach_holdings.lead_general.isDisplayed());
		System.out.println("<<<<<<<<<<< Lead General displayed (class TestDCSStrachHoldings)");
		
		Assert.assertTrue(strach_holdings.asterix.isDisplayed());
		System.out.println("<<<<<<<<<<< Asterix displayed (class TestDCSStrachHoldings)");
	}
}
