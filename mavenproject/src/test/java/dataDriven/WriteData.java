package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {
	private static void writeData() throws IOException {
		File f=new File("C:\\Users\\WELCOME\\Documents\\NewData.xlsx");
		FileInputStream fis= new FileInputStream(f);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		
        wb.createSheet("Employee Detail").createRow(0).createCell(0).setCellValue("Name");
        wb.getSheet("Employee Detail").getRow(0).createCell(1).setCellValue("Password");
        wb.getSheet("Employee Detail").createRow(1).createCell(0).setCellValue("Madhubala");
        wb.getSheet("Employee Detail").getRow(1).createCell(1).setCellValue("madhu@123");
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		System.exit(0);
		System.out.println("Done");
		wb.close();
	}

	public static void main(String[] args) throws IOException {
		writeData();
		
	}
}
