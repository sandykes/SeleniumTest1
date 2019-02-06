package seleniumPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelPractice {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("C:\\Users\\surya\\Desktop\\test1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet s= wb.getSheet("sandy1");
		String value=s.getRow(2).getCell(1).getStringCellValue();
		System.out.println(value);
		
	}

}
