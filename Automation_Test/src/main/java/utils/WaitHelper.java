package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {

	// Thread Wait
	public static void pause(int seconds) {

		try {

			Thread.sleep(seconds * 1000);

		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	// Wait For Element Visible
	public static WebElement waitForElementVisible(WebDriver driver,By locator,int seconds) {

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(seconds));

		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	// Wait For Element Clickable
	public static WebElement waitForElementClickable(WebDriver driver,By locator,int seconds) {

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(seconds));

		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	// Wait For Title
	public static boolean waitForTitleContains(WebDriver driver,String title,int seconds) {

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(seconds));

		return wait.until(ExpectedConditions.titleContains(title));
	}

	// Wait For URL
	public static boolean waitForUrlContains(WebDriver driver,String url,int seconds) {

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(seconds));

		return wait.until(ExpectedConditions.urlContains(url));
	}
}