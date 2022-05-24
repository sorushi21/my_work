package org.qa.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ElementUtility {

	ConfigReader config;
	public Properties prop;
	public String value;
	public String getData(String key) throws IOException
	{
		
		
			String path=System.getProperty("user.dir");
			FileInputStream fis= new FileInputStream(path+"\\src\\test\\resources\\org\\config\\config.properties");
		    prop=new Properties();
		    prop.load(fis);
		   // fis.close();
		String value= prop.getProperty(key);
		
		return value;
	}
	
}
