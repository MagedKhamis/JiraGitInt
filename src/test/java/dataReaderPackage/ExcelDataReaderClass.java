package dataReaderPackage;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelDataReaderClass {


    public Object excelConnection() throws IOException {
        FileInputStream obj = new FileInputStream("C:\\Users\\maged\\IdeaProjects\\frameworkMentPrep\\src\\test\\externalData\\myExcelData.xlsx");

        XSSFWorkbook book = new XSSFWorkbook(obj);

        XSSFSheet sheet= book.getSheet("login");

        int rowCount = sheet.getPhysicalNumberOfRows();
        System.out.println(rowCount);

        int columnCount = sheet.getRow(0).getPhysicalNumberOfCells();
        System.out.println(columnCount);

        Object[][] data = new Object[rowCount][columnCount];

        for(int i=0 ; i < rowCount ; i++){
            System.out.println("we are in row "+ i);
            XSSFRow row = sheet.getRow(i);
            for(int j = 0 ; j<columnCount ; j++)
                sheet.getRow(i).getCell(j).getStringCellValue();
        }
        return data;
    }

    public static void main(String[] args) throws IOException {
        ExcelDataReaderClass obj = new ExcelDataReaderClass();
        obj.excelConnection();
    }
}
