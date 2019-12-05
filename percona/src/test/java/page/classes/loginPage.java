package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {

	public static WebElement element = null;
	
	public static WebElement computers (WebDriver driver) {
		element = driver.findElement(By.className("color-theme-22 has-child"));
		return element;
	}
	public static void logInClick (WebDriver driver) {
		element = driver.findElement(By.className("title"));
		element.click();
	}
	
	public static WebElement emailTextBox (WebDriver driver) {
		element = driver.findElement(By.id("user_email"));
		return element;
	}
	public static void typeEmailTextBox (WebDriver driver, String origin) {
		element = emailTextBox(driver);
		element.sendKeys(origin);
	}
	public static WebElement passwordTextBox (WebDriver driver) {
		element = driver.findElement(By.id("user_password"));
		return element;
	}
	public static void typePassTextBox (WebDriver driver, String origin) {
		element = passwordTextBox(driver);
		element.sendKeys(origin);
	}
	
	public static void logInConfirm (WebDriver driver) {
		element = driver.findElement(By.cssSelector(".button-full-width.button-size-lg.main-button"));
		element.click();
	}
	
}
