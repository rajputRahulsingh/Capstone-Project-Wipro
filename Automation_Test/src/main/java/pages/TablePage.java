package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TablePage {

	protected WebDriver driver;

	// Constructor
	public TablePage(WebDriver driver) {

		this.driver = driver;
	}

	// =========================
	// STATIC WEB TABLE
	// =========================

	public By staticTableRows = By.xpath("//table[@name='BookTable']//tr");

	// Get Total Rows
	public int getStaticTableRowCount() {

		List<WebElement> rows = driver.findElements(staticTableRows);

		return rows.size();
	}

	// Get Book Name
	public String getBookName(int rowNumber) {

		return driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + rowNumber + "]/td[1]"))
				.getText();
	}

	// Get Author Name
	public String getAuthorName(int rowNumber) {

		return driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + rowNumber + "]/td[2]"))
				.getText();
	}

	// Get Price
	public String getBookPrice(int rowNumber) {

		return driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + rowNumber + "]/td[4]"))
				.getText();
	}

	// =========================
	// DYNAMIC WEB TABLE
	// =========================

	// Get CPU Usage
	public String getCPUUsage() {

		return driver.findElement(By.xpath("//p[contains(text(),'CPU load')]"))
				.getText();
	}

	// Get Memory Size
	public String getMemorySize() {

		return driver.findElement(By.xpath("//p[contains(text(),'Memory Size')]"))
				.getText();
	}

	// =========================
	// PAGINATION TABLE
	// =========================

	// Select Product Checkbox
	public void selectProductCheckbox(int rowNumber) {

		driver.findElement(By.xpath("//table[@id='productTable']//tr[" + rowNumber + "]/td[4]/input"))
				.click();
	}

	// Get Product Name
	public String getProductName(int rowNumber) {

		return driver.findElement(By.xpath("//table[@id='productTable']//tr[" + rowNumber + "]/td[2]"))
				.getText();
	}

	// Click Pagination Number
	public void clickPaginationNumber(String pageNumber) {

		driver.findElement(By.xpath("//a[text()='" + pageNumber + "']")).click();
	}
}