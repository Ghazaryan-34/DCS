package am.itu.qa.dcs.strach_holdings.manage;

import am.itu.qa.dcs.strach_holdings.DCSStrachHoldings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManageCWUsers extends DCSStrachHoldings{

	public ManageCWUsers(WebDriver dcs) {
		super(dcs);
	}
/////////////////// XPATHS /////////////////////
//Input fields
	public final String FIRST_NAME = "//input[starts-with(@id,\"firstName\")]";
//Buttons
	public final String FILTER_BTN = "//input[@id='filterBtn']";
//Users
/////////////////// Find By Xpath //////////////
	@FindBy(xpath = FIRST_NAME)
	WebElement first_name;
	@FindBy(xpath = FILTER_BTN)
	WebElement filter_btn;
/////////////////// Methods ////////////////////
	public boolean findUserByFirstName(String full_name, String part_of_name) {
		first_name.clear();
		first_name.sendKeys(part_of_name);
		filter_btn.click();
		final String USER_XPATH = "//span[text()='%s']";
		dcs.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		String user_xpath = String.format(USER_XPATH, full_name);
		waitForElement(5, By.xpath(user_xpath));
		WebElement finded_user = this.dcs.findElement(By.xpath(user_xpath));

		return finded_user.isDisplayed();
	}
}
