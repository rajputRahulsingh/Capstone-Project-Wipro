package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.MouseActionsPage;
import pages.FormPage;
import utils.WaitHelper;

public class MouseActionsTest extends BaseTest {

	// Mouse Hover Test
	@Test(priority = 1)
	public void verifyMouseHover() {

		MouseActionsPage page = new MouseActionsPage(driver);

		scrollToElement(driver.findElement(page.pointMeButton));

		WaitHelper.pause(2);

		page.hoverOnPointMe();

		WaitHelper.pause(2);

		page.clickMobiles();

		System.out.println("Mouse Hover Successful");
	}

	// Drag Drop Test
	@Test(priority = 2)
	public void verifyDragAndDrop() {

		MouseActionsPage page = new MouseActionsPage(driver);

		scrollToElement(driver.findElement(page.draggable));

		WaitHelper.pause(2);

		page.performDragAndDrop();

		WaitHelper.pause(2);

		Assert.assertTrue(page.getDroppedText().contains("Dropped"));

		System.out.println("Drag And Drop Successful");
	}

	// Double Click Test
	@Test(priority = 3)
	public void verifyDoubleClick() {

		MouseActionsPage page = new MouseActionsPage(driver);

		scrollToElement(driver.findElement(page.copyTextButton));

		WaitHelper.pause(2);

		page.doubleClickCopyButton();

		WaitHelper.pause(2);

		Assert.assertEquals(page.getField1Value(),page.getField2Value());

		System.out.println("Double Click Successful");
	}

	// Slider Test
	@Test(priority = 4)
	public void verifySlider() {

		MouseActionsPage page = new MouseActionsPage(driver);

		scrollToElement(driver.findElement(page.minSliderHandle));

		WaitHelper.pause(2);

		String before = page.getSliderValue();

		page.moveSlider(60);

		WaitHelper.pause(2);

		String after = page.getSliderValue();

		Assert.assertNotEquals(before,after);

		System.out.println("Slider Moved Successfully");
	}

	@Test(priority = 5)
	public void verifyScrollingDropdown() {

		FormPage page = new FormPage(driver);

		page.selectScrollingDropdown("Item 4");

		String enteredValue = driver.findElement(page.scrollDropdown).getAttribute("value");

		Assert.assertEquals(enteredValue,"Item 4");
	}
}