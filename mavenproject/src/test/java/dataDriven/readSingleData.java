package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readSingleData {
	private static void readParticularData() throws IOException {
		File a = new File(".\\Excel\\NewData.xlsx");
		FileInputStream fis = new FileInputStream(a);
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheetAt = book.getSheetAt(0);
        Row row = sheetAt.getRow(1);
        Cell cell = row.getCell(2);
        CellType cellType = cell.getCellType();
        if(cellType.equals(CellType.STRING)){
        	String stringCellValue = cell.getStringCellValue();
        	System.out.println(stringCellValue);}
        	else if(cellType.equals(CellType.NUMERIC)){
  double numericCellValue = cell.getNumericCellValue();
        int data=(int) numericCellValue;	
        System.out.println(data);
        	}
        book.close();
        	}
	public static void main(String[] args) throws IOException {
		readParticularData();
	}
	}


