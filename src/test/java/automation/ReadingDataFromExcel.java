package automation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel --> Workbook --> Sheets --> Rows --> Cells.

public class ReadingDataFromExcel{

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\BookDetails.xlsx");//Excel file.
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);// workbook
		XSSFSheet sheet=workbook.getSheet("Sheet1");// sheet
		
		//finding the total number of row.
		int total_row=sheet.getLastRowNum();
		System.out.println("Total number of row in ExcelSheet :"+total_row);
		
		//finding the total number of cell.
		sheet.getRow(1).getLastCellNum();
		
	}

}
