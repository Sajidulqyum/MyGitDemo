package stepDefination;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.PageObjectManager;
import utils.TestSetup;
public class LandingPageSD {
	public WebDriver driver;
	public String productName;
	TestSetup testset;
	PageObjectManager pageobjectmanager;
	LandingPage landingpage;
	
	public LandingPageSD(TestSetup testset) {
		this.testset=testset;
		this.landingpage = testset.pageobjectmanager.getLandingPage();
		}

	@Given("User is on GreenCard landing page")
	public void user_is_on_green_card_landing_page() {
		Assert.assertTrue(landingpage.getTitleLandingPage().contains("GreenKart"));
		}
	@When("^User searched with (.+) and extracted actual name of the product$")
	public void user_searched_with_and_extracted_actual_name_of_the_product(String shortname) throws InterruptedException {
		landingpage.searchItem(shortname);
	    Thread.sleep(2000);
	    //.split(-) text right to the "-" consider as index 1 and left will be consider as index 0
	    //.trim() used for remove space
	   productName = landingpage.getproductname().split("-")[0].trim();
	   System.out.println(productName +" is extracted from the home page");
	   System.out.println("mY NAME iS tOMATO");
	   }
	@When("Added {string} items of the selected product to the cart")
	public void Added_items_of_the_selected_product_to_the_cart(String quantity) {
		landingpage.incrementQuantity(Integer.parseInt(quantity));
		landingpage.addtoCart();
	}
}
