package org.example;

import org.example.pageObject.AddRemoveCart.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRemoveItemToCartTest extends BaseTest {

    public String cartSubtotalOneItem = "1";

    ProductPage productPage = new ProductPage(webDriver);

    @Test
    public void addToCart() {

        String cartAmount = productPage
                .open()
                .addToCart()
                .someShit()
                .takeCartAmount();
        Assert.assertEquals(cartAmount, cartSubtotalOneItem);
    }
}
