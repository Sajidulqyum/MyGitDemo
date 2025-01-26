package stepDefination;


import org.testng.Assert;


import io.cucumber.java.en.Then;

import pageObjects.LandingPage;
import pageObjects.OfferPage;
import pageObjects.PageObjectManager;
import utils.TestSetup;
public class OfferPageSD {
	TestSetup testset;
	PageObjectManager pageobjectmanager;
    public String offerpageproductname;
	
	public  OfferPageSD(TestSetup testset) {
		this.testset=testset;
	}
	
	@Then("^User searched for (.+) in offers page$")
	public void user_searched_for_same_shortname_in_offers_page_to_see_if_product_exist(String shortname) throws InterruptedException {
		 switchtofferpage();
		 OfferPage offerpage = testset.pageobjectmanager.getOfferPage();	
	     offerpage.searchItem(shortname);
	   Thread.sleep(2000);
	   offerpageproductname = offerpage.getOfferPageProductName();
	   System.out.println(offerpageproductname +" is extracted from the offer page");
   }
	public void switchtofferpage() {
		LandingPage landingpage = testset.pageobjectmanager.getLandingPage();
		landingpage.clickTopDeals();
		testset.genericutils.SwitchToChildWindow();
	}
	@Then("validate if the product matches")
	public void validate_if_the_product_matches(){
	Assert.assertEquals(offerpageproductname,testset.productName);
	}
}

