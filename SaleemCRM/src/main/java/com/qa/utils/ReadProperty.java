package com.qa.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperty {
	
	public static String getProperty(String PropertyKey) {
			
		String PropertyValue=null;
		Properties prop=new Properties();
		try {
			FileInputStream fis=new FileInputStream(".\\SaleemCRM\\src\\main\\resources\\Config.properties");
			prop.load(fis);
			PropertyValue=prop.getProperty(PropertyKey);
			if(PropertyValue==null) {
				throw new Exception("Property named "+PropertyKey+" not found");		
				}
		}catch(Exception e){
			e.printStackTrace();
		}
		return PropertyValue;
	}
}
