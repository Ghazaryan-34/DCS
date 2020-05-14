package am.itu.qa.dcs.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.dcs.base.DCSBasePage;
import am.itu.qa.dcs.home.DCSHomePage;

public class DCSLoginPage extends DCSBasePage {

	public DCSLoginPage(WebDriver dcs) {
		super(dcs);
	}
	// log in was not successful
	public final static String LOGIN_PASSWORD_IS_REQUIRED = "//li[@class='feedbackPanelERROR']";
	public final static String INVALID_USER = "//div[@id='triangle']";
	// email and password fields
	public final String EMAIL_FIELD_XPATH = "//input[@id='username']";
	public final String PASS_FIELD_XPATH = "//input[@id='password']";
	
	// find elements by xpaths
	@FindBy(xpath=LOGIN_PASSWORD_IS_REQUIRED)
	public WebElement log_pass_is_req;
	@FindBy(xpath=INVALID_USER)
	public WebElement invalid_user;
	@FindBy(xpath=EMAIL_FIELD_XPATH)
	public WebElement email;
	@FindBy(xpath=PASS_FIELD_XPATH)
	public WebElement pass;
	
	public void typeEmail(String userEmail) {
		email.clear();
		email.click();
		email.sendKeys(userEmail);
	}
	
	public void typePassword(String userPassword) {
		pass.click();
		pass.sendKeys(userPassword,Keys.ENTER);
	}
	public DCSHomePage navigateToMyProfile (WebDriver dcs, String userEmail, String userPassword) {
		typeEmail(userEmail);
		typePassword(userPassword);
		dcs.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
		return new DCSHomePage(this.dcs);
	}
}
