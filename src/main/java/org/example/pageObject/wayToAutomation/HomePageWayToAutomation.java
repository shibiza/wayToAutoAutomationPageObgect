package org.example.pageObject.wayToAutomation;

import org.example.pageObject.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePageWayToAutomation {

    protected WebDriver webDriver;
    protected WebDriverWait wait;

    public HomePageWayToAutomation(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        PageFactory.initElements(webDriver, this);
    }

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
}
