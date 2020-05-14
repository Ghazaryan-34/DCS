package am.itu.qa.dcs.strach_holdings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.dcs.base.DCSBasePage;
import am.itu.qa.dcs.dashboard.DCSDashboard;

public class DCSStrachHoldings extends DCSBasePage {

	public DCSStrachHoldings(WebDriver dcs) {
		super(dcs);
	}
///////////////////////////// XPATHS //////////////////////////////////////////
//DCS logo xpath
	public final String DCS_LOGO = "//div[@id='logo']";
//Menu Bar xpaths
	public final String STRACH_HOLDINGS = "//a[@id='parentCompanyLink']";
	public final String ASSESSMENT_TOOLS = "//a[@id='assessment_tools_link']";
	public final String DATABASE = "//a[@id='databases']";
	public final String MANAGE = "//a[@id='manageLink']";
	public final String LOGOUT = "//a[@id='logoutContainet']";
//Manage drop down list
	public final String CW_USERS = "//a/span[starts-with(@id,'userLinkValue')]";
	public final String ACTION_HISTORY = "//a[starts-with(@id,'actionHistory')]";
	public final String TMP_PARAMS = "//a[starts-with(@id,'templateParameters')]";
	public final String POLICY_HOLDERS = "//a[starts-with(@id,'policyManual')]";
//Create organization
	public final String CREATE_ORGANIZATION = "//input[@id='createOrganization']";
	public final String NEW_ORGANIZATION_NAME = "//input[@id='organizationName']";
//Create shareholder
	public final String CREATE_SHAREHOLDER = "//input[@id='newShareholder']";
	public final String FIRST_NAME = "//input[@id='firstName']";
	public final String LAST_NAME = "//input[@id='lastName']";
	public final String PERCENTAGE = "//input[@id='percentage']";
	public final String SAVE_BUTTON = "//input[@id='saveLink']";
	public final String CANCEL_BUTTON = "//input[@id='cancelBtn']";
// Organizations xpaths
	public final String COMMONWEALTH_ORG = "//*[@id='1_Commonwealth_userBlock']";
	public final String LEAD_GENERAL_ORG = "//*[@id='2_Lead General_userBlock']";
	public final String ASTERIX_ORG = "//*[@id='3_Asterix_userBlock']";
	
///////////////////////////// FIND ELEMENTS BY XPATHS ///////////////////////////
//DCS logo
	@FindBy(xpath=DCS_LOGO)
	public WebElement dcs_logo;
//Menu Bar
	@FindBy(xpath=STRACH_HOLDINGS)
	public WebElement strach_holdings_element;
	@FindBy(xpath=ASSESSMENT_TOOLS)
	public WebElement assessment_tools;
	@FindBy(xpath=DATABASE)
	public WebElement database;
	@FindBy(xpath=MANAGE)
	public WebElement manage;
	@FindBy(xpath=LOGOUT)
	public WebElement logout;
//Manage
	@FindBy(xpath=CW_USERS)
	public WebElement cw_users;
	@FindBy(xpath=ACTION_HISTORY)
	public WebElement action_history;
	@FindBy(xpath=TMP_PARAMS)
	public WebElement tmp_params;
	@FindBy(xpath=POLICY_HOLDERS)
	public WebElement policy_holders;
//Create organization
	@FindBy(xpath=CREATE_ORGANIZATION)
	public WebElement create_organization;
	@FindBy(xpath=NEW_ORGANIZATION_NAME)
	public WebElement new_org_name;
//Create shareholder
	@FindBy(xpath=CREATE_SHAREHOLDER)
	public WebElement create_shareholder;
	@FindBy(xpath=FIRST_NAME)
	public WebElement first_name;
	@FindBy(xpath=LAST_NAME)
	public WebElement last_name;
	@FindBy(xpath=PERCENTAGE)
	public WebElement percentage;
	@FindBy(xpath=SAVE_BUTTON)
	public WebElement save_btn;
	@FindBy(xpath=CANCEL_BUTTON)
	public WebElement cancel_btn;
//Organizations
	@FindBy(xpath=COMMONWEALTH_ORG)
	public WebElement common_wealth;
	@FindBy(xpath=LEAD_GENERAL_ORG)
	public WebElement lead_general;
	@FindBy(xpath=ASTERIX_ORG)
	public WebElement asterix;
	
	public DCSDashboard orgCommonwealth(WebDriver dcs) {
		common_wealth.click();
		dcs.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return new DCSDashboard(this.dcs);
	}
	public DCSDashboard orgLeadGeneral(WebDriver dcs) {
		lead_general.click();
		dcs.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return new DCSDashboard(this.dcs);
	}
	public DCSDashboard orgAsterix(WebDriver dcs) {
		asterix.click();
		this.dcs.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return new DCSDashboard(this.dcs);
	}
//Create organization
	public void creteOrganiztion(String org_name) {
		create_organization.click();
		waitForElement(2, By.xpath(NEW_ORGANIZATION_NAME));
		new_org_name.clear();
		new_org_name.sendKeys(org_name);
		save_btn.click();
	}
//Create shareholder
    public void creatShareholder(String f_name, String l_name, String percent) {		
		create_shareholder.click();
		waitForElement(5, By.xpath(SAVE_BUTTON));
		
		first_name.clear();
		first_name.sendKeys(f_name);
		last_name.clear();
		last_name.sendKeys(l_name);
		percentage.clear();
		percentage.sendKeys(percent);
		save_btn.click();
	}

}
