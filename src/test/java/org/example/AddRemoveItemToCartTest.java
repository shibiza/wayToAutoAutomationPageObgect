package org.example;

import org.example.pageObject.AddRemoveCart.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRemoveItemToCartTest extends BaseTest {

    ProductPage productPage = new ProductPage(webDriver);

    @Test
    public void addToCart() {
        String cartAmount = productPage
                .open()
                .addToCart()
                .closeSlideSheet()
                .takeCartAmount();
        Assert.assertEquals("1", cartAmount, "Adding to cart failed");
    }

    @Test
    public void removeFromCart() {
        String cartPrice = productPage
                .open()
                .addToCart()
                .closeSlideSheet()
                .cartClick()
                .cartClear()
                .getCartSubtotal();

        Assert.assertEquals(" $0.00", cartPrice, "Removing from cart failed");
    }
}
