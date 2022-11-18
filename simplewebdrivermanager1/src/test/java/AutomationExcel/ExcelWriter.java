package AutomationExcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {

	public static void main(String[] args) throws IOException {
		String excelPath="./TestData/DemoTest.xlsx";//new excel file created in DemoTest
		
		FileInputStream fins = new FileInputStream(excelPath);
		XSSFWorkbook  Workbook	= new XSSFWorkbook(fins);
		XSSFSheet sheet = Workbook.getSheet("Sheet1");
		
		sheet.getRow(0).createCell(1).setCellValue("Status");//any type accept
		sheet.getRow(1).createCell(1).setCellValue("Pass");
		
		sheet.getRow(0).createCell(2).setCellValue(234);
		sheet.getRow(1).createCell(2).setCellValue(23.50);
		
		sheet.getRow(0).createCell(3).setCellValue(true);
		sheet.getRow(1).createCell(3).setCellValue(false);
		
		
		
		
		
		  FileOutputStream fout = new FileOutputStream(excelPath);
		  
		  Workbook.write(fout);
		  Workbook.close();
		  System.out.println("Write Sucessfully");
		  
		

	}

}
