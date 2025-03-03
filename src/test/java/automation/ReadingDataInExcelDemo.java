package automation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataInExcelDemo {

	public static void main(String[] args) throws IOException 
	{
        FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\BookDetails.xlsx");//Excel file.
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);// workbook
		XSSFSheet sheet=workbook.getSheet("Sheet1");// sheet
		
		//finding the total number of row.
		int total_row=sheet.getLastRowNum();
		System.out.println("Total number of row in ExcelSheet :"+total_row);
		
		//finding the total number of cell.
		int total_cell=sheet.getRow(1).getLastCellNum();
		System.out.println("Total number of cell in ExcelSheet :"+total_row);
		
		for(int r=0;r<=total_row;r++) 
		{
			XSSFRow curr_row=sheet.getRow(r);
			for(int c=0;c<total_cell;c++) 
			{
				XSSFCell curr_cell=curr_row.getCell(c);
				System.out.print(curr_cell.toString());
				
			}
			System.out.println();
		}
		workbook.close();// to clear the memory.
	}

}
