package sda.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import sda.utilities.Driver;

public class FacebookLoginPage {
    //Go to https://www.facebook.com/
    //Log in (faker class)
    //Test the "Failed to log in" message
    public FacebookLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    Faker faker = new Faker();

    @FindBy(id = "email")
    public WebElement emailField;

    @FindBy(id = "pass")
    public WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    public void fakeLogin() {
        emailField.sendKeys(faker.internet().emailAddress());
        passwordField.sendKeys(faker.internet().password());
        loginButton.click();
    }

    @FindBy(partialLinkText = "Find your account")
    public WebElement errorMessage;

    public void verifyErrorMessageIsDisplayed() {
        Assert.assertTrue(errorMessage.isDisplayed());
    }


}
