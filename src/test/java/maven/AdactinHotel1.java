package maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AdactinHotel1 {
	public static void main(String[] args) throws IOException  {
		
		//to mention excel path
		File file =new File("C:\\Users\\manik\\eclipse-workspace\\Maven\\excel sheet\\Adactin.xlsx");
		
		//To get the objects/bytes from file
		FileInputStream stream = new FileInputStream(file);
		
		//To create workbook
		Workbook workbook = new XSSFWorkbook(stream);
		
			
		
	org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet("data");
	
			for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
				Row row = sheet.getRow(i);
				for (int j = 0; j <row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				System.out.println(cell);
		
		//To get the sheet
	//	org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet("Data");
		
		//To get the row
	//	Row row = sheet.getRow(3);
		
		//To get the cell
	//	Cell cell = row.getCell(1);
		////System.out.println(cell);
		
		//To get the number of rows
	//	int count = sheet.getPhysicalNumberOfRows();
	//	System.out.println(count);
		
		//To get the row cell count
		//int count1 = row.getPhysicalNumberOfCells();
	//	System.out.println(count1);
		
		//To get n number of cells
	//	for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
		//Cell cell1 = row.getCell(i);
		//System.out.println(cell1);
		
		//To iterate all rows
	//	for (int j = 0; j < sheet.getPhysicalNumberOfRows(); j++) {
		
		//To get each row
		//Row row2 = sheet.getRow(i);	
		
		//To iterate all cells
	//	for (int k = 0; k < row.getPhysicalNumberOfCells(); k++) {
		
			
		//To get each cell
		//	row.getCell();
		}
		}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
				
			
		
		
		
//		Row row = sheet.getRow(3);
//		
//		Cell cell = row.getCell(2);
//		System.out.println(cell);
//		
//		int count = sheet.getPhysicalNumberOfRows();
//		System.out.println(count);
//		
		
	}

	
	

