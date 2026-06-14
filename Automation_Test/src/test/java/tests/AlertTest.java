package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AlertPage;
import utils.WaitHelper;

public class AlertTest extends BaseTest {

	// Simple Alert Test
	@Test(priority = 1)
	public void verifySimpleAlert() {

		AlertPage page = new AlertPage(driver);

		scrollToElement(driver.findElement(page.simpleAlertButton));

		WaitHelper.pause(2);

		page.clickSimpleAlert();

		WaitHelper.pause(2);

		page.acceptAlert();

		Assert.assertTrue(true);

		System.out.println("Simple Alert Handled");
	}

	// Confirm Alert Test
	@Test(priority = 2)
	public void verifyConfirmationAlert() {

		AlertPage page = new AlertPage(driver);

		scrollToElement(driver.findElement(page.confirmAlertButton));

		WaitHelper.pause(2);

		page.clickConfirmAlert();

		WaitHelper.pause(2);

		page.acceptAlert();

		Assert.assertTrue(true);

		System.out.println("Confirmation Alert Handled");
	}

	// Prompt Alert Test
	@Test(priority = 3)
	public void verifyPromptAlert() {

		AlertPage page = new AlertPage(driver);

		scrollToElement(driver.findElement(page.promptAlertButton));

		WaitHelper.pause(2);

		page.clickPromptAlert();

		WaitHelper.pause(2);

		page.sendTextToAlert("Rahul");

		WaitHelper.pause(2);

		page.acceptAlert();

		String result = page.getPromptResult();

		Assert.assertTrue(result.contains("Rahul"));

		System.out.println(result);
	}
}