package org.pom.addictianhotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import maven.BaseClass;

public class BookConfirmPage extends BaseClass {

	public BookConfirmPage() {
		PageFactory.initElements(driver, this);
	}
    @FindBy(id="Order_no")
    private WebElement txtorderno;
    
   
    
    
    
    
    
    
    
    


}
