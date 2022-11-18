package AutomationExcel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlsxWriter {

	public static void main(String[] args) throws IOException {
	    
		XSSFWorkbook workbook = new XSSFWorkbook();
		          XSSFSheet sheet = workbook.createSheet("Sheet1");
		          
		       Object   empDate[][]= {{"Emp Name","Emp Id","Desiganation"},
		    		   					{"Raman",123,"Test Engineer"},
		    		   					{"Nikhil",234,"UI Developer"},
		    		   					{"Ankit",421,"java Developer"}
		    		   					};
		      int Rows = empDate.length;
		       int cols = empDate[0].length;
		       System.out.println("Total no of Rows"+Rows);//find rows
		       System.out.println("Total no of cols"+cols);//find cols
		       
		       for(int r=0;r<Rows;r++)
		       {
		    	  XSSFRow row = sheet.createRow(r);
		    	  for(int c=0;c<cols;c++)
		    	  {
		    		XSSFCell cell = row.createCell(c);  
		    	Object value = empDate[r][c];
		    	if(value instanceof String)
		    	{
		    	   cell.setCellValue((String)value);
		    	}
		    	 else if(value instanceof Integer)
		    	   {
		    	    	 cell.setCellValue((Integer)value);
		    	   }
		    	  else if(value instanceof Boolean)
		    	    {
		    	    	 cell.setCellValue((Boolean)value);
		    	    }
		    	
		    	
		    	  }
		       }
		    FileOutputStream fout = new FileOutputStream("./TestData/EmpDetails.xlsx");
		    workbook.write(fout);
		    
		   System.out.println("Emp Details.xlsx file written succesfully!!!! ");
		   fout.close();
		   
		   
			}

		}
