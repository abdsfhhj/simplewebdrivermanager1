package AutomationExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader1 {

	

	public static void main(String[] args) throws IOException {
		String excelPath="./TestData/Data.xlsx";
		
		FileInputStream fins = new FileInputStream(excelPath);
		
		XSSFWorkbook  Workbook	= new XSSFWorkbook(fins);
		XSSFSheet sheet = Workbook.getSheet("Data1");//sheet name is "Data"
		
	      //For loop
	    int rows = sheet.getLastRowNum();
	    int cols = sheet.getRow(0).getLastCellNum();
	    
	    System.out.println(rows +" "+ cols);
	    
	    
	    for(int r=0;r<rows;r++)
	    {
	    	XSSFRow row = sheet.getRow(r);
	    	for(int c=0;c<cols;c++)
	    	{
	    		XSSFCell cell = row.getCell(c);
	    		switch(cell.getCellType())
	    		{
	    		case STRING:
	    			System.out.println(cell.getStringCellValue());
	    			break;
	    		case NUMERIC:
	    			System.out.println(cell.getNumericCellValue());
	    			break;
	    		case BOOLEAN:
	    			System.out.println(cell.getBooleanCellValue());
	    			break;
	    		}
	    		System.out.print("     ");
	    	}
	    	System.out.println();
	    
	
	    }    
	     
	}
}


