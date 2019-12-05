package page.classes;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.classes.loginPage;
import page.classes.mainMenu;
import page.classes.laptops;


public class PageObjectModel {
	
	private WebDriver driver;
	private String baseUrl;
	private JavascriptExecutor js;

	@Before
	public void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/Vitalij/Documents/workspace/selenium-java-3/chromedriver");
		driver=new ChromeDriver();
		js = (JavascriptExecutor) driver;
		baseUrl = "https://www.1a.lt/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws Exception {
		js.executeScript("window.location = 'https://www.1a.lt/users/sign_in'");
		driver.get(baseUrl);
		
		loginPage.logInClick(driver);
		loginPage.typeEmailTextBox(driver, "vitalkac@gmail.com");
		js.executeScript("window.scrollBy(0, 600);");
		Thread.sleep(3000);
		loginPage.typePassTextBox(driver, "Sonicsx24!");
		loginPage.logInConfirm(driver);
		mainMenu.mainMenuButton(driver);
		mainMenu.computersOthersClick(driver);
		mainMenu.laptopsOthersClick(driver);
		mainMenu.laptopsClick(driver);
		js.executeScript("window.scrollBy(0, 600);");
		Thread.sleep(3000);
		laptops.clearTheText(driver);
		laptops.lowPriceType(driver, "3500");
		laptops.lowPrice(driver).sendKeys(Keys.ENTER);
		laptops.brandClick(driver);
		Thread.sleep(3000);
		laptops.acerCheckbox(driver);
		Thread.sleep(3000);
		laptops.laptopChoice(driver);
		laptops.addToTheCart(driver);
		laptops.checkTheCart(driver);
		laptops.checkOutClick(driver);
		driver.navigate().back();
		laptops.deleteProduct(driver);
		Thread.sleep(2000);
	}
		
	@After
	public void tearDownAfterClass() throws Exception {
		Thread.sleep(3000);
		driver.close();
	}

	

}
