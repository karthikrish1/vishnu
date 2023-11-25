package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class e1 {
	
	@Test
	public void t1() throws IOException
	{
		//apache poi, apache poi ooxml, apache poi ooxml schema 
		
		File f= new File("C:\\Users\\hp\\Desktop\\My Contact Form - Copy 2.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook x= new XSSFWorkbook(fis);
		XSSFSheet sheet = x.getSheetAt(0);
		
		// number of rows 
		int row=sheet.getLastRowNum();
		System.out.println("Number of rows "+ row);
		
		// number of columns, about the row index
		//row 0
		int col=sheet.getRow(0).getLastCellNum();
		System.out.println("Number of columns in first row is "+ col);
		
		//5,2
		//read acell=> know the row index and column indez
		XSSFCell data = sheet.getRow(5).getCell(2);
		System.out.println(data);
		
		//35,5
		//write=> closed
		sheet.getRow(35).createCell(5).setCellValue("Vishnu");
		FileOutputStream fos= new FileOutputStream(f);
		x.write(fos);
		
	}

}
