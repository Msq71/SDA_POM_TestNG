package sda.tests;

import org.testng.annotations.Test;
import sda.pages.DhtmlgoodiesPage;
import sda.utilities.Driver;

public class C05_DhtmlgoodiesTest {
    // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
    // Fill in capitals by country.

    @Test
    public void test() {
        DhtmlgoodiesPage dhtmlgoodiesPage = new DhtmlgoodiesPage();

        // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
        String url = "http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html";
        Driver.getDriver().get(url);

        // Fill in capitals by country.
        dhtmlgoodiesPage.dragCapitolInCountryBox("Madrid", "Spain");
        dhtmlgoodiesPage.dragCapitolInCountryBox("Washington", "United States");
        dhtmlgoodiesPage.dragCapitolInCountryBox("Rome", "Italy");
        dhtmlgoodiesPage.dragCapitolInCountryBox("Seoul", "South Korea");
        dhtmlgoodiesPage.dragCapitolInCountryBox("Copenhagen", "Denmark");
        dhtmlgoodiesPage.dragCapitolInCountryBox("Oslo", "Norway");
        dhtmlgoodiesPage.dragCapitolInCountryBox("Stockholm", "Sweden");

    }

}
