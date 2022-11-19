package maven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Countries {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omrbranch.com/apitestingtraininginchennaiomr");
		
		WebElement clist = driver.findElement(By.id("country-list"));
		clist.click();
		Select drop = new Select(clist);
		List<WebElement> options = drop.getOptions();
		int size = options.size();
		System.out.println(size);

		//mention the  path
		File file = new File("C:\\Users\\manik\\eclipse-workspace\\Maven\\excel sheet\\ashok.xlsx");
		//create workbook
		Workbook workbook = new XSSFWorkbook();
		//create sheet
		Sheet Sheet = workbook.createSheet("test");
		for (int i = 0; i <size; i++) {
			WebElement webElement = options.get(i);
			String text = webElement.getText();
			System.out.println(text);
			Row row = Sheet.createRow(i);
			Cell cell = row.createCell(0);
			cell.setCellValue(text);
			FileOutputStream out = new FileOutputStream(file);
			workbook.write(out);
			
				
				
					
					
				}
				
			}
			
		}
		
		
		
		
		
		
		

	
	
		
	


