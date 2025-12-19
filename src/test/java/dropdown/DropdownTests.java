package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectCategory(){
      var storePage= homePage.clickOnStoreLink();
        String category = "Women";
        storePage.selectFromCategoryDropdown(category);
        var selectedCategories = storePage.getSelectedCategories();
        assertEquals(selectedCategories.size(), 1,"Oops, only one category can be selected at a time");
        assertTrue(selectedCategories.get(0).contains("Women"));
    }
}
