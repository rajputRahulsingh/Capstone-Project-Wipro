package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.DynamicButtonPage;
import utils.WaitHelper;

public class DynamicButtonTest extends BaseTest {

	@Test
	public void verifyDynamicButton() {

		DynamicButtonPage page = new DynamicButtonPage(driver);

		// Scroll to button
		scrollToElement(driver.findElement(page.getStartButtonLocator()));

		WaitHelper.pause(2);

		// Click Start button
		page.clickStartButton();

		// Wait for Stop button
		WaitHelper.waitForElementClickable(driver,page.getStopButtonLocator(),10);

		WaitHelper.pause(2);

		// Validation
		Assert.assertTrue(page.isStopButtonEnabled());

		System.out.println("Stop button is enabled");
	}
}