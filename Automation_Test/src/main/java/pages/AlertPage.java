package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {

	protected WebDriver driver;

	// Constructor
	public AlertPage(WebDriver driver) {

		this.driver = driver;
	}

	// Locators
	public By simpleAlertButton = By.id("alertBtn");

	public By confirmAlertButton = By.id("confirmBtn");

	public By promptAlertButton = By.id("promptBtn");

	public By confirmResult = By.id("demo");

	public By promptResult = By.id("demo");

	// Click Simple Alert
	public void clickSimpleAlert() {

		driver.findElement(simpleAlertButton).click();
	}

	// Click Confirm Alert
	public void clickConfirmAlert() {

		driver.findElement(confirmAlertButton).click();
	}

	// Click Prompt Alert
	public void clickPromptAlert() {

		driver.findElement(promptAlertButton).click();
	}

	// Accept Alert
	public void acceptAlert() {

		driver.switchTo().alert().accept();
	}

	// Dismiss Alert
	public void dismissAlert() {

		driver.switchTo().alert().dismiss();
	}

	// Send Text To Alert
	public void sendTextToAlert(String text) {

		Alert alert = driver.switchTo().alert();

		alert.sendKeys(text);
	}

	// Get Confirm Result
	public String getConfirmResult() {

		return driver.findElement(confirmResult).getText();
	}

	// Get Prompt Result
	public String getPromptResult() {

		return driver.findElement(promptResult).getText();
	}
}