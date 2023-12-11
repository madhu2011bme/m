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

public class readAll {
public static void readAllData() throws IOException {
	File x=new File(".\\Excel\\NewData.xlsx");
	FileInputStream fis=new FileInputStream(x);
	Workbook wb=new XSSFWorkbook(fis);
	Sheet sheetAt = wb.getSheetAt(0);
	int NumberOfRows = sheetAt.getPhysicalNumberOfRows();
	for(int i=0;i<NumberOfRows;i++) {
		Row row = sheetAt.getRow(i);
		int NumberOfCells = row.getPhysicalNumberOfCells();
		for(int j=0;j<NumberOfCells;j++) {
			Cell cell = row.getCell(j);
			CellType cellType = cell.getCellType();
			if(cellType.equals(CellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);}
			else if(cellType.equals(CellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int data=(int) numericCellValue;
				System.out.println(data);
			}
		}
		wb.close();
	}	
}
public static void main(String[] args) throws IOException{
	readAllData();

}

}
