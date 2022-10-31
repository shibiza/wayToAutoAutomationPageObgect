package org.example;

import org.example.pageObject.DeliveryToFunctionality.CatalogItemPage;
import org.example.pageObject.DeliveryToFunctionality.CatalogPage;
import org.example.pageObject.HomePage;
import org.example.pageObject.DeliveryToFunctionality.ZipCodeInputModule;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeliveryToFunctionalityTest extends BaseTest {

    String countryName = "Poland";
    String zipCode = "90210";
    HomePage homePage = new HomePage(webDriver);

    @Test
    public void verifyZipCodeCorrectUpdateOnChangeInDeliverToSection() {

        ZipCodeInputModule zipCodeInputModule = homePage.open().clickDeliverTo();
        zipCodeInputModule.setZipCodeAndApply(zipCode);
        homePage.waitForReload();
        var deliverToText = homePage.getDeliverToText();
        Assert.assertTrue(deliverToText.contains(zipCode),
                "Delivery To Textbox doesn't contain the required zipcode");
    }

    @Test
    public void verifyDeliverToListOfCountiesContainsPoland() {

        ZipCodeInputModule zipCodeInputModule = homePage.open().clickDeliverTo();
        Assert.assertTrue(
                zipCodeInputModule.deliverToListOfCounties().stream().anyMatch(c -> c.equals(countryName)),
                "List of countries doesn't contain " + countryName);
    }

    @Test
    public void verifyShippingToSectionContainsDeliverToCountry() {

        ZipCodeInputModule zipCodeInputModule = homePage.open().clickDeliverTo();
        zipCodeInputModule.chooseCountryAndApply(countryName);
        homePage.waitForReload();
        CatalogPage catalogPage = homePage.clickHeadsetsCatalog();
        CatalogItemPage catalogItemPage = catalogPage.clickCatalogItem();
        Assert.assertTrue(catalogItemPage.getDeliveryCountryName().contains(countryName),
                "Catalog item delivery country is not " + countryName);
    }
}