package am.itu.qa.dcs;
//testNG path = am.itu.qa.dcs.TestDCSLogin
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import am.itu.qa.dcs.base.TestDCSBase;
import am.itu.qa.dcs.data.ReadExcel;
import am.itu.qa.dcs.login.DCSLoginPage;


public class TestDCSLogin extends TestDCSBase {
	
	@DataProvider
	public Iterator<Object[]> getData() throws IOException {
		ArrayList<Object[]> data = ReadExcel.sendDataFromSheet("LoginDataProvider");
		return data.iterator();
	}
	@Test(dataProvider = "getData")
	public void dcsTestPageStructure(String userEmail, String userPassword) throws InterruptedException {	
		
		DCSLoginPage login = new DCSLoginPage(dcs);
		login.navigateToMyProfile(dcs, userEmail, userPassword);
		dcs.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Assert.assertTrue(login.invalid_user.isEnabled());
		dcs.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	}
}





























/*
 * String my_account = "//a[@href='/my']";
		String forgot_pwd = "//a[@href='/lostpwd']";
		String home_page  = "//a[@id='l']";
		String search_box = "//input[@id='idSearchBox']";
		String _item =      "//a[@href='/item/13519283']";
		
		list.get(baseURL);
		
		element = list.findElement(By.xpath(my_account));
		element.click();
		
		list.findElement(By.xpath(forgot_pwd)).click();
		
		list.findElement(By.xpath(home_page)).click();
		element = list.findElement(By.xpath(search_box));
		element.clear();
		element.click();
		element.sendKeys("Mazda 6",Keys.ENTER);
		Assert.assertTrue(list.findElement(By.xpath(_item)).isDisplayed());
		
		Thread.sleep(10000);
		list.close();
		list.quit();*/




