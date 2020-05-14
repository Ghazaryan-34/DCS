package am.itu.qa.dcs.strach_holdings.manage;

import org.testng.Assert;
// testNG path = am.itu.qa.dcs.strach_holdings.manage.TestCWUsers
import org.testng.annotations.Test;

import am.itu.qa.dcs.TestDCSHomePage;
import am.itu.qa.dcs.dashboard.DCSDashboard;
import am.itu.qa.dcs.home.DCSHomePage;
import am.itu.qa.dcs.strach_holdings.DCSStrachHoldings;

public class TestCWUsers extends TestDCSHomePage{
	String full_name = "Tracy";
	String part_of_name = "racy";
	boolean finded;
	
	@Test
	public void findUserByPartOfName() throws InterruptedException {
		DCSHomePage home = new DCSHomePage(dcs);
		DCSStrachHoldings strach_holdings = home.selectSuperAdminRole(dcs);
		DCSDashboard dashboard = strach_holdings.orgCommonwealth(dcs);
		
		Thread.sleep(3000);
		ManageCWUsers manage = dashboard.openCWUsers();
		full_name = "Tracy";
		part_of_name = "Tracy";
		finded = manage.findUserByFirstName(full_name, part_of_name);
		Assert.assertTrue(finded);
		Thread.sleep(3000);
		
		part_of_name = "tracy";
		finded = manage.findUserByFirstName(full_name, part_of_name);
		Assert.assertTrue(finded);
		Thread.sleep(3000);

		part_of_name = "racy";
		finded = manage.findUserByFirstName(full_name, part_of_name);
		Assert.assertTrue(finded);
		Thread.sleep(3000);
	}
}
