package am.itu.qa.dcs.strach_holdings.dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.dcs.TestDCSHomePage;
import am.itu.qa.dcs.dashboard.DCSDashboard;
import am.itu.qa.dcs.home.DCSHomePage;
import am.itu.qa.dcs.strach_holdings.DCSStrachHoldings;

public class TestDashboardAddChart extends TestDCSHomePage{
	@Test
	public void addChart() throws InterruptedException {
		DCSHomePage home = new DCSHomePage(dcs);
		DCSStrachHoldings strach_holdings = home.selectSuperAdminRole(dcs);
		DCSDashboard dashboard = strach_holdings.orgCommonwealth(dcs);	
		Thread.sleep(3000);
		
		String new_chart_name = "New Chart";
		dashboard.addChart(new_chart_name);
		
		final String CREATED_CHART_XPATH = "//label[@title='%s']";
		String created_chart_xpath = String.format(CREATED_CHART_XPATH, new_chart_name);
		WebElement created_chart = dcs.findElement(By.xpath(created_chart_xpath));
		Assert.assertTrue(created_chart.isDisplayed());
	}
}
