package am.itu.qa.dcs.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.dcs.login.DCSLoginPage;


public class DCSUnsafePage extends DCSBasePage {

	public DCSUnsafePage(WebDriver dcs) {
		super(dcs);
	}

	public static final String STEP_1_XPATH = "//button[@id='details-button']";
	public static final String STEP_2_XPATH = "//*[@id='proceed-link']";
	
	@FindBy(xpath=STEP_1_XPATH)
	public static WebElement element1;
	@FindBy(xpath=STEP_2_XPATH)
	public static WebElement element2;
	
	public DCSLoginPage continueUnsafe(WebDriver dcs) {
		element1.click();
		element2.click();
		return new DCSLoginPage(dcs);
	}
}
