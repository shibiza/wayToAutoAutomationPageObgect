package org.example;

import org.example.pageObject.wayToAutomation.HomePageWayToAutomation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Way2AutomationTests extends BaseTest {

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
                .enterPassword(writePassword)
                .pressSubmitButton();
        Assert.assertTrue(homePageWayToAutomation.shouldBeFilled(), "Registration passed but the required fields were left unfilled");;
    }

    @Test
    public void wrongCredentials() {
      String receivingWarning = String.valueOf(homePageWayToAutomation.openWayToAuto()
                .enterFirstName(writeFirstName)
                .enterLastName(writeLastName)
                .enterMaritalStatus()
                .enterHobbyReading()
                .enterPhoneNumber(writePhoneNumber)
                .enterUsername(writeUserName)
                .enterWrongEmail(wrongEmail)
                .enterPassword(writePassword));
        Assert.assertFalse(Boolean.parseBoolean(receivingWarning), warningBadEmail);
    }
}