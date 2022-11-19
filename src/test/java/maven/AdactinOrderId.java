package maven;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class AdactinOrderId extends BaseClass{
	public static void main(String[] args) throws IOException, InterruptedException {
		AdactinOrderId employee = new AdactinOrderId();
		employee.booking();
		}
		
		public void booking() throws IOException, InterruptedException {
			//WebDriverManager.chromeDriver().setup();
			//WebDriver driver = new chromeDriver();
			getDriver();
			
			//driver.get("https://adactinhotelapp.com/");
			getUrl("https://adactinhotelapp.com/");
			
			//driver.manage().window.maximize();
			maximize();
			
			WebElement txtUsername = byId("username");
			
			String username = getDataFromCell("Sheet1", 1, 0);
			
			//txtUserName.sendKeys("Greens");
			sendKeys(txtUsername, username);
			
			//WebElement txtPassword = driver.findElement(By.id("password");
			WebElement txtpass = byId("password");
					
			String pass = getDataFromCell("Sheet1", 1, 1);
					
			//txtPassword.sends('Hello@234567);
			sendKeys(txtpass, pass);
					
			//WebElement btnLogin = driver.findElement (By.id("login"));
			WebElement btnLogin = byId("login");
					
			//btnlogin.click();
			click(btnLogin);		
			
			WebElement txtLocation = byId("location");
			String location = getDataFromCell("Sheet1", 1, 2);
			selectByVisibleText(txtLocation, location);
			
			WebElement txtHotels = byId("hotels");
			String hotels = getDataFromCell("Sheet1", 1, 3);
			selectByVisibleText(txtHotels, hotels);
			
			WebElement txtRoomtype = byId("room_type");
			String roomtype = getDataFromCell("Sheet1", 1, 4);
			selectByVisibleText(txtRoomtype, roomtype);
			
			WebElement txtRoomno = byId("room_nos");
			String roomno = getDataFromCell("Sheet1", 1, 5);
			selectByVisibleText(txtRoomno, roomno);
			
			WebElement inDate = byName("datepick_in");
			String datein = getDataFromCell("Sheet1", 1, 6);
			sendKeys(inDate, datein);
			
			WebElement outDate = byName("datepick_out");
			String dateout = getDataFromCell("Sheet1", 1, 7);
			sendKeys(outDate, dateout);
			
			WebElement txtadRoom = byId("adult_room");
			String adroom = getDataFromCell("Sheet1", 1, 8);
			selectByVisibleText(txtadRoom, adroom);
			
			WebElement txtchRoom = byId("child_room");
			String chroom = getDataFromCell("Sheet1", 1, 9);
			selectByVisibleText(txtchRoom, chroom);
			
			WebElement btnSubmit = byId("Submit");
			click(btnSubmit);
			
			WebElement select = byId("radiobutton_0");
			click(select);
			
			WebElement btncont = byId("continue");
			click(btncont);
			
			WebElement txtfstname = byId("first_name");
			String fstname = getDataFromCell("Sheet1", 1, 10);
			sendKeys(txtfstname, fstname);
			
			WebElement txtlstname = byId("last_name");
			String lstname = getDataFromCell("Sheet1", 1, 11);
			sendKeys(txtlstname, lstname);
			
			WebElement txtadd = byId("address");
			String address = getDataFromCell("Sheet1", 1, 12);
			sendKeys(txtadd, address);
			
			WebElement txtcum = byId("cc_num");
			String ccum = getDataFromCell("Sheet1", 1, 13);
			sendKeys(txtcum, ccum);
			
			WebElement txtcctyp = byId("cc_type");
			String cctype = getDataFromCell("Sheet1", 1, 14);
			sendKeys(txtcctyp, cctype);
			
			WebElement txtexpmonth = byId("cc_exp_month");
			String expmonth = getDataFromCell("Sheet1", 1, 15);
			selectByVisibleText(txtexpmonth, expmonth);
			
			WebElement textexpyear = byId("cc_exp_year");
			String expyear = getDataFromCell("Sheet1", 1, 16);
			selectByVisibleText(textexpyear, expyear);
			
			WebElement txtcvv = byId("cc_cvv");
			String cvv = getDataFromCell("Sheet1", 1, 17);
			sendKeys(txtcvv, cvv);
			
			
			WebElement btnbook = byId("book_now");
			click(btnbook);
			
			
			implicitywait();
			Thread.sleep(5000);
			
			WebElement txtodno = byId("order_no");
			String odno = getAttribute(txtodno);
			//String odid = getText(txtodno)
			System.out.println(odno);
			
			insertDataInCell("Sheet1", 1, 18, odno);
			
		}


}
