package org.example.pageObject.wayToAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageWayToAutomation extends BasePageWayToAuto {

    @FindBy(xpath = "//*[@id=\"register_form\"]/fieldset[1]/p[1]/input")
    private WebElement firstNameForm;

    @FindBy(xpath = "//*[@id=\"register_form\"]/fieldset[1]/p[2]/input")
    private WebElement lastNameForm;

    @FindBy(xpath = "//*[@id=\"register_form\"]/fieldset[2]/div/label[2]/input")
    private WebElement maritalStatusMarried;

    @FindBy(xpath = "//*[@id=\"register_form\"]/fieldset[3]/div/label[2]/input")
    private WebElement hobbyReading;

    @FindBy(xpath = "//*[@id=\"register_form\"]/fieldset[6]/input")
    private WebElement phoneNumberForm;

    @FindBy(xpath = "//*[@id=\"register_form\"]/fieldset[7]/input")
    private WebElement userNameForm;

    @FindBy(xpath = "//*[@id=\"register_form\"]/fieldset[8]/input")
    private WebElement emailForm;

    @FindBy(xpath = "//*[@id=\"register_form\"]/fieldset[11]/input")
    private WebElement password;

    @FindBy(xpath = "//*[@id=\"register_form\"]/fieldset[13]/input")
    private WebElement submitButton;

    @FindBy(xpath = "//*[@id=\"register_form\"]/fieldset[8]/label[2]")
    private WebElement warningWrongEmail;

    public HomePageWayToAutomation(WebDriver webDriver) {
        super(webDriver);
    }

    public HomePageWayToAutomation openWayToAuto() {
        webDriver.get("https://www.way2automation.com/way2auto_jquery/registration.php#load_box");
        return this;
    }

    public HomePageWayToAutomation enterFirstName(String writeFirstName) {
        webDriver.findElement((By) firstNameForm).sendKeys(writeFirstName);
        return this;
    }

    public HomePageWayToAutomation enterLastName(String writeLastName) {
        webDriver.findElement((By) lastNameForm).sendKeys(writeLastName);
        return this;
    }

    public HomePageWayToAutomation enterMaritalStatus() {
        webDriver.findElement((By) maritalStatusMarried).click();
        return this;
    }

    public HomePageWayToAutomation enterHobbyReading() {
        webDriver.findElement((By) hobbyReading).click();
        return this;
    }

    public HomePageWayToAutomation enterPhoneNumber(String writePhoneNumber) {
        webDriver.findElement((By) phoneNumberForm).sendKeys(writePhoneNumber);
        return this;
    }

    public HomePageWayToAutomation enterUsername(String writeUserName) {
        webDriver.findElement((By) userNameForm).sendKeys(writeUserName);
        return this;
    }

    public HomePageWayToAutomation enterWriteEmail(String writeEmail) {
        webDriver.findElement((By) emailForm).sendKeys(writeEmail);
        return this;
    }

    public HomePageWayToAutomation enterWrongEmail(String wrongEmail) {
        webDriver.findElement((By) emailForm).sendKeys(wrongEmail);
        return this;
    }

    public HomePageWayToAutomation enterPassword(String writePassword) {
        webDriver.findElement((By) password).sendKeys(writePassword);
        return this;
    }

    public boolean error() {
        boolean errorElements = webDriver.findElements(By.className("error_p")).isEmpty();
        return errorElements;
    }

    public boolean warningSignWrongEmail() {
        boolean warning = webDriver.findElement((By) warningWrongEmail).isDisplayed();
        return warning;
    }
}
