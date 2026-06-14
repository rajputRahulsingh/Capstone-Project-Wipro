package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.ShadowDOMPage;
import utils.WaitHelper;

public class ShadowDOMTest extends BaseTest {

	@Test(priority = 1)
	public void shadowTextBoxTest() {

		ShadowDOMPage page = new ShadowDOMPage(driver);

		scrollToElement(driver.findElement(page.shadowHost));

		WaitHelper.pause(2);

		page.enterTextInShadowTextbox("Rahul");

		Assert.assertEquals(page.getShadowTextboxValue(),"Rahul");
	}

	@Test(priority = 2)
	public void shadowCheckboxTest() {

		ShadowDOMPage page = new ShadowDOMPage(driver);

		scrollToElement(driver.findElement(page.shadowHost));

		WaitHelper.pause(2);

		page.clickShadowCheckbox();

		Assert.assertTrue(page.isShadowCheckboxSelected());
	}

	@Test(priority = 3)
	public void shadowFileUploadTest() {

		ShadowDOMPage page = new ShadowDOMPage(driver);

		scrollToElement(driver.findElement(page.shadowHost));

		WaitHelper.pause(2);

		String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\file1.pdf";

		page.uploadShadowFile(filePath);

		Assert.assertTrue(page.isFileUploaded());
	}

	@Test(priority = 4)
	public void clickBlogLinkTest() {

		ShadowDOMPage page = new ShadowDOMPage(driver);

		scrollToElement(driver.findElement(page.shadowHost));

		WaitHelper.pause(2);

		page.openShadowBlogLink();

		Assert.assertTrue(driver.getCurrentUrl().contains("pavantestingtools"));
	}
}