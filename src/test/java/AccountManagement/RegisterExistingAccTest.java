package AccountManagement;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class RegisterExistingAccTest extends BaseTests {

    @Test
    public void testRegisterExistingAccnt(){
        var accountPage = homePage.clickOnAccountLink();
        accountPage.registerNewAccount("Assoumpta","uwasumuta12@gmail.com","12345");
        assertTrue(accountPage.getErrorMessage().contains(" An account is already registered with your email address. "),"Account registered");
//        assertEquals(accountPage.getErrorMessage(),"Error: An account is already registered with your email address. Please log in.","Account registered");

    }

}
