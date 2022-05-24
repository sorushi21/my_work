package org.applicationHooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.qa.driverFactory.DriverFactory;
import org.qa.utility.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ApplicationHooks {
 Properties prop;
private ConfigReader config;
private DriverFactory df;
private WebDriver driver;

	@Before(order=0)
	public void getProperty(String key)
	{
		config=new ConfigReader();
		prop=config.initProp(key);
	}
	
	@Before(order=1)
	public void launchBrowser()
	{
		//String bName=prop.getProperty("driver");
		String bName = "chrome";
		df= new DriverFactory();
		driver= df.init_driver(bName);
	}
	@After
	public void tearDown()
	{
		driver.quit();
	}
}
