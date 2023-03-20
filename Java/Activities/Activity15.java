package Activities;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Activity15 {
    private static String FileName = "resources/DataSheet.xlsx";

    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Datatypes in Java");
        Object[][] datatypes = {
                {"Datatype", "Type", "Size(in bytes)"},
                {"int", "Primitive", 6},
                {"float", "Primitive", 10},
                {"double", "Primitive", 4},
                {"char", "Primitive", 5},
                {"String", "Non-Primitive", "No fixed size"}
        };

        int rowNm = 0;


        for (Object[] datatype : datatypes) {
            Row row = sheet.createRow(rowNm++);
            int colNm = 0;
            for (Object field : datatype) {
                Cell cell = row.createCell(colNm++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }

        try {
            FileOutputStream outputStream = new FileOutputStream(FileName);
            workbook.write(outputStream);
            workbook.close();
        } catch (FileNotFoundException f){
            f.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Data is written successfully");
    }

}