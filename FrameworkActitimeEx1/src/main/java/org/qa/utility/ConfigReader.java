package org.qa.utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	public Properties prop;
	String value = null;
	public Properties initProp(String key)
	{
		try
		{
			String path=System.getProperty("user.dir");
			FileInputStream fis= new FileInputStream(path+"\\src\\test\\resources\\org\\config\\config.properties");
		    prop=new Properties();
		    prop.load(fis);
		    value = prop.getProperty(key);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return prop;
	}
}
