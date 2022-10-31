package org.example.pageObject.DeliveryToFunctionality;

import org.example.pageObject.BasePage;
import org.example.pageObject.DeliveryToFunctionality.CatalogItemPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CatalogPage extends BasePage {

    public CatalogPage(WebDriver webDriver) {
        super(webDriver);
    }

    public CatalogItemPage clickCatalogItem(){
        WebElement buttonHeadsetsMicro = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id = 'search']//div[@cel_widget_id= 'MAIN-SEARCH_RESULTS-1']//div[contains(@class, 'a-section')]//div[contains(@class, 'sg-col')]")));
        buttonHeadsetsMicro.click();
        return new CatalogItemPage(webDriver);
    }
}