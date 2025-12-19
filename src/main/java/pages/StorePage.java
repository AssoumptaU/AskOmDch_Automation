package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class StorePage {
    private WebDriver driver;
    private By categoryDropdown = By.id("product_cat");
    private By storeProducts= By.xpath("//*[@id=\"product-1205\"]/div[1]/figure/div");

    public StorePage(WebDriver driver){
        this.driver = driver;
    }


    public void selectFromCategoryDropdown(String categoryName) {
        for (WebElement option : findDropDownElement().getOptions()) {
            if (option.getText().startsWith(categoryName)) {
                option.click();
                break;
            }
        }
    }

public List<String> getSelectedCategories(){
List<WebElement> selectedElements =
        findDropDownElement().getAllSelectedOptions();
return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
}
private Select findDropDownElement(){
        return new Select(driver.findElement(categoryDropdown));
}



    public List<WebElement> getAllVisibleElements(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
       return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(storeProducts));
    }

    public ProductDetailsPage clickOnProduct(){
       List<WebElement> products = getAllVisibleElements();
       if(products.isEmpty()){
           throw new NoSuchElementException("The products are not available on the store page");
       }
                products.getFirst().click();
        return new ProductDetailsPage(driver);
    }

}
