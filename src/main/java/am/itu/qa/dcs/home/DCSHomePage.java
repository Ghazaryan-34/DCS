package am.itu.qa.dcs.home;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.dcs.base.DCSBasePage;
import am.itu.qa.dcs.login.DCSLoginPage;
import am.itu.qa.dcs.strach_holdings.DCSStrachHoldings;

public class DCSHomePage extends DCSBasePage {

	public DCSHomePage(WebDriver dcs) {
		super(dcs);
	}
	// logout
	public final String LOGOUT_CONTAINER = "//a[starts-with(@id,'logoutContain')]";
	public final String LOGOUT = "//a[@id='logout']";
	// role selector
	public final String ROLE_SELECTOR_XPATH = "//select[@class='page-inp']";
	public final String SUPER_ADMIN_XPATH = "//select/option[@value='76']";
	public final String CEO_XPATH = "//select/option[@value='162']";
	
	@FindBy(xpath=LOGOUT_CONTAINER)
	public WebElement logout_container;
	@FindBy(xpath=LOGOUT)
	public WebElement logout;
	@FindBy(xpath=ROLE_SELECTOR_XPATH)
	public WebElement role_selector;
	@FindBy(xpath=SUPER_ADMIN_XPATH)
	public WebElement super_admin_role;
	@FindBy(xpath=CEO_XPATH)
	public WebElement ceo_role;
	
	public DCSLoginPage logoutUser(WebDriver dcs) {
		logout_container.click();
		logout.click();
		return new DCSLoginPage(dcs);
	}
	public DCSStrachHoldings selectSuperAdminRole(WebDriver dcs) {
		super_admin_role.click();
		dcs.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return new DCSStrachHoldings(this.dcs);
	}
	public DCSStrachHoldings selectCEORole(WebDriver dcs) {
		ceo_role.click();
		dcs.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return new DCSStrachHoldings(this.dcs);
	}
	public boolean roleSelectorIsDisplayed() {
		return role_selector.isDisplayed();
	}
}
