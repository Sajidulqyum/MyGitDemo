package stepDefination;


import org.openqa.selenium.WebDriver;

import org.testng.Assert;


import io.cucumber.java.en.Then;

import pageObjects.CheckOutPage;

import pageObjects.PageObjectManager;
import utils.TestSetup;
public class CheckOutPageSD {
	public WebDriver driver;
	public String productName;
	CheckOutPage checkoutpage;
	TestSetup testset;
	PageObjectManager pageobjectmanager;
	
	
	
	public CheckOutPageSD(TestSetup testset) {
		this.testset=testset;
		this.checkoutpage = testset.pageobjectmanager.getCheckOutPage();
	}
	
	@Then("^User proceed to checkout and validate the (.+) items in the checkout page$")
	public void User_proceed_to_checkout_and_validate_the_items_in_the_checkout_page(String name) throws InterruptedException {
		checkoutpage.CheckOutItems();
		Thread.sleep(2000);
		//assertion to extract the name from screen and compare with name
		productName = checkoutpage.getProductName().split("-")[0].trim();
		System.out.println(productName + " is extracted from checkout page");
	}
	@Then("verify user has the ability to enter the promo code and place the order")
	public void verify_user_has_the_ability_to_enter_the_promo_code_and_place_the_order() {
		Assert.assertTrue(checkoutpage.Promobtn());
		Assert.assertTrue(checkoutpage.PlaceOrderbtn());
	}
	
}
