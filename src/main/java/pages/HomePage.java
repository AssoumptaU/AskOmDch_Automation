package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By store= By.id("menu-item-1227");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public StorePage clickOnStoreLink(){
        clickNavLinks("Store");
        return new StorePage(driver);
    }

    public MenPage clickOnMenLink(){
        clickNavLinks("Men");
        return new MenPage(driver);
    }

    public WomenPage clickOnWomenLink(){
        clickNavLinks("Women");
        return new WomenPage(driver);
    }

    public AccountPage clickOnAccountLink(){
        clickNavLinks("Account");
        return new AccountPage(driver);
    }

    public void clickNavLinks(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

}


