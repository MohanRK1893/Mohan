package org.pom.addictianhotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import maven.BaseClass;

public class SelectHotelPage  extends BaseClass{
	
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Assertion-To check whether the given value is present
	@FindBy(id="hotel_name_0")
	private WebElement txthotelname;
	
	@FindBy(id="radiobutton_0")
	private WebElement radbtn;
	
	
	@FindBy(id="continue")
	private WebElement btnclick;


	public WebElement getTxthotelname() {
		return txthotelname;
	}

	
	public WebElement getRadbtn() {
		return radbtn;
	}


	public WebElement getBtnclick() {
		return btnclick;
	}
	
	public void selectHotelPage() {
		click(getRadbtn());
		click(getBtnclick());
		
		

	}
	

}
