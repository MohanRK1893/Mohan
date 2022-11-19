package maven;

import java.io.IOException;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Nov9Task extends BaseClass {
	@BeforeClass
	public static void beforeclass() {
		getDriver();
		getUrl("https://adactinhotelapp.com/");
		maximize();
		

	}
@Test
public void test() throws IOException, InterruptedException {
	WebElement username = byId("username");
	
	String dataFromCell = getDataFromCell("Sheet1", 1, 0);
	
	sendKeys(username, dataFromCell);
	
	WebElement pass = byId("password");
	String dataFromCell2 = getDataFromCell("Sheet1", 1, 1);
	sendKeys(pass, dataFromCell2);
	
	WebElement login = byId("login");
	click(login);
	WebElement textloginsuccess = byId("username_show");
	String actloginsuccessmsg = getAttribute(textloginsuccess);
	Assert.assertEquals("verify after login", "Hello sidhu202!", actloginsuccessmsg);
	
	
	WebElement byXpath = byXpath("//select[@id='location']");
	String dataFromCell3 = getDataFromCell("Sheet1", 1, 2);
	sendKeys(byXpath, dataFromCell3);
	
	WebElement hotel = byId("hotels");
	String dataFromCell4 = getDataFromCell("Sheet1", 1, 3);
	sendKeys(hotel, dataFromCell4);
	
	
	
	WebElement type =byId("room_type");
	String dataFromCell5 = getDataFromCell("Sheet1", 1, 4);
	sendKeys(type, dataFromCell5);
	
	WebElement Nos = byId("room_nos");
	String dataFromCell6 = getDataFromCell("Sheet1", 1, 5);
	sendKeys(Nos, dataFromCell6);
	
	
	WebElement chkindate = byId("datepick_in");
	String dataFromCell7 = getDataFromCell("Sheet1", 1, 6);
	sendKeys(chkindate, dataFromCell7);
	
	WebElement chkoutdate = byId("datepick_out");
	String dataFromCell8 = getDataFromCell("Sheet1", 1, 7);
	sendKeys(chkoutdate, dataFromCell8);
	
	WebElement adultroom = byId("adult_room");	
	String dataFromCell9 = getDataFromCell("Sheet1", 1,8 );
	sendKeys(adultroom, dataFromCell9);
	
	WebElement children = byId("child_room");
	String dataFromCell10 = getDataFromCell("Sheet1", 1, 9);
	sendKeys(children, dataFromCell10);
	
	WebElement clk = byId("Submit");
	click(clk);
	WebElement texthotelsuccess = byId("hotel_name_0");
	String acthotelsuccessmsg = getAttribute(texthotelsuccess);
	Assert.assertEquals("verify hotel name", "Hotel Creek", acthotelsuccessmsg);
	
	WebElement radiobtn = byXpath("//input[@id='radiobutton_0']");
	click(radiobtn);
	
	WebElement cnt = byId("continue");
	click(cnt);
	String currentUrl = driver.getCurrentUrl();
	boolean contains = currentUrl.contains("BookHotel");
	System.out.println(contains);
	
	Assert.assertTrue("verify bk a hotel ", contains);
	
	WebElement FN = byId("first_name");
	String dataFromCell11 = getDataFromCell("Sheet1", 1, 10);
	sendKeys(FN, dataFromCell11);
	
	WebElement LN = byId("last_name");
	String dataFromCell12 = getDataFromCell("Sheet1", 1, 11);
	sendKeys(LN, dataFromCell12);
	
	WebElement billingadd = byId("address");
	String dataFromCell13 = getDataFromCell("Sheet1", 1, 12);
	sendKeys(billingadd, dataFromCell13);
	
	WebElement cre = byId("cc_num");
	String dataFromCell14 = getDataFromCell("Sheet1", 1, 13);
	sendKeys(cre, dataFromCell14);
	
	WebElement cctype = byId("cc_type");
	String dataFromCell15 = getDataFromCell("Sheet1", 1, 14);
	sendKeys(cctype, dataFromCell15);
	
	WebElement ccexp = byId("cc_exp_month");
	String dataFromCell16 = getDataFromCell("Sheet1", 1, 15);
	sendKeys(ccexp, dataFromCell16);
	
	WebElement ccexpyr = byId("cc_exp_year");
	String dataFromCell17 = getDataFromCell("Sheet1", 1, 16);
	sendKeys(ccexpyr, dataFromCell17);
	
	WebElement ccv = byId("cc_cvv");
	String dataFromCell18 = getDataFromCell("Sheet1", 1, 17);
	sendKeys(ccv, dataFromCell18);
	
	WebElement book = byId("book_now");
	click(book);
	Thread.sleep(10000);
	String currentUrl1 = driver.getCurrentUrl();
	boolean contains1 = currentUrl1.contains("BookingConfirm");
	System.out.println(contains1);
	
	Assert.assertTrue("verify boking", contains1);
	
	Thread.sleep(5000);
	WebElement od =byName("order_no");
	String attribute = getAttribute(od);
	System.out.println(attribute);
	
	
	
	insertDataInCell("Sheet1", 1, 18, attribute);

}

}
