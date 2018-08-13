package demoSite2.demoSite2;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDemoSite {
	
	ChromeDriver driver = new ChromeDriver();
	
	@BeforeClass
	public static void setupDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\chromedriver.exe");
	}
	
	@Before
	public void setup() {
		driver = new ChromeDriver();
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
	
	@Test
	public void test() {
		driver.get("http://thedemosite.co.uk/addauser.php");
		driver.findElementByName("username").sendKeys("user");
		driver.findElementByName("password").sendKeys("pass");
		driver.findElementByName("FormsButton2").click();
		driver.findElementByCssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(2) > small > a").click();
		driver.findElementByName("username").sendKeys("user");
		driver.findElementByName("password").sendKeys("pass");
		driver.findElementByName("FormsButton2").click();
		assertEquals("Unsuccessful login", "**Successful Login**", driver.findElementByCssSelector("body > table > tbody > tr > td.auto-style1 > big > blockquote > blockquote > font > center > b").getText());
	}

}
