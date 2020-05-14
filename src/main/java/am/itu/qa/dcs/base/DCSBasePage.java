package am.itu.qa.dcs.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DCSBasePage {
	protected WebDriver dcs;
	public DCSBasePage(WebDriver dcs) {
		this.dcs = dcs;
		PageFactory.initElements(this.dcs, this);
		
	}
	public boolean isElementDisplayed(WebElement element) {
		return element.isDisplayed();
	}
	public void waitForElement(int seconds, By by) {
		WebDriverWait wait = new WebDriverWait(this.dcs, seconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
}
