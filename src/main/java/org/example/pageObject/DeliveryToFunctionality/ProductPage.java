package org.example.pageObject.DeliveryToFunctionality;

import org.example.pageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {
    @FindBy(xpath = "//*[@id=\"contextualIngressPtLabel\"]")
    WebElement deliveryCountry;

    public ProductPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getDeliveryCountry(){
        return deliveryCountry.getText();
    }
}
