package maven;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junit {
	static WebDriver driver;
	
	@BeforeClass
	public static void beforeclass() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
	}
	
	@AfterClass
	public static void afterclass() {
		driver.quit();
	}
	
	@Test
	public void test() {
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys("sidhu202");
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys("Little*22");
		WebElement btnclick = driver.findElement(By.id("login"));
		btnclick.click();
		
	}
		
	@Before
	public void before() {
			long currentTimeMillis = System.currentTimeMillis();
			System.out.println(currentTimeMillis);
		}
	
	@After
	public void after() {
			long currentTimeMillis = System.currentTimeMillis();
			System.out.println(currentTimeMillis);
			
		}

}
