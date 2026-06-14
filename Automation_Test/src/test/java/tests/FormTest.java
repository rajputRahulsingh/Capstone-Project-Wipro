package tests;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import dataproviders.TestDataProvider;
import pages.FormPage;

public class FormTest extends BaseTest {

	// Form Test
	@Test(dataProvider = "formData",dataProviderClass = TestDataProvider.class,priority = 1)
	public void verifyForm(String name,String email,String phone,String address) {

		FormPage page = new FormPage(driver);

		page.fillForm(name,email,phone,address);

		page.selectGender("male");
	}

	// Date Picker 1 Test
	@Test(priority = 2)
	public void verifyDatePicker1() {

		FormPage page = new FormPage(driver);

		page.selectDatePicker1("06/12/2026");

		Assert.assertEquals(page.getDatePicker1Value(),"06/12/2026");
	}

	// Date Picker 2 Test
	@Test(priority = 3)
	public void verifyDatePicker2() {

		FormPage page = new FormPage(driver);

		page.selectDatePicker2("12/06/2026");

		Assert.assertFalse(page.getDatePicker2Value().isEmpty());
	}

	// Date Range Test
	@Test(priority = 4)
	public void verifyDateRange() {

		FormPage page = new FormPage(driver);

		page.selectDateRange("2026-06-21","2026-06-30");

		page.clickDateSubmitButton();

		Assert.assertEquals(page.getStartDateValue(),"2026-06-21");
	}

	// Country Selection Test
	@Test(priority = 5)
	public void verifyCountrySelection() {

		FormPage page = new FormPage(driver);

		page.selectCountry("India");

		Assert.assertEquals(page.getSelectedCountry(),"India");

		System.out.println("Selected Country = " + page.getSelectedCountry());
	}

	// Color Selection Test
	@Test(priority = 6)
	public void verifyColorSelection() {

		FormPage page = new FormPage(driver);

		page.selectColor("Red");

		page.selectColor("Blue");

		List<WebElement> selectedColors = page.getSelectedColors();

		Assert.assertTrue(selectedColors.size() > 0);

		for(WebElement color : selectedColors) {

			System.out.println(color.getText());
		}
	}
}