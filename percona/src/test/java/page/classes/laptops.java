package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class laptops {
	
	
	public static WebDriver driver;
	public static WebElement element = null;
	
	
	public static WebElement lowPrice (WebDriver driver) {
		element = driver.findElement(By.id("attr-from-price"));
		return element;
	}
	
	public static void lowPriceType (WebDriver driver, String origin) {
		element = lowPrice(driver);
		element.sendKeys(origin);
	}
	public static void clearTheText (WebDriver driver) {
		element  = driver.findElement(By.id("attr-from-price"));
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
		element.sendKeys(Keys.BACK_SPACE);
		//simple selenium comands like .clear or .delete weren't working in this situations
	}
	public static void brandClick (WebDriver driver) {
		element = driver.findElement(By.cssSelector(".list-filter-blocks-scroll .list-filterable:nth-child(6) .filter-title"));
		element.click();
	}
	public static void acerCheckbox (WebDriver driver) {
		element = driver.findElement(By.cssSelector("[data-value='1vf'] .list-filterable__label"));
		element.click();
	}
	public static void brandChoice (WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body[@class='onea_lt']/div[@class='site']/div[@class='site-inner']/div//div[@class='list-filter-blocks-scroll']/div/div[@class='filter-title']"));
		element.click();
	}
	public static void laptopChoice (WebDriver driver) {
		element = driver.findElement(By.className("new-product-item"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		WebElement click = driver.findElement(By.xpath(".//div/button[@class='add-to-cart-catalog-btn button-size-ms main-button']"));
		action.moveToElement(click).click().perform();
	}
	public static void addToTheCart (WebDriver driver) {
		
		WebElement addToCart = driver.findElement(By.cssSelector("#add-to-cart .main-button"));
		addToCart.click();
	}
	public static void checkTheCart (WebDriver driver) {
		element = driver.findElement(By.cssSelector(".bottom-button-wrap > form[method='post'] > input[name='commit']"));
		element.click();
	}
	public static void checkOutClick (WebDriver driver) {
		element = driver.findElement(By.cssSelector(".bottom-button-wrap > form[method='post'] > input[name='commit']"));
		element.click();
	}
	public static void deleteProduct (WebDriver driver) {
		element = driver.findElement(By.cssSelector("[href='\\/cart_items\\/183852'] span"));
		element.click();
	}
}
