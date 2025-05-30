package ddt;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {

    public static Object[][] getExcelData(String filePath, String sheetName) throws IOException {
        FileInputStream file = new FileInputStream(new File(filePath));
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheet(sheetName);

        int rows = sheet.getPhysicalNumberOfRows();
        int columns = sheet.getRow(0).getPhysicalNumberOfCells();

        Object[][] data = new Object[rows - 1][columns]; // excluding header

        for (int i = 1; i < rows; i++) { // Start from 1 to skip header
            Row row = sheet.getRow(i);
            for (int j = 0; j < columns; j++) {
                data[i - 1][j] = row.getCell(j).toString();
            }
        }

        workbook.close();
        return data;
    }
}
