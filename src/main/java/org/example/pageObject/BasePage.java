package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver webDriver;
    protected WebDriverWait wait;
    protected BasePage(WebDriver webDriver){
        this.webDriver = webDriver;
        this.wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        PageFactory.initElements(webDriver, this);
    }

    public static class ProductPage extends BasePage {
        @FindBy(xpath = "//*[@id=\"contextualIngressPtLabel\"]")
        WebElement deliveryCountry;

        public ProductPage(WebDriver webDriver) {
            super(webDriver);
        }

        public String getDeliveryCountry(){
            return deliveryCountry.getText();
        }
    }
}
