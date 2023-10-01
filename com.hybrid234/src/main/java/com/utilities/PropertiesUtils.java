package com.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtils {

	public static FileInputStream fis=null;
	public static String readproperty(String key) {
		Properties prop = new Properties();
		String path= System.getProperty("user.dir");
		try {
			fis = new FileInputStream(path+"/src/main/resources/config.properties");
			prop.load(fis);
		}catch(Exception e) {
		}
		return prop.getProperty(key);
	}

}
