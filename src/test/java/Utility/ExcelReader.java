package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	static File file;
	static FileInputStream fis;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public ExcelReader(String filePath, int indexNumberOfSheet) throws IOException {
		file = new File(filePath);
		fis = new FileInputStream(file);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(indexNumberOfSheet);
	}

	public Object[][] getDataFromExcelFile() {
		// here row count starts from 0 hence we have added it with +1
		int rowCount = sheet.getLastRowNum() + 1;
		System.out.println(rowCount);

		// here by sheet we are going to first row and then getting the last cell count
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println(columnCount);

		Object[][] excelData = new Object[rowCount][columnCount];

		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < columnCount; j++) {
				excelData[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return excelData;
	}

	public static void main(String[] args) throws IOException {
		File file = new File("./src\\test\\resources\\ExcelFiles\\Test.xlsx");
		FileInputStream fis = new FileInputStream(file);
		// here we are telling that the external file is of xlsx
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// here we are getting sheet number or sheet name of the excel file
		XSSFSheet sheet = workbook.getSheetAt(0);
		// here row count starts from 0 hence we have added it with +1
		int rowCount = sheet.getLastRowNum() + 1;
		System.out.println(rowCount);

		// here by sheet we are going to first row and then getting the last cell count
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println(columnCount);

		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < columnCount; j++) {
				System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() + " ");
			}
			System.out.println();
		}
	}
}
