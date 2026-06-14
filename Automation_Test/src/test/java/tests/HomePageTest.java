package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;

public class HomePageTest extends BaseTest {

	@Test
	public void verifyHomePage() {

		HomePage home = new HomePage(driver);

		String actualTitle = home.getPageTitle();

		System.out.println("Page Title = " + actualTitle);

		Assert.assertTrue(actualTitle.contains("Automation"));

		System.out.println("Home Page Verified Successfully");
	}
}