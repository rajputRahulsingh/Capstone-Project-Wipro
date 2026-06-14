package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinksPage {

	protected WebDriver driver;

	// Constructor
	public LinksPage(WebDriver driver) {

		this.driver = driver;
	}

	// Locators
	public By home = By.linkText("Home");

	public By subscribe = By.linkText("Posts (Atom)");

	public By apple = By.linkText("Apple");

	public By lenovo = By.linkText("Lenovo");

	public By dell = By.linkText("Dell");

	public By err400 = By.linkText("Errorcode 400");

	public By err401 = By.linkText("Errorcode 401");

	public By err403 = By.linkText("Errorcode 403");

	public By err404 = By.linkText("Errorcode 404");

	public By err408 = By.linkText("Errorcode 408");

	public By err500 = By.linkText("Errorcode 500");

	public By err502 = By.linkText("Errorcode 502");

	public By err503 = By.linkText("Errorcode 503");

	// Click Home Link
	public void clickHomeLink() {

		driver.findElement(home).click();
	}

	// Click Apple Link
	public void clickAppleLink() {

		driver.findElement(apple).click();
	}

	// Click Dell Link
	public void clickDellLink() {

		driver.findElement(dell).click();
	}

	// Click Lenovo Link
	public void clickLenovoLink() {

		driver.findElement(lenovo).click();
	}

	// Get Page Title
	public String getPageTitle() {

		return driver.getTitle();
	}

	// Get Current URL
	public String getCurrentUrl() {

		return driver.getCurrentUrl();
	}
}