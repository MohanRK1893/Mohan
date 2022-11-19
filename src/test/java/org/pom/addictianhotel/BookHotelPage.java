package org.pom.addictianhotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import maven.BaseClass;

public class BookHotelPage extends BaseClass {
	
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement txtusername;
	
	@FindBy(id="last_name")
	private WebElement txtlastname;
	
	@FindBy(id="address")
	private WebElement txtaddress;	
		
	@FindBy(id="cc_num")
	private WebElement txtcardnumber ;	
	
	@FindBy(id="cc_type")
	private WebElement dDncardtype ;
	
		
	@FindBy(id="cc_exp_month")
	private WebElement dDnexpmonth;
	
		
	@FindBy(id="cc_exp_year")
	private WebElement dDnexpyear;
	
	@FindBy(id="cc_cvv")
	private WebElement txtcvv;
	
	@FindBy(id="book_now")
	private WebElement  btnbooknow;

	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getTxtlastname() {
		return txtlastname;
	}

	public WebElement getTxtaddress() {
		return txtaddress;
	}

	public WebElement getTxtcardno() {
		return txtcardnumber;
	}

	public WebElement getdDncardtype() {
		return dDncardtype;
	}

	public WebElement getdDnexpmonth() {
		return dDnexpmonth;
	}

	public WebElement getdDnexpyear() {
		return dDnexpyear;
	}

	public WebElement getTxtcvv() {
		return txtcvv;
	}

	public WebElement getBtnbooknow() {
		return btnbooknow;
	}
	
	public void BookHotelPage(String firstname, String lastname, String address, String cardno,
			String cardtype, String expmonth, String expyear, String cvv) {
		sendKeys(getTxtusername(), firstname);
		sendKeys(getTxtlastname(), lastname);
		sendKeys(getTxtaddress(), address);
		sendKeys(getTxtcardno(), cardno);
		sendKeys(getdDncardtype(), cardtype);
		sendKeys(getdDnexpmonth(), expmonth);
		sendKeys(getdDnexpyear(), expyear);
		sendKeys(getTxtcvv(), cvv);
		click(getBtnbooknow());
	}

	

	
	
	
	
	
	

}
