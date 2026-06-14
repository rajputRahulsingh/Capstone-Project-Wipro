package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LinksPage;

public class LinksTest extends BaseTest {

	@Test(priority = 2)
	public void verifyAppleLink() {

		LinksPage page = new LinksPage(driver);

		page.clickAppleLink();

		Assert.assertTrue(driver.getPageSource().contains("Apple"));
	}

	@Test(priority = 3)
	public void verifyDellLink() {

		LinksPage page = new LinksPage(driver);

		page.clickDellLink();

		Assert.assertTrue(driver.getPageSource().contains("Dell"));
	}

	@Test(priority = 4)
	public void verifyLenovoLink() {

		LinksPage page = new LinksPage(driver);

		page.clickLenovoLink();

		Assert.assertTrue(driver.getPageSource().contains("Lenovo"));
	}
}