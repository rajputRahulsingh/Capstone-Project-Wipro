package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.WindowPage;
import utils.WaitHelper;

public class WindowHandlingTest
extends BaseTest {




    // Wikipedia Search Test

    @Test(priority = 1)
    public void verifyWikipediaSearch() {

        WindowPage page =
        new WindowPage(driver);



        scrollToElement(

        driver.findElement(
        page.searchBar));



        WaitHelper.pause(2);



        page.enterSearchText(
                "Selenium");



        WaitHelper.pause(2);



        page.clickSearchButton();



        WaitHelper.pause(2);



        Assert.assertTrue(

                page.isSearchResultPresent(
                "Selenium")
        );



        System.out.println(
        "Wikipedia Search Successful");
    }




    // New Tab Test

    @Test(priority = 2)
    public void verifyNewTab() {

        WindowPage page =
        new WindowPage(driver);



        String parentWindow =

        page.getParentWindow();



        page.clickNewTab();



        WaitHelper.pause(2);



        page.switchToChildWindow();



        Assert.assertTrue(

                page.isWindowSwitched(
                parentWindow)
        );



        System.out.println(
        "New Tab Opened Successfully");
    }




    // Popup Window Test

    @Test(priority = 3)
    public void verifyPopupWindow() {

        WindowPage page =
        new WindowPage(driver);



        String parentWindow =

        page.getParentWindow();



        page.clickPopupWindow();



        WaitHelper.pause(2);



        page.switchToChildWindow();



        Assert.assertTrue(

                page.isWindowSwitched(
                parentWindow)
        );



        System.out.println(
        "Popup Window Opened Successfully");
    }
}