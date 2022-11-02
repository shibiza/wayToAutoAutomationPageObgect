package org.example.pageObject.AddRemoveCart;

import org.example.pageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductPage extends BasePage {

    @FindBy(id = "add-to-cart-button")
    private WebElement buttonAddToCart;

    @FindBy(id = "nav-cart-count")
    private WebElement cartAmount;

    @FindBy(id = "attach-accessory-cart-total-string")
    private WebElement cartTonalString;

    public ProductPage(WebDriver webDriver) {
        super(webDriver);
    }

    private void waitForElementVisibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public ProductPage open() {
        String categoryPath = "-E248W-19203R-Monitor-Speakers-Metallic/dp/B0773ZY26F/ref=lp_16225007011_1_3";
        webDriver.get("https://www.amazon.com/" + categoryPath);
        webDriver.manage().window().maximize();
        return this;
    }

    public ProductPage addToCart() {
        waitForElementVisibility(buttonAddToCart);
        buttonAddToCart.click();
        return this;
    }

    public String takeCartAmount() {
        return cartAmount.getText();
    }

    public ProductPage someShit() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.visibilityOf(cartTonalString)).click();
        return this;
    }
}