package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage extends BasePage {

    @FindBy(id="add-to-cart-button")
    private WebElement buttonAddToCart;

    @FindBy(id="attach-close_sideSheet-link")
    private WebElement closeSideSheet;

    @FindBy(id="nav-cart-count")
    private WebElement cartAmount;

    @FindBy(id="nav-cart")
    private WebElement cart;

    @FindBy(xpath = "//input[@value='Delete']")
    private WebElement cartDeleteButton;

    @FindBy(id = "sc-subtotal-amount-activecart")
    private  WebElement cartSubtotal;

    public ProductPage(WebDriver webDriver) {
        super (webDriver);
    }

    public org.example.pageObject.ProductPage open () {
        webDriver.get("https://www.amazon.com/Sceptre-E248W-19203R-Monitor-Speakers-Metallic/dp/B0773ZY26F/ref=lp_16225007011_1_3");
        webDriver.manage().window().maximize();
        return this;
    }

    public org.example.pageObject.ProductPage addToCart() {
        buttonAddToCart.click();
        return this;
    }

    public org.example.pageObject.ProductPage closeSlideSheet () {
        WebElement addedToCard = new WebDriverWait(webDriver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']")));
        closeSideSheet.click();
        return this;
    }

    public String takeCartAmount () {
        return cartAmount.getText();
    }

    public org.example.pageObject.ProductPage cartClick () {
        cart.click();
        return this;
    }

    public org.example.pageObject.ProductPage cartClear () {
        cartDeleteButton.click();
        return this;
    }

    public String getCartSubtotal () {
        WebElement cartH1 = new WebDriverWait(webDriver,Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='a-spacing-mini a-spacing-top-base']")));
        return cartSubtotal.getText();
    }
}
