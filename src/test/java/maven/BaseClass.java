package maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.Table.Cell;
import com.microsoft.schemas.office.visio.x2012.main.CellType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	  
    public static void getDriver() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	}
    public static void getcurrenturl() {
    driver.getCurrentUrl();
    }
	public static void maximize() {
	driver.manage().window().maximize();
	} 
	public static void getUrl(String url) {
	driver.get(url);
	}
	public static String getTitle() {
	String title = driver.getTitle();
	return title;	
	}
	public static WebElement byId(String id) {
	WebElement findElement = driver.findElement(By.id(id));
	return findElement;	
	}
	public static WebElement byXpath(String xpath) {
	WebElement findElement = driver.findElement(By.xpath(xpath));
	return findElement;	
	}
    public static WebElement byName(String name) {
	WebElement findElement = driver.findElement(By.name(name));
    return findElement;	
	}
    public static void sendKeys(WebElement element,String value) {
	element.sendKeys(value);
	}
	public static void click(WebElement element) {
	element.click();
	}
    public static String getAttribute(WebElement element) {
	String attribute = element.getAttribute("value");
	System.out.println(attribute);
	return attribute;
	}
    public static void gettext(WebElement element) {
	String text = element.getText();
	System.out.println(text);
	}
	public static void movetoelement(WebElement element,String xpath) {
	Actions x = new Actions(driver);
	x.moveToElement(element).perform();
	driver.findElement(By.xpath(xpath)).click();
	}
    public static void draganddrop(WebElement source,WebElement destination) {
	Actions x=new Actions(driver);
	x.dragAndDrop(source, destination).perform();
	}
    public static void screenshot(String path) throws Exception {
	TakesScreenshot ts = (TakesScreenshot)driver;
	File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
	File file = new File(path);
	FileUtils.copyFile(screenshotAs, file);
	}
    public void keyboardactions(Keys shift,WebElement element,String input) {
	Actions actions =new Actions(driver);
	actions.keyDown(shift).sendKeys(element,input).keyUp(shift).perform();
	}
	public void doubleclick(WebElement element) {
	Actions actions = new Actions(driver);
	actions.doubleClick(element).perform();
	}
    public void alertaccept() {
	Alert alert = driver.switchTo().alert();
	alert.accept();
	}
    public void alertdismiss() {
	Alert alert = driver.switchTo().alert();
	alert.dismiss();
	}
	public Alert alert(String input) {
	Alert alert = driver.switchTo().alert();
	return alert;
	}
	public void jssetattribute(WebElement element) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('value',’yogesh')", element);
	}
    public void jsgetattribute(WebElement element) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	Object executeScript = js.executeScript("arguments[0].getAttribute('value')", element);
	String string = executeScript.toString();
	System.out.println(string);
	}
	public void jsclick(WebElement element) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()",element);
	}
	public void frameid(String id) {
	driver.switchTo().frame(id);
	}
	public void frameelement(WebElement element) {
	driver.switchTo().frame(element);
	}
    public void frameindex(int index) {
	driver.switchTo().frame(index);
	}
    public void parentframe() {
	driver.switchTo().parentFrame();
	}
    public List<WebElement> noofframes(String id) {
	List<WebElement>list = (List<WebElement>) driver.findElement(By.tagName(id));
	int size = list.size();
	System.out.println(size);
	return list;
	}
    public void childWindow() {
	String parent = driver.getWindowHandle();
	Set<String>both = driver.getWindowHandles();
	for (String x : both) {
	if(!parent.equals(x)) {
	driver.switchTo().window(x);
	}}}
    public void backToParentWindow() {
	String parent = driver.getWindowHandle();
	Set<String>both = driver.getWindowHandles();
	for (String x : both) {
	if(parent.equals(x)) {
	driver.switchTo().window(x);
	}}}
    public void windowhandling(int index) {
	Set<String>windowHandles = driver.getWindowHandles();
	List<String>li = new ArrayList<String>();
	li.addAll(windowHandles);
	String x = li.get(index);
	driver.switchTo().window(x);
	}
    public void navigateTo(String url) {
	driver.navigate().to(url);
	}
    public void navigateBack() {
	driver.navigate().back();
	}
    public void navigateForward() {
	driver.navigate().forward();
	}
    public void navigateRefresh() {
	driver.navigate().refresh();
	}
    public void selectByIndex(WebElement element,int index) {
	Select s = new Select(element);
	s.selectByIndex(index);
	}
    public void selectByValue(WebElement element,String value) {
	Select s = new Select(element);
	s.selectByValue(value);
	}
    public void selectByVisibleText(WebElement element,String text) {
	Select s = new Select(element);
	s.selectByVisibleText(text);
	}
	public void deselectAll(WebElement element) {
	Select s = new Select(element);
	s.deselectAll();
	}

    public void deselectByIndex(WebElement element,int index) {
	Select s = new Select(element);
	s.deselectByIndex(index);
	}
	public void deselectByValue(WebElement element,String value) {
	Select s = new Select(element);
    s.deselectByValue(value);
	}
	public void deselectByVisibleText(WebElement element,String text) {
	Select s = new Select(element);
	s.deselectByVisibleText(text);
	
	}
    public boolean isMultiple (WebElement element) {
	Select s = new Select(element);
	boolean b = s.isMultiple();	
	return b;	
	}
    public void getfirstselectedoption(WebElement element) {
	Select s = new Select(element);
	WebElement firstSelectedOption = s.getFirstSelectedOption();
	System.out.println(firstSelectedOption);
	}
	public void getoptions(WebElement element) {
	Select s = new Select(element);
	List<WebElement>options = s.getOptions();
	for(int i=0;i<options.size();i++) {
	options.get(i);
	}}
	public void jsscrolldown(WebElement element) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeAsyncScript("arguments[0].Scrollintoview(true)",element);
	}
	public void jsscrollup(WebElement element) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeAsyncScript("arguments[0].Scrollintoview(false)",element);
	}
	public void nooftables() {
	List<WebElement>findElements = driver.findElements(By.tagName("table"));
	int size = findElements.size();
	System.out.println(size);
	}
	public void gettextxt(int index) {
	List<WebElement>findElements = driver.findElements(By.tagName("table"));
	WebElement a = findElements.get(index);
	List<WebElement>findElements2 = a.findElements(By.tagName("tr"));
	for (WebElement x : findElements2) {
	String text = x.getText();
	System.out.println(text);
	}}
    public void gettextweb(int index) {
	List<WebElement>e = driver.findElements(By.tagName("table"));
    WebElement ee = e.get(index);
	String text = ee.getText();
	System.out.println(text);
	}
    public void quit() {
	driver.quit();
	}
    public void close() {
	driver.close();
	}
    public  String excelread(String path,String sheet,int i,int j) throws Exception{
	String value = null;
	return value;
    }
    public void getselectedoption(WebElement element) {
	    Select s = new Select(element);
	List<WebElement>options = s.getAllSelectedOptions();
	for (WebElement x : options) {
	String text = x.getText();
	System.out.println(text);	
	}}
	public void implicitywait() {
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	public void fluentwait(int sec,int interval) {
	FluentWait w=new FluentWait(driver).withTimeout(Duration.ofSeconds(sec)).pollingEvery(Duration.ofSeconds(interval)).ignoring(NoSuchElementException.class);
	}
	
	public String getDataFromCell(String sheetName ,int rowNum ,int cellNum )throws IOException  {
		String res= " " ;
		File file =new File("C:\\Users\\manik\\eclipse-workspace\\Maven\\excel sheet\\AdactinOrderid.xlsx");
		FileInputStream fileInputStream = new  FileInputStream(file);
		Workbook workbook= new XSSFWorkbook(fileInputStream);
		Sheet sheet=workbook.getSheet(sheetName);
		Row row=sheet.getRow(rowNum);
		org.apache.poi.ss.usermodel.Cell cell=row.getCell(cellNum);
		org.apache.poi.ss.usermodel.CellType type=cell.getCellType();
		switch (type) {
		case STRING:
			res=cell.getStringCellValue();
		break;
		  case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				java.util.Date dateCellValue=cell.getDateCellValue();
				SimpleDateFormat dateFormat =new SimpleDateFormat("dd/MM/yyyy");
				res=dateFormat.format(dateCellValue);
			}
			else {
				double numericCellValue=cell.getNumericCellValue();
				long check =Math.round(numericCellValue);
				    if (numericCellValue==check) {
					res=String.valueOf(check);
					}}
		default:
			break;
		}
		return res;
	}
	public static void updateDataInCell(String sheetName ,int rowNum ,int cellNum, String oldData, String newData )throws IOException  {
		File file =new File("C:\\Users\\manik\\eclipse-workspace\\Maven\\excel sheet\\AdactinOrderid.xlsx");
		FileInputStream fileInputStream = new  FileInputStream(file);
		Workbook workbook= new XSSFWorkbook(fileInputStream);
		Sheet sheet=workbook.getSheet(sheetName);
		Row row=sheet.getRow(rowNum);
		org.apache.poi.ss.usermodel.Cell cell=row.getCell(cellNum);
		org.apache.poi.ss.usermodel.CellType type=cell.getCellType();
	    String value=cell.getStringCellValue();
	    if (value.equals(oldData)) {
	    	cell.setCellValue(newData);
	    }
	    FileOutputStream out= new FileOutputStream(file);
	    workbook.write(out);
	}
		
	public void insertDataInCell(String sheetName ,int rowNum ,int cellNum, String data )throws IOException  {
		File file =new File("C:\\Users\\manik\\eclipse-workspace\\Maven\\excel sheet\\AdactinOrderid.xlsx");
		FileInputStream fileInputStream = new  FileInputStream(file);
		Workbook workbook= new XSSFWorkbook(fileInputStream);
		Sheet sheet=workbook.getSheet(sheetName);
		Row row=sheet.getRow(rowNum);
		org.apache.poi.ss.usermodel.Cell cell=row.createCell(cellNum);
		cell.setCellValue(data);
		FileOutputStream out= new FileOutputStream(file);
	    workbook.write(out);
	    
		}
    		    
}
	 


