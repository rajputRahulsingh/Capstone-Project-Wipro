package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FormPage {

	protected WebDriver driver;

	// Constructor
	public FormPage(WebDriver driver) {

		this.driver = driver;
	}

	// Locators
	public By name = By.id("name");

	public By email = By.id("email");

	public By phone = By.id("phone");

	public By address = By.id("textarea");

	public By maleRadio = By.id("male");

	public By femaleRadio = By.id("female");

	public By sundayCheckbox = By.id("sunday");

	public By mondayCheckbox = By.id("monday");

	public By countryDropdown = By.id("country");

	public By colorsDropdown = By.id("colors");

	public By datePicker1 = By.id("datepicker");

	public By datePicker2 = By.id("txtDate");

	public By startDate = By.xpath("//input[@id='start-date']");

	public By endDate = By.xpath("//input[@id='end-date']");

	public By dateSubmitButton = By.xpath("//button[text()='Submit']");

	public By scrollDropdown = By.id("comboBox");

	// Select Scrolling Dropdown
	public void selectScrollingDropdown(String value) {

		driver.findElement(scrollDropdown).sendKeys(value);
	}

	// Fill Form
	public void fillForm(String uname,String mail,String mobile,String addr) {

		driver.findElement(name).sendKeys(uname);

		driver.findElement(email).sendKeys(mail);

		driver.findElement(phone).sendKeys(mobile);

		driver.findElement(address).sendKeys(addr);
	}

	// Select Gender
	public void selectGender(String gender) {

		if(gender.equalsIgnoreCase("male")) {

			driver.findElement(maleRadio).click();
		}

		else {

			driver.findElement(femaleRadio).click();
		}
	}

	// Select Country
	public void selectCountry(String countryName) {

		Select select = new Select(driver.findElement(countryDropdown));

		select.selectByVisibleText(countryName);
	}

	// Get Selected Country
	public String getSelectedCountry() {

		Select select = new Select(driver.findElement(countryDropdown));

		return select.getFirstSelectedOption().getText();
	}

	// Select Colors
	public void selectColor(String color) {

		Select select = new Select(driver.findElement(colorsDropdown));

		select.selectByVisibleText(color);
	}

	// Get Selected Colors
	public List<WebElement> getSelectedColors() {

		Select select = new Select(driver.findElement(colorsDropdown));

		return select.getAllSelectedOptions();
	}

	// Date Picker 1
	public void selectDatePicker1(String date) {

		driver.findElement(datePicker1).sendKeys(date);
	}

	// Get DatePicker1 Value
	public String getDatePicker1Value() {

		return driver.findElement(datePicker1).getAttribute("value");
	}

	// Date Picker 2
	public void selectDatePicker2(String date) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].setAttribute('value', arguments[1])",
				driver.findElement(datePicker2),date);
	}

	// Get DatePicker2 Value
	public String getDatePicker2Value() {

		return driver.findElement(datePicker2).getAttribute("value");
	}

	// Select Date Range
	public void selectDateRange(String fromDate,String toDate) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true);",
				driver.findElement(startDate));

		js.executeScript("arguments[0].value=arguments[1];",driver
				.findElement(startDate),fromDate);

		js.executeScript("arguments[0].value=arguments[1];",driver.
				findElement(endDate),toDate);
	}

	// Click Submit Button
	public void clickDateSubmitButton() {

		driver.findElement(dateSubmitButton).click();
	}

	// Get Start Date Value
	public String getStartDateValue() {

		return driver.findElement(startDate).getAttribute("value");
	}
}