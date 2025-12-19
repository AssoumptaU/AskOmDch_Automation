package Accountpage;

import base.BaseTests;
import org.testng.annotations.Test;

public class LoginTests extends BaseTests {

    @Test
    public void testLoginForm(){
        var accountPage = homePage.clickOnAccountLink();
        accountPage.loginAccount("Assoumpta","12345");
    }
}
