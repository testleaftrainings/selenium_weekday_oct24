package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelIntegration {

	public  static String[][] readExcel(String excelFileName) throws IOException {
		
		//open the workbook and mention the file path
				XSSFWorkbook wb=new XSSFWorkbook("./data/"+excelFileName+".xlsx");
				//enter into thespecific sheet by sheetname/index
				//wb.getSheet("sheet1");
				XSSFSheet sheetAt = wb.getSheetAt(0);
				//enter into a specific row
				XSSFRow row = sheetAt.getRow(1);
				//to enter into a specific cell of arow
				XSSFCell cell = row.getCell(1);
				//if i want to retreive the value
				String singledata= cell.getStringCellValue();
				System.out.println(singledata);
				
				//to find the row count
				int rowCount= sheetAt.getLastRowNum();
				System.out.println("row count is:"+rowCount);
				////columnCount
				int columnCount = sheetAt.getRow(0).getLastCellNum();
				System.out.println("colcount is:"+columnCount);
				String[][] data=new String[rowCount][columnCount];
				//iteration
				for (int i = 1; i <=rowCount; i++) {
					XSSFRow row2 = sheetAt.getRow(i);
					
					for (int j = 0; j < columnCount; j++) {
						XSSFCell cell2 = row2.getCell(j);
						String readData = cell2.getStringCellValue();
						data[i-1][j]=readData;
					}
					
				}
				wb.close();
				return data;
				
			}
	}


