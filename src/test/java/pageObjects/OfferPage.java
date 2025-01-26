package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {
    public WebDriver driver;

    public OfferPage(WebDriver driver) {
        this.driver = driver;
    }

    
    By search = By.xpath("//input[@type='search']");
    By productName = By.cssSelector("tr td:nth-child(1)");

    

    public void searchItem(String shortname) {
        driver.findElement(search).sendKeys(shortname);
    }

    public String getOfferPageProductName() {
        return driver.findElement(productName).getText();
    }
}
