package sauce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		//Login to the site with the credentials provided on the login page of sauce demo website
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		driver.findElement(By.id("login-button")).click();
	driver.manage().window().maximize();
	//Add cases to check input field validations
	//Sort the products in price low to high order
	driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")).click();
	//adding items to cart
	driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
	driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
	driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
	driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
	driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
	driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket")).click();
	Thread.sleep(3000);
	
	//removing items less than 15
	driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("remove-sauce-labs-onesie")).click();
	driver.findElement(By.id("remove-sauce-labs-bike-light")).click();
	Thread.sleep(3000);
	
	//check out items
	driver.findElement(By.id("checkout")).click();
	
	//Entering details
	driver.findElement(By.id("first-name")).sendKeys("Maria");
	driver.findElement(By.id("last-name")).sendKeys("jos");
	driver.findElement(By.name("postalCode")).sendKeys("1234");
	driver.findElement(By.id("continue")).click();
	Thread.sleep(3000);
	
	//finishing the process
	driver.findElement(By.id("finish")).click();
	Thread.sleep(3000);
	
	//return to home page
	driver.findElement(By.name("back-to-products")).click();
	Thread.sleep(3000);
	
	//logout from application
	driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
	}

}
