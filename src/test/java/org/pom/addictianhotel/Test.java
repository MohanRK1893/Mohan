package org.pom.addictianhotel;

import java.io.IOException;

import org.junit.BeforeClass;

import maven.BaseClass;

public class Test extends BaseClass {

	@BeforeClass
	public static void getPage() {
		getDriver();
		getUrl("https://adactinhotelapp.com/");
		maximize();
	}
	@org.junit.Test
	public void test() throws IOException {
		LoginInPage login=new LoginInPage();
		login.Login(getDataFromCell("Sheet1", 1, 0), getDataFromCell("Sheet1", 1, 1));
		
		//Search hotel POM
		SearchHotelPage search=new SearchHotelPage();
		search.searchHotelPage(getDataFromCell("Sheet1", 1, 2), getDataFromCell("Sheet1", 1, 3), getDataFromCell("Sheet1", 1, 4),
				getDataFromCell("Sheet1", 1, 5), getDataFromCell("Sheet1", 1, 6), getDataFromCell("Sheet1", 1, 7),
				getDataFromCell("Sheet1", 1, 8), getDataFromCell("Sheet1", 1, 9));
		
		//Select hotel page
		SelectHotelPage select=new SelectHotelPage();
		select.selectHotelPage();
		
		//Book Hotel Page
		BookHotelPage book=new BookHotelPage();
		book.BookHotelPage(getDataFromCell("Sheet1", 1,0), getDataFromCell("Sheet1", 1, 1), getDataFromCell("Sheet1", 1, 12), 
					   	   getDataFromCell("Sheet1", 1, 13), getDataFromCell("Sheet1", 1, 14), 
		                   getDataFromCell("Sheet1", 1, 15), getDataFromCell("Sheet1", 1, 16), getDataFromCell("Sheet1", 1, 17));
		
		//Book Confirm Page
		
		
		

	}

}
