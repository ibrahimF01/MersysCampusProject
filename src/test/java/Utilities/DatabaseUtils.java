package Utilities;

import Constants.ConstantsDatabase;

import java.io.IOException;
import java.util.Properties;

public class DatabaseUtils {
    public static void loadProperties(){


        Properties properties=new Properties();
        try {
            properties.load(DatabaseUtils.class.getResourceAsStream("/configdatabase.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        ConstantsDatabase.dataUrl=properties.getProperty("dataUrl");
        ConstantsDatabase.dataUserName=properties.getProperty("dataUserName");
        ConstantsDatabase.dataPassword=properties.getProperty("dataPassword");

    }
}
