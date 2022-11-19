package org.exceltask;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.formula.functions.Value;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EXCELGET {

	public static void main(String[] args) throws IOException {
//		File file = new File("C:\\Users\\manik\\eclipse-workspace\\FrameWork\\excel sheet\\excel.xlsx");
//		
//		Workbook workbook = new XSSFWorkbook();
//		Sheet createSheet = workbook.createSheet("sheet1");
//		Row createRow = createSheet.createRow(1);
//		Cell createCell = createRow.createCell(0);
//		createCell.setCellValue("deepak");
//		FileOutputStream output = new FileOutputStream(file);
//		workbook.write(output);
		
		
		
		//get value
//		File file = new File("C:\\Users\\manik\\eclipse-workspace\\FrameWork\\excel sheet\\excel.xlsx");
//		FileInputStream fileInputStream = new FileInputStream(file);
//		Workbook workbook = new XSSFWorkbook(fileInputStream);
//		Sheet sheet = workbook.getSheet("sheet1");
//		Row row = sheet.getRow(1);
//		Cell cell = row.getCell(0);
//		System.out.println(cell);
//		
		
		//update
		File file = new File("C:\\Users\\manik\\eclipse-workspace\\FrameWork\\excel sheet\\excel.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet("sheet1");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String Value = cell.getStringCellValue();
		if (Value.equals("mohan")) {
			cell.setCellValue("ashu");
		}
   		FileOutputStream fileOutputStream = new FileOutputStream(file);
		workbook.write(fileOutputStream);
		
		
		
		
		
		
		
		
	}
}
