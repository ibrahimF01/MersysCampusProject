package _JDBC.Tests;
import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Test01 extends JDBCParent{

    @Test
    public void test1() throws SQLException {

        ResultSet rs = statement.executeQuery("select * from language");
        ResultSetMetaData rsmd = rs.getMetaData();

        int columnCount = rsmd.getColumnCount();
        System.out.println("columnCount = " + columnCount);

        for (int i = 1; i <= columnCount; i++) {
            String columnName = rsmd.getColumnName(i);
            String columnType = rsmd.getColumnTypeName(i);

            System.out.print("columnName= " + columnName);
            System.out.println(",  columnType= " + columnType);
        }
    }

}
