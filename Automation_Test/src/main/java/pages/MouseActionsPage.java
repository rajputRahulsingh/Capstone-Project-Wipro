package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsPage {

	protected WebDriver driver;

	// Constructor
	public MouseActionsPage(WebDriver driver) {

		this.driver = driver;
	}

	// Hover Locators
	public By pointMeButton = By.xpath("//button[text()='Point Me']");

	public By mobilesOption = By.xpath("//div[@class='dropdown-content']//a[text()='Mobiles']");

	public By laptopsOption = By.xpath("//div[@class='dropdown-content']//a[text()='Laptops']");

	// Double Click Locators
	public By field1 = By.id("field1");

	public By field2 = By.id("field2");

	public By copyTextButton = By.xpath("//button[text()='Copy Text']");

	// Drag Drop Locators
	public By draggable = By.id("draggable");

	public By droppable = By.id("droppable");

	// Slider Locators
	public By minSliderHandle = By.xpath("//div[@id='slider-range']/span[1]");

	public By maxSliderHandle = By.xpath("//div[@id='slider-range']/span[2]");

	public By priceRange = By.id("amount");

	// Hover Action
	public void hoverOnPointMe() {

		Actions actions = new Actions(driver);

		actions.moveToElement(driver.findElement(pointMeButton)).perform();
	}

	// Click Mobiles
	public void clickMobiles() {

		driver.findElement(mobilesOption).click();
	}

	// Drag And Drop
	public void performDragAndDrop() {

		Actions actions = new Actions(driver);

		actions.dragAndDrop(
				driver.findElement(draggable),
				driver.findElement(droppable))
				.perform();
	}

	// Verify Drop
	public String getDroppedText() {

		return driver.findElement(droppable).getText();
	}

	// Double Click
	public void doubleClickCopyButton() {

		Actions actions = new Actions(driver);

		actions.doubleClick(driver.findElement(copyTextButton)).perform();
	}

	// Get Field1 Value
	public String getField1Value() {

		return driver.findElement(field1)
				.getAttribute("value");
	}

	// Get Field2 Value
	public String getField2Value() {

		return driver.findElement(field2)
				.getAttribute("value");
	}

	// Move Slider
	public void moveSlider(int xOffset) {

		WebElement slider = driver.findElement(minSliderHandle);

		Actions actions = new Actions(driver);

		actions.clickAndHold(slider)
				.moveByOffset(xOffset, 0)
				.release()
				.perform();
	}

	// Get Slider Value
	public String getSliderValue() {

		return driver.findElement(priceRange)
				.getAttribute("value");
	}
}