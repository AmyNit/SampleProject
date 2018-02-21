package com.test.automation.UIAutomation1.excelReader;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	
	public String path;
	public FileInputStream fis;
	public XSSFWorkbook wb;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	
	
	
	
	public ExcelReader(String path) {
		
		
		this.path=path;
		
		try {
			fis=new FileInputStream(path);
			wb=new XSSFWorkbook(fis);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	

	public String[][] getDataFromSheet(String sheetname,String ExcelName){
		
		String dataSets[][]=null;
		
		try {
			//get sheet from excel workbook
			XSSFSheet sheet=wb.getSheet(sheetname);
			//count of active rows
			int totalRow=sheet.getLastRowNum()+1;
			//count of active columns
			int totalColumn=sheet.getRow(0).getLastCellNum();
			//create array of rows and columns
			dataSets=new String[totalRow-1][totalColumn];
			//Run for loop and store data in 2D array
			//This for loop will run on rows
			
			for(int i=1;i<totalRow;i++){ // i=1 becoz we want to skip header
				XSSFRow rows=sheet.getRow(i);
			
			//This for loop will run on columns of that row
			for(int j=0;j<totalColumn;j++){
				
				//get cell method will get the cell
				XSSFCell cell=rows.getCell(j);
				
			
				if(cell.getCellType()==Cell.CELL_TYPE_STRING)
					dataSets[i-1][j]=cell.getStringCellValue();
				
				else if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC){
					String cellText=String.valueOf(cell.getNumericCellValue());
				    dataSets[i-1][j]=cellText;
				
				}else
					
					dataSets[i-1][j]=String.valueOf(cell.getBooleanCellValue());
				}
			}
			return dataSets;
		} catch (Exception e) {
	
			e.printStackTrace();
		}
		return null;
	
	} 
	
	@SuppressWarnings("deprecation")
	
	public String getCellData(String sheetName,String colName,int rowNum){
		
		try {
			int col_Num=0;
			int index=wb.getSheetIndex(sheetName);
			sheet=wb.getSheetAt(index);
			XSSFRow row=sheet.getRow(0);
			
			for(int i=0;i<row.getLastCellNum();i++){
				if(row.getCell(i).getStringCellValue().equals(colName)){
					col_Num=i;
					break;
				}
				
				row=sheet.getRow(rowNum-1);
				XSSFCell cell=row.getCell(col_Num);
				
				if(cell.getCellType()==Cell.CELL_TYPE_STRING){
					return cell.getStringCellValue();
				} else if(cell.getCellType()==Cell.CELL_TYPE_BLANK){
					return "";
					}
			}
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	
	
	
	

}
