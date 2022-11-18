package AutomationExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	

	public static void main(String[] args) throws IOException {
		String excelPath="./TestData/Data.xlsx";
		
		FileInputStream fins = new FileInputStream(excelPath);
		
		XSSFWorkbook  Workbook	= new XSSFWorkbook(fins);
	 //XSSFSheet sheet = Workbook.getSheet("Data");//sheet name is "Data"
		
	         XSSFSheet sheet = Workbook.getSheetAt(0); //index of sheet
	         
	     String  data00=  sheet.getRow(0).getCell(0).getStringCellValue();
	      
	     String  data01=  sheet.getRow(0).getCell(1).getStringCellValue();
	     
	     String  data02=  sheet.getRow(0).getCell(2).getStringCellValue();
	     
	     System.out.println(data00+" "+data01+" "+data02);
	     
	     String  data10=  sheet.getRow(1).getCell(0).getStringCellValue();
	      
	     String  data11=  sheet.getRow(1).getCell(1).getStringCellValue();
	     
	     double  data12=  sheet.getRow(1).getCell(2).getNumericCellValue();
	     
	     System.out.println(data10+" "+data11+" "+data12);
	     Workbook.close();
	     
	}

}
