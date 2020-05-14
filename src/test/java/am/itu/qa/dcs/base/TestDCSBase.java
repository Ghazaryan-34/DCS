package am.itu.qa.dcs.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestDCSBase {

	public static WebDriver dcs;
	public String baseURL;
   
	@BeforeClass
	public void prepareEnv() {
		baseURL  = "https://100.26.116.82/dcs-web/login?";
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chrome81\\chromedriver81.exe");
		dcs = new ChromeDriver();	
		dcs.get(baseURL);
		dcs.manage().window().maximize();
		dcs.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		dcs.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void tearDown() {
		dcs.quit();
	}
}
