package productdetailspage;

import base.BaseTests;
import org.testng.annotations.Test;

public class ProductDetailsPageTests extends BaseTests {

    @Test
    public void testProductDetailsHover(){
        var storePage = homePage.clickOnStoreLink();
       var productDetailsPage = storePage.clickOnProduct();
       productDetailsPage.hoverOverProductImage();
    }

}
