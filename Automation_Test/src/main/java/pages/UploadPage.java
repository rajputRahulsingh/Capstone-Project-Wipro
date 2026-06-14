package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadPage {

	protected WebDriver driver;

	// Constructor
	public UploadPage(WebDriver driver) {

		this.driver = driver;
	}

	// Locators
	public By uploadFile = By.id("singleFileInput");

	public By submitSingleFileButton = By.xpath("//button[text()='Upload Single File']");

	public By uploadSuccessMessage = By.id("singleFileStatus");

	public By uploadFiles = By.id("multipleFilesInput");

	public By submitMultipleFilesButton = By.xpath("//button[text()='Upload Multiple Files']");

	public By multipleUploadSuccessMessage = By.id("multipleFilesStatus");

	// Upload Single File
	public void uploadSingleFile(String filePath) {

		driver.findElement(uploadFile).sendKeys(filePath);
	}

	// Click Single Upload Button
	public void clickSingleUploadButton() {

		driver.findElement(submitSingleFileButton).click();
	}

	// Get Single Upload Message
	public String getSingleUploadMessage() {

		return driver.findElement(uploadSuccessMessage).getText();
	}

	// Upload Multiple Files
	public void uploadMultipleFiles(String file1,String file2) {

		driver.findElement(uploadFiles).sendKeys(file1 + "\n" + file2);
	}

	// Click Multiple Upload Button
	public void clickMultipleUploadButton() {

		driver.findElement(submitMultipleFilesButton).click();
	}

	// Get Multiple Upload Message
	public String getMultipleUploadMessage() {

		return driver.findElement(multipleUploadSuccessMessage).getText();
	}
}