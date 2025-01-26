package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
public WebDriver driver;

public CheckOutPage(WebDriver driver) {
		this.driver=driver;
	}
		By CartButton = By.cssSelector("img[alt='Cart']");
		By ProceedButton = By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']");
		By ApplyButton = By.cssSelector(".promoBtn");
		By PlaceOrderButton = By.xpath("//button[normalize-space()='Place Order']");
		By productName = By.cssSelector(".product-name");
		
		public void CheckOutItems() {
			driver.findElement(CartButton).click();
			driver.findElement(ProceedButton).click();
		}
		public Boolean Promobtn() {
			return driver.findElement(ApplyButton).isDisplayed();
		}
		public Boolean PlaceOrderbtn() {
			return driver.findElement(PlaceOrderButton).isDisplayed();
		}
		public String getProductName() {
			return driver.findElement(productName).getText();
		}
}
