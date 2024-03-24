package sda.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sda.utilities.Driver;

public class DhtmlgoodiesPage {

    public DhtmlgoodiesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void dragCapitolInCountryBox(String capital, String country) {
        WebElement capitalBox = Driver.getDriver().findElement(By.xpath("//div[text()='" + capital + "'][2]"));
        WebElement countryBox = Driver.getDriver().findElement(By.xpath("//div[text()='" + country + "']"));
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(capitalBox, countryBox).perform();
    }
}
