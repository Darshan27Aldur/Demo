package qsp2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_script 
{
   //declaration
	@FindBy(id="email_container")
	private WebElement unTbox;
	@FindBy(id="pass")
	private WebElement pwdTbox;
	@FindBy(name="login")
	private WebElement loginButton;
	
	
	//initilization
	public Pom_script(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//utilization
	public void unData(String un)
	{
		unTbox.sendKeys(un);
	}
	public void pwdData(String pwd)
	{
		pwdTbox.sendKeys(pwd);
	}
	public void clickLogin()
	{
		loginButton.click();
		
	}
	}
