package org.example.pageObject.DeliveryToFunctionality;

import org.example.pageObject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CatalogItemPage extends BasePage {

    protected CatalogItemPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getDeliveryCountryName(){
        WebElement deliveryBox = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@id = 'apex_offerDisplay_single_desktop']//div[@id = 'amazonGlobal_feature_div']")));
        return deliveryBox.getText();
    }
}
