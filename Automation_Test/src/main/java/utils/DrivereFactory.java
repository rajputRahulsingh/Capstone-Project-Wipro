package utils;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrivereFactory {

	static WebDriver driver;

	public static WebDriver initializeBrowser() {

		Properties prop = ConfigReader.initProperties();

		String browser = prop.getProperty("browser");

		String url = prop.getProperty("url");

		if(browser.equals("chrome")) {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();

		driver.get(url);

		return driver;
	}

	public static WebDriver getDriver() {

		return driver;
	}
}