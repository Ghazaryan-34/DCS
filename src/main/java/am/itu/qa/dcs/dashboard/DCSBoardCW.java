package am.itu.qa.dcs.dashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DCSBoardCW extends DCSDashboard {

	public DCSBoardCW(WebDriver dcs) {
		super(dcs);
	}
	public final String BOARD_TREE = "//div[@id='boardBlock_Commonwealth board_1']";
	public final String DELETE_CEO = "//a[starts-with(@id,'removeCeoLink')]";
	public final String MSG_BOX = "//div[@class='jGrowl-notification ui-state-highlight ui-corner-all tooltip_message_warn']";
	
	@FindBy(xpath = BOARD_TREE)
	public WebElement board_tree;
	@FindBy(xpath = DELETE_CEO)
	public WebElement delete_ceo;
	@FindBy(xpath = MSG_BOX)
	public WebElement msg_box;
	
	public boolean deleteCEO () {
		board_tree.click();
		delete_ceo.click();
		if(msg_box.isDisplayed())
			return true;
		else
			return false;
	}
}
