package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WomenPage {
    private WebDriver driver;
    private By sliderForm = By.className("price_slider_wrapper");
    private By minValue = By.id("min_price");
    private By maxValue = By.id("max_price");
    private By filterButton = By.cssSelector("button[type='submit'].button");

    public WomenPage(WebDriver driver){
        this.driver = driver;
    }

    public int [] setPriceRangeJs(int minV, int maxV){


        WebElement sliderPriceFrom = driver.findElement(sliderForm);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript(
                "arguments[0].scrollIntoView({block:'center'});"
                        +"document.getElementById('min_price').value=arguments[1];"
                        +"document.getElementById('max_price').value=arguments[2];",sliderPriceFrom,minV,maxV);
        int min = Integer.parseInt(driver.findElement(minValue).getAttribute("value"));
        int max = Integer.parseInt(driver.findElement(maxValue).getAttribute("value"));
        driver.findElement(filterButton).click();
        return new int[]{min,max};
    }
}
