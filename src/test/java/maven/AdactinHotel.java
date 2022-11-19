package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinHotel {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		
		WebElement uname = driver.findElement(By.id("username"));
		uname.sendKeys("Ashu");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("Ash@1820");
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
	//	Thread.sleep(3000);
		//driver.quit();
		
		
	}

}
