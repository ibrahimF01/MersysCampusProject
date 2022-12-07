package Utilities;

import Constants.ConstantsClass;

import java.io.IOException;
import java.util.Properties;

public class CommonUtils {
    public static void loadProperties(){


        Properties properties=new Properties();
        try {
            properties.load(CommonUtils.class.getResourceAsStream("/configuration.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        ConstantsClass.AppUrl=properties.getProperty("AppUrl");
        ConstantsClass.Browser=properties.getProperty("Browser");
        ConstantsClass.UserName=properties.getProperty("UserName");
        ConstantsClass.Password=properties.getProperty("Password");

    }
}
