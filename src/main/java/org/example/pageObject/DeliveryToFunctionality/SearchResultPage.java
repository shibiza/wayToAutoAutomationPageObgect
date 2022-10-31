package org.example.pageObject.DeliveryToFunctionality;

import org.example.pageObject.AddRemoveCart.ProductPage;
import org.example.pageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class SearchResultPage extends BasePage {
    @FindBys({
            @FindBy(xpath = "//*[@class=\"a-size-medium a-color-base a-text-normal\"]")
    })
    List<WebElement> searchResultData;

    public SearchResultPage(WebDriver webDriver) {
        super(webDriver);
    }

    public BasePage selectAnyProductOnSearchResultPage() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        searchResultData.stream().findFirst().get().click();
        return new ProductPage(webDriver);
    }

}
