package com.imi.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public String readpropData(String propPath, String key) throws Throwable {
		FileInputStream fis=new FileInputStream(propPath);
		Properties prop=new Properties();
		prop.load(fis);
		String propValue=prop.getProperty(key, "incorrect key");
		return propValue;
	}
	public void writeexcelData(String excelpath, String sheetname,int row,int cell,String data) throws Throwable  {
		FileInputStream fis=new FileInputStream(excelpath);
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet(sheetname).getRow(row).createCell(cell).setCellValue(data);
		FileOutputStream fos=new FileOutputStream(excelpath);
		wb.write(fos);
	}
    public String readexcelData(String excelpath,String sheetname,int row,int cell) throws Throwable{
	FileInputStream fis=new FileInputStream(excelpath);
	Workbook wb=WorkbookFactory.create(fis);
	String excelvalue=wb.getSheet(sheetname).getRow(row).getCell(cell).toString();
	return excelvalue;
	}
    public int getrowCount(String excelpath,String sheetName) throws Throwable  {
    	FileInputStream fis=new FileInputStream(excelpath);
    	Workbook wb=WorkbookFactory.create(fis);
    	int rowCount=wb.getSheet(sheetName).getLastRowNum();
    	return rowCount;
    	
    	
    }
}
    
    
    
    
    
    