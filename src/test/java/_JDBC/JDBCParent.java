package _JDBC;

import Constants.ConstantsDatabase;
import Utilities.DatabaseUtils;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCParent {

    private static Connection connection;
    protected static Statement statement;


    @BeforeTest
    public void DBConnectionOpen()
    {
        DatabaseUtils.loadProperties();
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

    @AfterTest
    public void DBConnectionClose()
    {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
