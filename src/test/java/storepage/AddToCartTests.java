package storepage;

import base.BaseTests;
import org.testng.annotations.Test;

public class AddToCartTests extends BaseTests {

    @Test
    public void testAddToCartOnMenPage(){
        var menPage = homePage.clickOnMenLink();
        menPage.getAllMenProducts();
        menPage.addFirstProductToCart();
    }
}
