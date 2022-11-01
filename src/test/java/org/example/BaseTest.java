package org.example;

import org.example.factory.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver webDriver = new WebDriverFactory().getWebDriver();

    @BeforeMethod
    public void setup() {
        webDriver.manage().window().maximize();
    }

    @AfterMethod
    public void clean() {
        webDriver.close();
        webDriver.quit();
    }
}