package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShadowDOMPage {

	protected WebDriver driver;

	// Constructor
	public ShadowDOMPage(WebDriver driver) {

		this.driver = driver;
	}

	// Locators
	public By shadowHost = By.id("shadow_host");

	// Get Shadow Root
	public SearchContext getShadowRoot() {

		WebElement host = driver.findElement(shadowHost);

		return host.getShadowRoot();
	}

	// Enter Text In Shadow Textbox
	public void enterTextInShadowTextbox(String text) {

		WebElement textbox = getShadowRoot().findElement(
				By.cssSelector("input[type='text']"));

		textbox.sendKeys(text);
	}

	// Get Shadow Textbox Value
	public String getShadowTextboxValue() {

		WebElement textbox = getShadowRoot().findElement(
				By.cssSelector("input[type='text']"));

		return textbox.getAttribute("value");
	}

	// Click Shadow Checkbox
	public void clickShadowCheckbox() {

		WebElement checkbox = getShadowRoot().findElement(
				By.cssSelector("input[type='checkbox']"));

		checkbox.click();
	}

	// Verify Shadow Checkbox Selected
	public boolean isShadowCheckboxSelected() {

		WebElement checkbox = getShadowRoot().findElement(
				By.cssSelector("input[type='checkbox']"));

		return checkbox.isSelected();
	}

	// Upload Shadow File
	public void uploadShadowFile(String path) {

		WebElement upload = getShadowRoot().findElement(
				By.cssSelector("input[type='file']"));

		upload.sendKeys(path);
	}

	// Verify File Uploaded
	public boolean isFileUploaded() {

		WebElement upload = getShadowRoot().findElement(
				By.cssSelector("input[type='file']"));

		return !upload.getAttribute("value").isEmpty();
	}

	// Open Shadow Blog Link
	public void openShadowBlogLink() {

		WebElement blogLink = getShadowRoot().findElement(
				By.cssSelector("a"));

		String href = blogLink.getAttribute("href");

		driver.navigate().to(href);
	}
}