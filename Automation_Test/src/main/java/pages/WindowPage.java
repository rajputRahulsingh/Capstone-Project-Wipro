package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowPage {

	protected WebDriver driver;

	// Constructor
	public WindowPage(WebDriver driver) {

		this.driver = driver;
	}

	// =========================
	// SEARCH LOCATORS
	// =========================

	public By searchBar = By.id("Wikipedia1_wikipedia-search-input");

	public By searchBtn = By.xpath("//input[@type='submit']");

	// =========================
	// WINDOW LOCATORS
	// =========================

	public By newTab = By.xpath("//button[text()='New Tab']");

	public By popup = By.id("PopUp");

	// =========================
	// SEARCH METHODS
	// =========================

	public void enterSearchText(String text) {

		driver.findElement(searchBar).sendKeys(text);
	}

	public void clickSearchButton() {

		driver.findElement(searchBtn).click();
	}

	public boolean isSearchResultPresent(String text) {

		return driver.getPageSource().contains(text);
	}

	// =========================
	// WINDOW METHODS
	// =========================

	public void clickNewTab() {

		driver.findElement(newTab).click();
	}

	public void clickPopupWindow() {

		driver.findElement(popup).click();
	}

	public String getParentWindow() {

		return driver.getWindowHandle();
	}

	public void switchToChildWindow() {

		String parent = driver.getWindowHandle();

		Set<String> windows = driver.getWindowHandles();

		for(String window : windows) {

			if(!window.equals(parent)) {

				driver.switchTo().window(window);

				break;
			}
		}
	}

	public boolean isWindowSwitched(String parentWindow) {

		return !driver.getWindowHandle().equals(parentWindow);
	}
}