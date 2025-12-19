package slider;

import base.BaseTests;
import org.testng.annotations.Test;

public class FilterBySliderTests extends BaseTests {



    @Test
    public void testSlider(){
        var womenPage = homePage.clickOnWomenLink();
        womenPage.setPriceRangeJs(30,100);
    }

}
