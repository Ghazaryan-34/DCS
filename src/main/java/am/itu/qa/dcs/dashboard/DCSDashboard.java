package am.itu.qa.dcs.dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.dcs.strach_holdings.DCSStrachHoldings;
import am.itu.qa.dcs.strach_holdings.manage.ManageCWUsers;

public class DCSDashboard extends DCSStrachHoldings{

	public DCSDashboard(WebDriver dcs) {
		super(dcs);
	}
//////////////////// XPATHS ///////////////////////////////////////////////////////////////////////////////
//Add chart
	public final String ADD_CHART_BTN = "//input[@id='newChart']";
	public final String CHART_NAME = "//input[@id='nameField']";
	public final String CHART_TYPE = "//select[@id='chartDropDown']";
	public final String SUB_DEP_FEEDBACK_REPORT = "//option[text()='Sub-department feedback report']";
	public final String CEO = "//option[text()='Jerry Kasabyan']";
	public final String OPERATION = "//select[contains(@id,'operationChoice')]";
	public final String CORE_BUSINESS_UNIT_OPERATIONS = "//option[text()='Core Business Unit Operations']";
	public final String DEPARTAMENT = "//select[contains(@id,'departmentChoice')]";
	public final String DEP_CLAIMS = "//option[text()='Claims']";
	public final String SUB_DEPARTAMENT = "//select[contains(@id,'subDepartmentChoice')]";
	public final String FRONT_LINE = "//option[text()='Front Line']";
	public final String SAVE_BTN = "//input[@id='saveLink']";
	public final String CANCEL_BTN = "//input[@id='cancelBtn']";	
//Commonwealth 
	public final String BOARD_CW = "//a[@id='organizationLink']";
//Database
	public final String D_BASE_DROP_DOWN = "//a[@id='databases']";
	public final String D_BASE_COMPLAINT = "//li[starts-with(@id,'complaintContainer')]";
	public final String D_BASE_HR_VENDOR = "//li[starts-with(@id,'riskVendorContainer')]";
	public final String D_BASE_CLAIMS_REFERRAL = "//li[starts-with(@id,'claimReferralContainer')]";
	public final String D_BASE_UNACCEPTABLE_RISK = "//li[starts-with(@id,'blackVendorContainer')]";
	public final String D_BASE_HR_POLICY_HOLDERS = "//li[starts-with(@id,'highRiskPolicyHoldersContainer')]";

///////// Find By xpaths /////////////////////////////////////////////////////////////////////////////////////
//Add chart
	@FindBy(xpath = ADD_CHART_BTN)
	public WebElement add_chart_btn;
	@FindBy(xpath = CHART_NAME)
	public WebElement chart_name;
	@FindBy(xpath = CHART_TYPE)
	public WebElement chart_type;
	@FindBy(xpath = SUB_DEP_FEEDBACK_REPORT)
	public WebElement sub_dep_feedback_report;
	@FindBy(xpath = CEO)
	public WebElement ceo;
	@FindBy(xpath = OPERATION)
	public WebElement operation;
	@FindBy(xpath = CORE_BUSINESS_UNIT_OPERATIONS)
	public WebElement core_business_unit_operations;
	@FindBy(xpath = DEPARTAMENT)
	public WebElement departament;
	@FindBy(xpath = DEP_CLAIMS)
	public WebElement dep_claims;
	@FindBy(xpath = SUB_DEPARTAMENT)
	public WebElement sub_departament;
	@FindBy(xpath = FRONT_LINE)
	public WebElement front_line;
	@FindBy(xpath = SAVE_BTN)
	public WebElement save_btn;
	@FindBy(xpath = CANCEL_BTN)
	public WebElement cancel_btn;
//Commonwealth
	@FindBy(xpath = BOARD_CW)
	public WebElement board_cw;
//Database
	@FindBy(xpath = D_BASE_DROP_DOWN)
	public WebElement databases;
	@FindBy(xpath = D_BASE_COMPLAINT)
	public WebElement db_complaint;
	@FindBy(xpath = D_BASE_HR_VENDOR)
	public WebElement db_hr_vendors;
	@FindBy(xpath = D_BASE_CLAIMS_REFERRAL)
	public WebElement db_claims_ref;
	@FindBy(xpath = D_BASE_UNACCEPTABLE_RISK)
	public WebElement db_un_risk;
	@FindBy(xpath = D_BASE_HR_POLICY_HOLDERS)
	public WebElement db_hr_policy_holders;
	
//Add chart
	public void addChart(String new_chart_name) {
		add_chart_btn.click();
		chart_name.sendKeys(new_chart_name);
		chart_type.click();
		sub_dep_feedback_report.click();
		operation.click();
		core_business_unit_operations.click();
		departament.click();
		dep_claims.click();
		sub_departament.click();
		front_line.click();
		save_btn.click();
		
		final String CREATED_CHART = "//label[@title='%s']";
		waitForElement(3, By.xpath(String.format(CREATED_CHART, new_chart_name)));
	}
//Database
	public DCSComplaint openComplaint (WebDriver dcs) {
		databases.click();
		db_complaint.click();
		return new DCSComplaint(this.dcs);
	}
	public DCSVendors openVendors (WebDriver dcs) {
		databases.click();
		db_hr_vendors.click();
		return new DCSVendors(this.dcs);
	}
	public DCSClaimsReferral openClaimsReferral (WebDriver dcs) {
		databases.click();
		db_claims_ref.click();
		return new DCSClaimsReferral(this.dcs);
	}
	public DCSUnacceptableRisk openUnacceptableRisk (WebDriver dcs) {
		databases.click();
		db_un_risk.click();
		return new DCSUnacceptableRisk(this.dcs);
	}
	public DCSHighRiskPolicyHolders openHighRiskPolicyHolders (WebDriver dcs) {
		databases.click();
		db_hr_policy_holders.click();
		return new DCSHighRiskPolicyHolders(this.dcs);
	}
	public DCSBoardCW openBoard(WebDriver dcs) {
		board_cw.click();
		return new DCSBoardCW(this.dcs);
	}
//Manage
//     .CommonwealthUsers
    public ManageCWUsers openCWUsers() {	
    	manage.click();
    	cw_users.click();
    	return new ManageCWUsers(dcs);
    }
}
