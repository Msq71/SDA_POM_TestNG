package sda.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import sda.pages.FacebookLoginPage;
import sda.utilities.Driver;

public class C06_FacebookNegativeLoginTest {
    //Go to https://www.facebook.com/
    //Log in (faker class)
    //Test the "Failed to log in" message
    @Test
    public void negativeLoginTest() throws InterruptedException {
        FacebookLoginPage loginPage = new FacebookLoginPage();
        String url = "https://www.facebook.com/";
        Driver.getDriver().get(url);
        loginPage.fakeLogin();
        Thread.sleep(2000);
        // Assert.assertTrue(facebookLoginPage.errorMessage.isDisplayed());
        loginPage.verifyErrorMessageIsDisplayed();
    }


}
