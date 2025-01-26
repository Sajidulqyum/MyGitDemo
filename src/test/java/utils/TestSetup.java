package utils;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestSetup {
	public WebDriver driver;
	public String productName;
	public PageObjectManager pageobjectmanager;
	public TestBase testbase;
	public GenericUtils genericutils;
	
	public TestSetup() {
		testbase = new TestBase();
		pageobjectmanager = new PageObjectManager(testbase.webdrivermanager());
		genericutils = new GenericUtils(testbase.webdrivermanager());
	}
}
