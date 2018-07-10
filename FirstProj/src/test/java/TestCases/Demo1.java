package TestCases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Demo1 {
	WebDriver driver;	
	
	//
	@Test
	public void DemoTest() {
		driver.get("http://www.google.com/");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.getProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
