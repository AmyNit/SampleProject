package com.orion.whitemartProject.excelReader;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Reader {


	public String path;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	
	
	
	/*
	 * creating constructor
	 */
	
	public Excel_Reader(String path){
		
		this.path=path;
		try{
		
			fis= new FileInputStream(path);
			wb=new XSSFWorkbook(fis);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		}	
	
	
	
	
	public String getCellData(String sheetName,String colName,int rowNum ){
		
		try{
		
		int col_Num = 0;
		int index=wb.getSheetIndex(sheetName); //Get index
		sheet=wb.getSheetAt(index);            //Get sheet
		XSSFRow row=sheet.getRow(0);
		
		for(int i=0;i<row.getLastCellNum();i++){
			
			if(row.getCell(i).getStringCellValue().equals(colName)){
				
				col_Num=i;
				}
		 }
		row=sheet.getRow(rowNum-1);  // it counts header as well. so to avoid we use rowNum-1
		
		XSSFCell cell=row.getCell(col_Num); 
		
		
		if(cell.getCellType()==Cell.CELL_TYPE_STRING){
			
			return cell.getStringCellValue();
		}
		else if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC){
			
			return String.valueOf(cell.getNumericCellValue());
		}
		else if(cell.getCellType()==Cell.CELL_TYPE_BOOLEAN){
			
			return String.valueOf(cell.getBooleanCellValue());
			
		}
		else if(cell.getCellType()==Cell.CELL_TYPE_BLANK){
			
			return"";
		}
		}
		catch(Exception e){
				e.printStackTrace();
			}
		
		return null;
	   }
public String getCellData(String sheetName,int colName,int rowNum ){
		
		try{
		
		int col_Num = 0;
		int index=wb.getSheetIndex(sheetName); 
		sheet=wb.getSheetAt(index);            
		XSSFRow row=sheet.getRow(0);
		
	
		row=sheet.getRow(rowNum-1); // To avoid header
		
		XSSFCell cell=row.getCell(colName);
		
		
		if(cell.getCellType()==Cell.CELL_TYPE_STRING){
			
			return cell.getStringCellValue();
		}
		else if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC){
			
			return String.valueOf(cell.getNumericCellValue());
		}
		else if(cell.getCellType()==Cell.CELL_TYPE_BOOLEAN){
			
			return String.valueOf(cell.getBooleanCellValue());
			
		}
		else if(cell.getCellType()==Cell.CELL_TYPE_BLANK){
			
			return"";
		}
		}
		catch(Exception e){
				e.printStackTrace();
			}
		
		return null;
	   }
	
	
	public int getRowCount(String sheetName){
		
		int index=wb.getSheetIndex(sheetName);
		
		try {
			if(index==-1){ // if sheet is not matching
				
				return 0;
			}
			else{
				
				sheet=wb.getSheetAt(index);
				int no=sheet.getLastRowNum()+1;
				return no;
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return 0;
		
		
	}
	
	
	public int getColCount(String sheetName){
		
		try {
			int index=wb.getSheetIndex(sheetName);
			
			if(index==-1){
				
				return 0;
			}
			else{
				
				sheet=wb.getSheet(sheetName);
				row=sheet.getRow(0);
				return row.getLastCellNum();
			}
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		return 0;
		
		
	}
		
	
	
	
	
	
	
	
	
	
	
public static void main(String[]args ){
	
	String path=System.getProperty("user.dir")+"\\src\\test\\java\\com\\orion\\resources\\testData\\Sheet1.xlsx";
	Excel_Reader obj=new Excel_Reader(path);
     //System.out.println(obj.getCellData("Login", "UserName",4)); // based on column name
	
	//System.out.println(obj.getRowCount("Login")); // total no of rows
	//System.out.println(obj.getColCount("Login")); //total no of columns
	
	System.out.println(obj.getCellData("Login", 2, 3)); // based on index. column name starts from 0
}
	
	}
