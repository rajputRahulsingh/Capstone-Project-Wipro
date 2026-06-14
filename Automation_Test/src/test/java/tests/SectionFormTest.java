package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;

public class SectionFormTest extends BaseTest {

	@DataProvider(name = "sectionData")
	public Object[][] getData() {

		return new Object[][] {
			{0,"Rahul"},
			{1,"Aman"},
			{2,"Karan"}
		};
	}

	@Test(dataProvider = "sectionData")
	public void verifySectionForm(int index,String value) {

		List<WebElement> textBoxes = driver.findElements(By.xpath("//div[@class='form-group']//input"));

		List<WebElement> buttons = driver.findElements(By.xpath("//button[text()='Submit']"));

		textBoxes.get(index).clear();

		textBoxes.get(index).sendKeys(value);

		buttons.get(index).click();

		String actual = textBoxes.get(index).getAttribute("value");

		Assert.assertEquals(actual,value);

		System.out.println("Verified Section " + (index + 1) + " : " + value);
	}
}