package Utilities;

import Constants.ConstantsDatabase;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.sql.*;
import java.util.ArrayList;

public class DBUtilitiy {
    private static Connection connection;
    private static Statement statement;


    private static void DBConnectionOpen()
    {
        String url= ConstantsDatabase.dataUrl;
        String username=ConstantsDatabase.dataUserName;
        String password=ConstantsDatabase.dataPassword;

        try {
            connection = DriverManager.getConnection(url, username, password);
            statement= connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    private static void DBConnectionClose()
    {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> tablo=getListData("select * from actor");
        for(ArrayList<String> satir:tablo ){
            System.out.println("satır = " + satir);
        }
    }

    public static ArrayList<ArrayList<String>> getListData(String sorgu){
        ArrayList<ArrayList<String>> tablo=new ArrayList<>();

        DBConnectionOpen();
        try {
        ResultSet rs=statement.executeQuery(sorgu);
        int columnSayisi=rs.getMetaData().getColumnCount();
        while (rs.next()){
            ArrayList<String> satir=new ArrayList<>();
            for (int i = 1; i <=columnSayisi; i++) {
                satir.add(rs.getString(i));

            }
            tablo.add(satir);

        }




        }
        catch (Exception ex){
            System.out.println("ex.getMessage() = " + ex.getMessage());
        }
        DBConnectionClose();

        return tablo;
    }
}
