package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
public WebDriver driver;

public LandingPage(WebDriver driver) {
		this.driver=driver;
	}

			By search = By.xpath("//input[@type='search']");
			By productname = By.cssSelector("h4.product-name");
			By topDealsLink = By.linkText("Top Deals");
			By increment = By.cssSelector("a.increment");
			By addtoCart = By.cssSelector(".product-action button");

		
		public void searchItem(String name) {
			driver.findElement(search).sendKeys(name);
		}
		public String getproductname() {
			return driver.findElement(productname).getText();
		}
		public void clickTopDeals() {
	        driver.findElement(topDealsLink).click();
	    }
		public String getTitleLandingPage()
		{
			return driver.getTitle();
		}
		public void incrementQuantity(int quantity) {
			int i = quantity-1;
			while(i>0) {
				driver.findElement(increment).click();
				i--;
			}
		}
		public void addtoCart() {
			driver.findElement(addtoCart).click();
		}
}
