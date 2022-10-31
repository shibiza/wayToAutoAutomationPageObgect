package org.example;

import org.example.invoker.wayToAutomation.HomePageWayToAutomation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Way2AutomationTests extends BaseTest {

    public WebDriver webDriver;
    public String writeFirstName = "Natallia";
    public String writeLastName = "Samoilik";
    public String writePhoneNumber = "572111551";
    public String writeUserName = "Natali";
    public String writeEmail = "samoiliknata@gmail.com";
    public String wrongEmail = "samoiliknatagmail.com";
    public String writePassword = "123456";
    public String warningBadEmail = "Please enter a valid email address.";

    HomePageWayToAutomation homePageWayToAutomation = new HomePageWayToAutomation(webDriver);

    @Test
    public void writeCredentials() {
        homePageWayToAutomation.openWayToAuto()
                .enterFirstName(writeFirstName)
                .enterLastName(writeLastName)
                .enterMaritalStatus()
                .enterHobbyReading()
                .enterPhoneNumber(writePhoneNumber)
                .enterUsername(writeUserName)
                .enterWriteEmail(writeEmail)
                .enterPassword(writePassword);
        WebElement submitButton = webDriver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[13]/input"));
        submitButton.click();
        Assert.assertTrue(homePageWayToAutomation.error(), "Registration failed");
    }

    @Test
    public void wrongCredentials() {
        homePageWayToAutomation.openWayToAuto()
                .enterFirstName(writeFirstName)
                .enterLastName(writeLastName)
                .enterMaritalStatus()
                .enterHobbyReading()
                .enterPhoneNumber(writePhoneNumber)
                .enterUsername(writeUserName)
                .enterWrongEmail(wrongEmail)
                .enterPassword(writePassword);
        Assert.assertTrue(homePageWayToAutomation.warningSignWrongEmail(), warningBadEmail);
    }
}
