package AccountManagement;

import base.BaseTests;
import org.testng.annotations.Test;

public class RegisterTests extends BaseTests {

    @Test
    public void testRegisterForm(){
        var accountPage = homePage.clickOnAccountLink();
        accountPage.registerNewAccount("Assoumpta", "uwasumuta12@gmail.com","12345");
    }


}
