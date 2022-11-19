package org.pom.addictianhotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import maven.BaseClass;

public class SearchHotelPage extends BaseClass{
	
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement dDnlocation;
	
	@FindBy (id="usershow_show")
	private WebElement textwelcomemsg;
	
	@FindBy(id="hotels")
	private WebElement dndhotel;
	
	@FindBy(id="room_type")
	private WebElement dDnromtype;
	
	@FindBy(id="room_nos")
	private WebElement dDnroomno;
	
	@FindBy(id="datepick_in")
	private WebElement txtcheckindate;
	
	@FindBy(id="datepick_out")
	private WebElement txtcheckoutdate;
	
	@FindBy(id="adult_room")
	private WebElement dDnadultperroom;
	
	@FindBy(id="child_room")
	private WebElement dDnchildperroom;
	
	@FindBy(id="Submit")
	private WebElement btnSearch;

	public WebElement getdDnlocation() {
		return dDnlocation;
	}

	public WebElement getTextwelcomemsg() {
		return textwelcomemsg;
	}

	public WebElement getDndhotel() {
		return dndhotel;
	}

	public WebElement getdDnromtype() {
		return dDnromtype;
	}

	public WebElement getdDnroomno() {
		return dDnroomno;
	}

	public WebElement getTxtcheckindate() {
		return txtcheckindate;
	}

	public WebElement getTxtcheckoutdate() {
		return txtcheckoutdate;
	}

	public WebElement getdDnadultperroom() {
		return dDnadultperroom;
	}

	public WebElement getdDnchildperroom() {
		return dDnchildperroom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
		
	}
	
	public void searchHotelPage(String location,String hotels, String rootype, String roomno, String chechkindate, String checkoutdate,String adultperroom
			, String childperroom) {
		selectByVisibleText(getdDnlocation(), location);
		selectByVisibleText(getDndhotel(), hotels);
		selectByVisibleText(getdDnromtype(), rootype);
		selectByVisibleText(getdDnroomno(), roomno);
		sendKeys(getTxtcheckindate(), chechkindate);
		sendKeys(getTxtcheckoutdate(), checkoutdate);
		selectByVisibleText(getdDnadultperroom(), adultperroom);
		selectByVisibleText(getdDnchildperroom(), childperroom);
		click(getBtnSearch());
	}
	
	
	
	

}
