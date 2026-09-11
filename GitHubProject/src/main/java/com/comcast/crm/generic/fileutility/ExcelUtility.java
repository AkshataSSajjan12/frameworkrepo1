package com.comcast.crm.generic.fileutility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String toReadDataFromExcelFile(String sheet, int row, int cell) throws EncryptedDocumentException, IOException
	{
        FileInputStream fi = new FileInputStream("./testdata/Testcases.xlsx");
		
        Workbook wb = WorkbookFactory.create(fi);
        String data = wb.getSheet(sheet).getRow(row).getCell(cell).toString();
        wb.close();
        return data;
        
	}
	
	public int toGetRowCount(String sheet) throws Throwable, IOException
	{
        FileInputStream fi = new FileInputStream("./testdata/Testcases.xlsx");
		Workbook wb = WorkbookFactory.create(fi);
        int rowcount = wb.getSheet(sheet).getLastRowNum();
        return rowcount;
          
	}
	
	public void toSetDataToExcel(String sheet, int row, int cell, String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fi = new FileInputStream("./testdata/Testcases.xlsx");
		Workbook wb = WorkbookFactory.create(fi);
	    wb.getSheet(sheet).getRow(row).getCell(cell).setCellValue(data);
		
		FileOutputStream fileo = new FileOutputStream("./testdata/Testcases.xlsx");
		wb.write(fileo);
		wb.close();
	}
	

}
