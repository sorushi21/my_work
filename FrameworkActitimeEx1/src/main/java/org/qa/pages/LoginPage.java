package org.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver driver;
	@FindBy(css=".gLFyf.gsfi")
	private WebElement username;
	
	@FindBy(css="div[class='FPdoLc lJ9FBc'] input:first-child")
	private WebElement search;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void enterUserName(String name)
	{
		username.sendKeys(name);
	}
	public void clickButton()
	{
		search.click();
	}
	public void url(String url)
	{
		driver.get(url);
	}
	public String getTitle()
	{
		return driver.getTitle();
	}
}
