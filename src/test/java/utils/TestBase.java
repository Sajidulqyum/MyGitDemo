package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
public WebDriver driver;

public WebDriver webdrivermanager() {
	if(driver == null) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AR\\Documents\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}
	return driver;
}
}
