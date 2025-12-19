package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {
    private WebDriver driver;
    private By registerUsernameField = By.id("reg_username");
    private By registerEmailField = By.id("reg_email");
    private By registerPasswordField = By.id("reg_password");
    private By buttonToRegister = By.name("register");
    private By loginUsernameorEmailField = By.id("username");
    private By loginPasswordField = By.id("password");
    private By buttonToLogin = By.name("login");
    private By errorMessage = By.cssSelector(" .woocommerce-notices-wrapper .woocommerce-error ");



    public AccountPage(WebDriver driver){
        this.driver = driver;
    }

    public void registerNewAccount(String username, String email, String password){
        driver.findElement(registerUsernameField).sendKeys(username);
        driver.findElement(registerEmailField).sendKeys(email);
        driver.findElement(registerPasswordField).sendKeys(password);
        clickRegisterButton();
    }

    public void loginAccount(String nameOrEmail, String passwrd){
        driver.findElement(loginUsernameorEmailField).sendKeys(nameOrEmail);
        driver.findElement(loginPasswordField).sendKeys(passwrd);
        clickLoginButton();
    }

    public void clickRegisterButton(){
        driver.findElement(buttonToRegister).click();
    }

    public void clickLoginButton(){
        driver.findElement(buttonToLogin).click();
    }

    public String getErrorMessage(){
       return driver.findElement(errorMessage).getText();
    }
}
