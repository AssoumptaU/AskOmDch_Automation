package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MenPage {
    private WebDriver driver;
    private By productsDiv = By.className("columns-4");
    private By addToCartButton = By.cssSelector("a.add_to_cart_button");
    private By viewCartLink = By.cssSelector("a.added_to_cart");

    public MenPage(WebDriver driver){
        this.driver = driver;
    }

    public List<WebElement> getAllMenProducts(){
      return  driver.findElements(productsDiv);
    }

    public void addFirstProductToCart(){
       WebElement firstProduct = getAllMenProducts().getFirst();
       firstProduct.findElement(addToCartButton).click();
    }

    public String getViewToCartText(){
        WebElement linkToViewCart = driver.findElement(viewCartLink);
     return linkToViewCart.getText();
    }

    public CartPage clickOnViewCartLink(){
        WebElement linkToViewCart = driver.findElement(viewCartLink);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.presenceOfElementLocated(viewCartLink));
        linkToViewCart.click();
        return new CartPage(driver);
    }
}
