package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	protected WebDriver driver;

	// Constructor
	public HomePage(WebDriver driver) {

		this.driver = driver;
	}

	// Locators
	public By guiElements = By.xpath("//h2[text()='GUI Elements']");

	public By alertsSection = By.xpath("//h2[text()='Alerts & Popups']");

	public By dragDropSection = By.xpath("//h2[contains(text(),'Mouse')]");

	// Get Page Title
	public String getPageTitle() {

		return driver.getTitle();
	}

	// Verify GUI Elements Section Displayed
	public boolean isGUIElementsDisplayed() {

		return driver.findElement(guiElements).isDisplayed();
	}

	// Verify Alerts Section Displayed
	public boolean isAlertsSectionDisplayed() {

		return driver.findElement(alertsSection).isDisplayed();
	}

	// Verify Drag Drop Section Displayed
	public boolean isDragDropSectionDisplayed() {

		return driver.findElement(dragDropSection).isDisplayed();
	}
}