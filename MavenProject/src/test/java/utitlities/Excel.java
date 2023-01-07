package utitlities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	XSSFSheet sheet;
	FileInputStream file;
	XSSFWorkbook workbook;
	XSSFCell cell;
	
	
	
	public void readexcelfile(String Location) throws IOException {

		 file = new FileInputStream(Location);
		 workbook = new XSSFWorkbook(file);
		 sheet = workbook.getSheet("Sheet1");
	}

	public String getcellvalue(int row,int column) {
		
	    cell = sheet.getRow(row).getCell(column);
		String cellvalue = cell.getStringCellValue();
		return cellvalue;
		
		
	}
}
