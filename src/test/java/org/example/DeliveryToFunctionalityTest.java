package org.example;

import org.example.factory.WebDriverFactory;
import org.example.pageObject.AddRemoveCart.ProductPage;
import org.example.pageObject.DeliveryToFunctionality.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DeliveryToFunctionalityTest {

    public HomePage homePage;
    public String poland = "Poland";
    public String zip = "90210";
    public String headphones = "headphones";

    @BeforeClass
    public void setup() {
        WebDriver webDriver = new WebDriverFactory().getWebDriver();
        homePage = new HomePage(webDriver);
    }

    @Test
    public void testDeliverCountryPoland() {
        boolean isDeliveredCountryPoland = homePage.open().openProfileDropDown().inputPostalCodeInDropdownModuleAndClickApplyButton(zip).openProfileDropDown().
                chooseDeliverLocationAsPolandAndClickDoneButton().searchOnSearchFieldByData(headphones).selectAnyProductOnSearchResultPage().getDeliveryCountry().contains(poland);
        Assert.assertTrue(isDeliveredCountryPoland);
    }
}

