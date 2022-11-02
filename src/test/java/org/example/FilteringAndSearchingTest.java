package org.example;

import org.example.pageObject.FilteringAndSearchingPages.GamingKeyboardsCategoryPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FilteringAndSearchingTest extends BaseTest {

    private final GamingKeyboardsCategoryPage gamingKeyboardsCategory =
            new GamingKeyboardsCategoryPage(webDriver);

    @DataProvider(name = "brandNames")
    public Object[][] brandNames() {
        return new Object[][]{
                {"Corsair"}
        };
    }

    @Test(dataProvider = "brandNames")
    public void verifyProductsPricesAreSortedAscendingly(String brandName) {
        boolean arePricesInAscendingOrder = gamingKeyboardsCategory
                .open()
                .selectBrand(brandName)
                .sortProductsByPriceLowToHigh()
                .verifyPricesAreInAscendingOrder();

        Assert.assertTrue(arePricesInAscendingOrder, "Prices are not in ascending order");
    }
}
