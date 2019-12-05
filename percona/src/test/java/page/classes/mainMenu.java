package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mainMenu {

	public static WebElement element = null;
	
	public static void mainMenuButton (WebDriver driver) {
		element = driver.findElement(By.id("submenu"));
		element.click();
	}
	public static void computersOthersClick (WebDriver driver) {
		element = driver.findElement(By.cssSelector(".color-theme-17.has-child > .gtm-menu-1"));
		element.click();
	}
	public static void laptopsOthersClick (WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body[@class='onea_lt']/div[@class='site']/div[@class='site-inner']/div[@class='senukai-v2']/div[@class='categories']/div//div[@class='filter-block only-desktop']/ul[@class='menu product-categories-menu']//a[@href='https://www.1a.lt/c/kompiuterine-technika-biuro-prekes/nesiojami-kompiuteriai-ir-priedai/2t2']"));
		element.click();	
	}
	public static void laptopsClick (WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body[@class='onea_lt']/div[@class='site']/div[@class='site-inner']/div[@class='senukai-v2']/div[@class='categories']/div//div[@class='filter-block only-desktop']/ul[@class='menu product-categories-menu']//ul[@class='child-category']//a[@href='https://www.1a.lt/c/kompiuterine-technika-biuro-prekes/nesiojami-kompiuteriai-ir-priedai/nesiojami-kompiuteriai/371']"));
		element.click();	
	}
}
