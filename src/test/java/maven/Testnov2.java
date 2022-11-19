package maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Testnov2 {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\manik\\eclipse-workspace\\Maven\\excel sheet\\Adactin.xlsx");
		
		FileInputStream stream = new FileInputStream(file);
		
		Workbook workbook = new XSSFWorkbook(stream);
		
		Sheet sheet = workbook.getSheet("data");
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				System.out.println(cellType);
				switch (cellType) {
				case STRING:
					String string = cell.getStringCellValue();
					System.out.println(string);
					
					
					break;
				case NUMERIC:
					if (DateUtil.isCellDateFormatted(cell)) {
						Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat dateformat = new SimpleDateFormat("dd/mm/yyyy");
						String format = dateformat.format(dateCellValue);
						System.out.println(format);
						
					} else {
						double numeric = cell.getNumericCellValue();
						BigDecimal decimal = BigDecimal.valueOf(numeric);
						String string2 = decimal.toString();
						System.out.println(string2);

					}
					
					
					
					
					break;

				default:
					break;
				}
			}
			
		}
	}

}
