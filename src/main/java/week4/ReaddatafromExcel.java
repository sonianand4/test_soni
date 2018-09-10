package week4;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReaddatafromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook wBook=new XSSFWorkbook("./data/Book1.xlsx");
		XSSFSheet sheet = wBook.getSheet("Sheet1");
		int lastRowNum = sheet.getLastRowNum();
		short columnCount = sheet.getRow(0).getLastCellNum();
		for(int i=1;i<=lastRowNum;i++)
		{
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<columnCount;j++)
			{
				XSSFCell cell = row.getCell(j);
				String data = cell.getStringCellValue();
				System.out.println(data);
			}
		}
		

	}

}
