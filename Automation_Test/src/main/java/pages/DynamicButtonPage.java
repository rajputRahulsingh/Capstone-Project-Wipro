package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicButtonPage {

	protected WebDriver driver;

	// Constructor
	public DynamicButtonPage(WebDriver driver) {

		this.driver = driver;
	}

	// Locators
	public By dynamicBtnStart = By.xpath("//button[@name='start']");

	public By dynamicBtnStop = By.xpath("//button[@name='stop']");

	// Click Start Button
	public void clickStartButton() {

		driver.findElement(dynamicBtnStart).click();
	}

	// Check Stop Button Enabled
	public boolean isStopButtonEnabled() {

		return driver.findElement(dynamicBtnStop).isEnabled();
	}

	// Get Start Button Locator
	public By getStartButtonLocator() {

		return dynamicBtnStart;
	}

	// Get Stop Button Locator
	public By getStopButtonLocator() {

		return dynamicBtnStop;
	}
}