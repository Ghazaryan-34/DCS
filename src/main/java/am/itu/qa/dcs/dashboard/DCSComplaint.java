package am.itu.qa.dcs.dashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DCSComplaint extends DCSDashboard{

	public DCSComplaint(WebDriver dcs) {
		super(dcs);
	}
	
	public final String ADD_NEW_COMPLAINT_BTN = "//input[@value='Add New Complaint']";
	public final String PAGE_HEADER_XPATH = "//div[@class='page_header']";
	
	@FindBy(xpath = ADD_NEW_COMPLAINT_BTN)
	public WebElement add_new_complaint;
	@FindBy(xpath = PAGE_HEADER_XPATH)
	public WebElement page_header;
	
	public void addNewComplaint() {
		add_new_complaint.click();
	}
}
