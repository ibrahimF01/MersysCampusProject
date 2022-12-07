package Utilities;

import io.cucumber.java.Scenario;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ExcelUtility {
    //  kendisine verilen path deki excelin, istenilen, sheetindeki
    // istenilen kolona kadar sütunları okuyup Arraylist formatında geri döndüren fonksiyonu yazınız.
    //  getListData("src/test/java/ApachePOI/resources/ApacheExcel2.xlsx","testCitizen", 2); 0-2

   public static ArrayList<ArrayList<String>> getListData(String path,String sheetName,int columnCount){
        ArrayList<ArrayList<String>> tablo=new ArrayList<>();
        Workbook workbook=null;
        try {
            FileInputStream inputStream=new FileInputStream(path);
            workbook= WorkbookFactory.create(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Sheet sayfa=workbook.getSheet(sheetName);
        for (int i = 0; i < sayfa.getPhysicalNumberOfRows(); i++) {
            ArrayList<String> satirData=new ArrayList<>();
            for (int j = 0; j < columnCount; j++) {
                satirData.add(sayfa.getRow(i).getCell(j).toString());

            }
            tablo.add(satirData);
        }


        return tablo;
    }
    public static void writeExcel(String path, Scenario scenario,String browserName,String time){
        File f=new File(path);
        if (f.exists()){
            XSSFWorkbook workbook=new XSSFWorkbook();
//            XSSFSheet sheet=new workbook.createSheet("Sayfa1");
//            Row

        }




    }

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> tablo=
                getListData("src/test/java/ApachePOI/resource/ApacheExcel2.xlsx","testCitizen",4);
        System.out.println("tablo = " + tablo);
    }
}
