package frameworkdesigney.utilites;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider 

{
	XSSFWorkbook book;
	
	public ExcelDataProvider() throws FileNotFoundException 
	{
		
		
		File src=new File("./Config/TestData.xlsx");
		FileInputStream fis=new FileInputStream(src);
		 try {
			book=new XSSFWorkbook(fis);
		} catch (IOException e) 
		 
		 {
			System.out.println("Unable to read Excel File"+e.getMessage());
		}
	}

	
	public String  getStringData(int sheetIndex,int row,int col)
        {
		return book.getSheetAt(sheetIndex).getRow(row).getCell(col).getStringCellValue();
	   }
	
	/*public double getIntegerData(String sheetname,int row,int col)
	{
		return book.getSheet(sheetname).getRow(0).getCell(0).getNumericCellValue();
	}
	*/
}
