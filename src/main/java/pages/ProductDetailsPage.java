package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductDetailsPage {
    private WebDriver driver;
    private By productDetailsImage = By.className("woocommerce-product-gallery__image");

    public ProductDetailsPage(WebDriver driver){
        this.driver = driver;
    }


    public void hoverOverProductImage(){
      WebElement productImageContainer =  driver.findElement(productDetailsImage);
      WebElement image = productImageContainer.findElement(By.tagName("img"));
      Actions action = new Actions(driver);
      action.moveToElement(image).perform();
    }


}
