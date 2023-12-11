package dataDriven;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateSheet {
	private static void createSheet() throws IOException {
		File f=new File("E:\\Output\\output.xlsx");
		Workbook wb= new XSSFWorkbook();
		wb.createSheet("Detail").createRow(0).createCell(0).setCellValue("Name");
		wb.getSheet("Detail").getRow(0).createCell(1).setCellValue("Password");
		wb.getSheet("Detail").createRow(1).createCell(0).setCellValue("Madhu");
		wb.getSheet("Detail").getRow(1).createCell(1).setCellValue("@1234");
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		System.out.println("Output Done");
		wb.close();
	}
	public static void main(String[] args) throws IOException {
		createSheet();
	}

}
